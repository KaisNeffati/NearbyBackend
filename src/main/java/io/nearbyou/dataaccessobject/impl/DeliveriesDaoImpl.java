package io.nearbyou.dataaccessobject.impl;

import io.nearbyou.dataaccessobject.DeliveriesDao;
import io.nearbyou.domainObject.models.impl.Deliveries;
import io.nearbyou.dataaccessobject.repositories.DeliveriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by Kais NEFFATI on 21/12/2017.
 */
@Repository
@Qualifier("mongodb")
public class DeliveriesDaoImpl implements DeliveriesDao {

    private final DeliveriesRepository deliveriesRepository;

    @Autowired
    public DeliveriesDaoImpl(DeliveriesRepository deliveriesRepository) {
        this.deliveriesRepository = deliveriesRepository;
    }

    @Override
    public Collection<Deliveries> findAll() {
        return deliveriesRepository.findAll();
    }

    @Override
    public Deliveries findOneById(long id) {
        return deliveriesRepository.findOne(id);
    }

    @Override
    public Deliveries removeDeliveriesById(long id) {
        return null;
    }

    @Override
    public Deliveries updateDeliveries(Deliveries deliveries) {
        return deliveriesRepository.save(deliveries);
    }

    @Override
    public Deliveries insertDeliveries(Deliveries deliveries) {
        return deliveriesRepository.insert(deliveries);
    }

}
