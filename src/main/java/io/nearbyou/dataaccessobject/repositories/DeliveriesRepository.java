package io.nearbyou.dataaccessobject.repositories;

import io.nearbyou.domainObject.models.impl.DeliveriesDO;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface DeliveriesRepository extends MongoRepository<DeliveriesDO, Long> {
}
