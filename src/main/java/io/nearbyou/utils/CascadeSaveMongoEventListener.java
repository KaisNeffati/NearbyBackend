package io.nearbyou.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mapping.model.MappingException;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;

@Component
public class CascadeSaveMongoEventListener extends AbstractMongoEventListener<Object> {

    private final MongoOperations mongoOperations;

    @Autowired
    public CascadeSaveMongoEventListener(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    @Override
    public void onBeforeConvert(final BeforeConvertEvent<Object> event) {
        final Object source = event.getSource();

        ReflectionUtils.doWithFields(source.getClass(), new ReflectionUtils.FieldCallback() {

            @Override
            public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {
                ReflectionUtils.makeAccessible(field);

                boolean assignableFrom = Collection.class.isAssignableFrom(field.getType());
                if (field.isAnnotationPresent(DBRef.class) && field.isAnnotationPresent(CascadeSave.class) && (!assignableFrom)) {
                    final Object fieldValue = field.get(source);

                    DbRefFieldCallback callback = new DbRefFieldCallback();

                    ReflectionUtils.doWithFields(fieldValue.getClass(), callback);

                    if (!callback.isIdFound()) {
                        throw new MappingException("Cannot perform cascade save on child object without id set");
                    }

                    mongoOperations.save(fieldValue);
                } else if (field.isAnnotationPresent(DBRef.class) && field.isAnnotationPresent(CascadeSave.class) && assignableFrom) {
                    final List fieldValue = (List) field.get(source);
                    for (Object f : fieldValue) {
                        DbRefFieldCallback callback = new DbRefFieldCallback();

                        ReflectionUtils.doWithFields(f.getClass(), callback);

                        if (!callback.isIdFound()) {
                            throw new MappingException("Cannot perform cascade save on child object without id set");
                        }

                        mongoOperations.save(f);
                    }

                }
            }
        });
    }

    private static class DbRefFieldCallback implements ReflectionUtils.FieldCallback {
        private boolean idFound;

        public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {
            ReflectionUtils.makeAccessible(field);

            if (field.isAnnotationPresent(Id.class)) {
                idFound = true;
            }
        }

        public boolean isIdFound() {
            return idFound;
        }
    }
}