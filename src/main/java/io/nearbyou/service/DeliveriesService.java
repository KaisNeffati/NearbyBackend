package io.nearbyou.service;

import io.nearbyou.domainObject.models.impl.DeliveriesDO;
import io.nearbyou.domainObject.requests.DeliveriesSearchRequest;

import java.util.Collection;

/**
 * Created by Kais NEFFATI on 04/01/2018.
 */
public interface DeliveriesService {
    Collection<DeliveriesDO> search(final DeliveriesSearchRequest request);

    DeliveriesDO create(DeliveriesDO deliveries);

    DeliveriesDO update(DeliveriesDO deliveries);

    Collection<DeliveriesDO> findAll();
}
