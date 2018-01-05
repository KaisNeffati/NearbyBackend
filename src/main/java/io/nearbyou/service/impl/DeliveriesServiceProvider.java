package io.nearbyou.service.impl;

import io.nearbyou.dataaccessobject.DeliveriesDao;
import io.nearbyou.domainObject.models.impl.DeliveriesDO;
import io.nearbyou.domainObject.requests.DeliveriesSearchRequest;
import io.nearbyou.service.DeliveriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Kais NEFFATI on 04/01/2018.
 */
@Service
public class DeliveriesServiceProvider implements DeliveriesService {

    private final DeliveriesDao deliveriesDao;

    @Autowired
    public DeliveriesServiceProvider(@Qualifier("mongodb") DeliveriesDao deliveriesDao) {
        this.deliveriesDao = deliveriesDao;
    }

    @Override
    public Collection<DeliveriesDO> search(DeliveriesSearchRequest request) {
        return null;
    }

    @Override
    public DeliveriesDO create(DeliveriesDO deliveries) {
        return deliveriesDao.insertDeliveries(deliveries);
    }

    @Override
    public DeliveriesDO update(DeliveriesDO deliveries) {
        return deliveriesDao.updateDeliveries(deliveries);
    }

    @Override
    public Collection<DeliveriesDO> findAll() {
        return deliveriesDao.findAll();
    }

}
