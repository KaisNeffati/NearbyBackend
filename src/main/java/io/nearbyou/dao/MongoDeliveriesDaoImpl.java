package io.nearbyou.dao;

import io.nearbyou.domainObject.entities.Deliveries;
import io.nearbyou.domainObject.entities.repositories.DeliveriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by Kais NEFFATI on 21/12/2017.
 */
@Repository
@Qualifier("mongodb")
public class MongoDeliveriesDaoImpl implements DeliveriesDao {

    private final DeliveriesRepository deliveriesRepository;

    @Autowired
    public MongoDeliveriesDaoImpl(DeliveriesRepository deliveriesRepository) {
        this.deliveriesRepository = deliveriesRepository;
    }

    @Override
    public Collection<Deliveries> getAllDeliveries() {
        return deliveriesRepository.findAll();
    }

    @Override
    public Deliveries getDeliveriesById(long id) {
        return deliveriesRepository.findOne(id);
    }

    @Override
    public void removeDeliveriesById(long id) {
        deliveriesRepository.delete(id);
    }

    @Override
    public void updateDeliveries(Deliveries deliveries) {
        deliveriesRepository.save(deliveries);
    }

    @Override
    public void insertDeliveries(Deliveries deliveries) {
        deliveriesRepository.insert(deliveries);
    }
}
