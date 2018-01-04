package io.nearbyou.service;

import io.nearbyou.domainObject.models.impl.Deliveries;
import io.nearbyou.domainObject.requests.DeliveriesSearchRequest;

import java.util.Collection;

/**
 * Created by Kais NEFFATI on 04/01/2018.
 */
public interface DeliveriesSerivce {
    Collection<Deliveries> search(final DeliveriesSearchRequest request);
    Deliveries create(Deliveries deliveries);
    Deliveries update(Deliveries deliveries);
    Collection<Deliveries> findAll();
}
