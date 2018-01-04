package io.nearbyou.service.impl;

import io.nearbyou.dataaccessobject.DeliveriesDao;
import io.nearbyou.domainObject.models.impl.Deliveries;
import io.nearbyou.domainObject.requests.DeliveriesSearchRequest;
import io.nearbyou.service.DeliveriesSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Kais NEFFATI on 04/01/2018.
 */
@Service
public class DeliveriesServiceProvider implements DeliveriesSerivce {

    private final DeliveriesDao deliveriesDao;

    @Autowired
    public DeliveriesServiceProvider(@Qualifier("mongodb") DeliveriesDao deliveriesDao) {
        this.deliveriesDao = deliveriesDao;
    }

    @Override
    public Collection<Deliveries> search(DeliveriesSearchRequest request) {
        return null;
    }

    @Override
    public Deliveries create(Deliveries deliveries) {
        return deliveriesDao.insertDeliveries(deliveries);
    }

    @Override
    public Deliveries update(Deliveries deliveries) {
        return deliveriesDao.updateDeliveries(deliveries);
    }

    @Override
    public Collection<Deliveries> findAll() {
        return deliveriesDao.findAll();
    }
}
