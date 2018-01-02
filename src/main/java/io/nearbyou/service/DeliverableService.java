package io.nearbyou.service;

import io.nearbyou.dao.DeliveriesDao;
import io.nearbyou.domainObject.entities.repositories.DeliveriesRepository;
import io.nearbyou.domainObject.entities.Deliveries;
import io.nearbyou.domainObject.requests.DeliverableSearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Kais NEFFATI on 19/12/2017.
 */
@Service
public class DeliverableService {

    private final DeliveriesDao deliveriesDao;

    @Autowired
    public DeliverableService(@Qualifier("mongodb") DeliveriesDao deliveriesDao) {
        this.deliveriesDao = deliveriesDao;
    }

    public Collection<Deliveries> getAllDeliverable(DeliverableSearchRequest deliverableSearchRequest) {
        return deliveriesDao.getAllDeliveries();
    }

    public void addDeliveries(Deliveries deliveries) {
        deliveriesDao.insertDeliveries(deliveries);
    }
}
