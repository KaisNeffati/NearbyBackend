package io.nearbyou.dataaccessobject.impl;

import io.nearbyou.dataaccessobject.DeliveriesDao;
import io.nearbyou.dataaccessobject.repositories.DeliveriesRepository;
import io.nearbyou.domainObject.models.impl.DeliveriesDO;
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
    public Collection<DeliveriesDO> findAll() {
        return deliveriesRepository.findAll();
    }

    @Override
    public DeliveriesDO findOneById(long id) {
        return deliveriesRepository.findOne(id);
    }

    @Override
    public DeliveriesDO removeDeliveriesById(long id) {
        return null;
    }

    @Override
    public DeliveriesDO updateDeliveries(DeliveriesDO deliveriesDO) {
        return deliveriesRepository.save(deliveriesDO);
    }

    @Override
    public DeliveriesDO insertDeliveries(DeliveriesDO deliveriesDO) {
        return deliveriesRepository.insert(deliveriesDO);
    }

}
