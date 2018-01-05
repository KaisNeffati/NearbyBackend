package io.nearbyou.dataaccessobject;

import io.nearbyou.domainObject.models.impl.DeliveriesDO;

import java.util.Collection;

/**
 * Created by Kais NEFFATI on 21/12/2017.
 */
public interface DeliveriesDao {
    Collection<DeliveriesDO> findAll();

    DeliveriesDO findOneById(long id);

    DeliveriesDO removeDeliveriesById(long id);

    DeliveriesDO updateDeliveries(DeliveriesDO deliveriesDO);

    DeliveriesDO insertDeliveries(DeliveriesDO deliveriesDO);
}
