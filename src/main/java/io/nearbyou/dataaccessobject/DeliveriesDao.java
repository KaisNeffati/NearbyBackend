package io.nearbyou.dataaccessobject;

import io.nearbyou.domainObject.models.impl.DeliveriesDO;

import java.util.List;

/**
 * Created by Kais NEFFATI on 21/12/2017.
 */
public interface DeliveriesDao {
    List<DeliveriesDO> findAll();

    DeliveriesDO findOneById(long id);

    DeliveriesDO removeDeliveriesById(long id);

    DeliveriesDO updateDeliveries(DeliveriesDO deliveriesDO);

    DeliveriesDO addDeliveries(DeliveriesDO deliveriesDO);
}
