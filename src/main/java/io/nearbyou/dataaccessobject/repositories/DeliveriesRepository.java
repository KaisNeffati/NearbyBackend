package io.nearbyou.dataaccessobject.repositories;

import io.nearbyou.domainObject.models.impl.Deliveries;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 * Created by Kais NEFFATI on 19/12/2017.
 */
public interface DeliveriesRepository extends MongoRepository<Deliveries, Long> {
}
