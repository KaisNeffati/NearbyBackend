package io.nearbyou.dao;

import io.nearbyou.domainObject.entities.Deliveries;

import java.util.Collection;

/**
 * Created by Kais NEFFATI on 21/12/2017.
 */
public interface DeliveriesDao {
    Collection<Deliveries> getAllDeliveries();

    Deliveries getDeliveriesById(long id);

    void removeDeliveriesById(long id);

    void updateDeliveries(Deliveries deliveries);

    void insertDeliveries(Deliveries deliveries);
}
