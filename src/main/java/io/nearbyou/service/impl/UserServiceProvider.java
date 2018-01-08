package io.nearbyou.service.impl;

import io.nearbyou.domainObject.models.impl.User;
import io.nearbyou.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by Kais NEFFATI on 08/01/2018.
 */
@Service
public class UserServiceProvider implements UserService {
    @Override
    public User getUsetById(long id) {
        return null;
    }
}
