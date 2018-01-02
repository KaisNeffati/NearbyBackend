package io.nearbyou.domainObject.entities.repositories;

import io.nearbyou.domainObject.entities.Deliveries;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 * Created by Kais NEFFATI on 19/12/2017.
 */
public interface DeliveriesRepository extends MongoRepository<Deliveries, Long> {
}
