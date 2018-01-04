package io.nearbyou.dataaccessobject;

import io.nearbyou.domainObject.models.impl.Deliveries;

import java.util.Collection;

/**
 * Created by Kais NEFFATI on 21/12/2017.
 */
public interface DeliveriesDao {
    Collection<Deliveries> findAll();

    Deliveries findOneById(long id);

    Deliveries removeDeliveriesById(long id);

    Deliveries updateDeliveries(Deliveries deliveries);

    Deliveries insertDeliveries(Deliveries deliveries);
}
