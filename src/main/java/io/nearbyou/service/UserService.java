package io.nearbyou.service;

import io.nearbyou.domainObject.models.impl.User;


public interface UserService {
    User getUsetById(long id);
}
