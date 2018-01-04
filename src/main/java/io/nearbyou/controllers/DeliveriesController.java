package io.nearbyou.controllers;

import io.nearbyou.domainObject.models.impl.Deliveries;
import io.nearbyou.domainObject.requests.DeliveriesSearchRequest;
import io.nearbyou.service.DeliveriesSerivce;
import io.nearbyou.service.impl.DeliveriesServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by Kais NEFFATI on 04/01/2018.
 */
@Controller
@RequestMapping("/deliveries")
public class DeliveriesController {

    private final DeliveriesSerivce deliveriesSerivce;

    @Autowired
    public DeliveriesController(DeliveriesSerivce deliveriesSerivce) {
        this.deliveriesSerivce = deliveriesSerivce;
    }

    @GetMapping("/")
    public Collection<Deliveries> findAll() {
        return deliveriesSerivce.findAll();
    }

    @PostMapping("/search")
    public Collection<Deliveries> search(@RequestBody DeliveriesSearchRequest request) {
        return deliveriesSerivce.search(request);
    }

    @PostMapping("/")
    public Deliveries create(@RequestBody Deliveries request) {
        return deliveriesSerivce.create(request);
    }

    @PutMapping("/")
    public Deliveries update(@RequestBody Deliveries request) {
        return deliveriesSerivce.update(request);
    }

}
