package io.nearbyou.controllers;

import io.nearbyou.controllers.mapper.impl.DeliveriesMapper;
import io.nearbyou.datatransferobject.impl.DeliveriesDTO;
import io.nearbyou.domainObject.models.impl.DeliveriesDO;
import io.nearbyou.domainObject.requests.DeliveriesSearchRequest;
import io.nearbyou.service.DeliveriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by Kais NEFFATI on 04/01/2018.
 */
@RestController
@RequestMapping("/deliveries")
public class DeliveriesController {

    private final DeliveriesService deliveriesSerivce;

    private final DeliveriesMapper mapper;

    @Autowired
    public DeliveriesController(DeliveriesService deliveriesSerivce, DeliveriesMapper mapper) {
        this.deliveriesSerivce = deliveriesSerivce;
        this.mapper = mapper;
    }

    @GetMapping("/")
    public Collection<DeliveriesDO> findAll() {
        return deliveriesSerivce.findAll();
    }

    @PostMapping("/search")
    public Collection<DeliveriesDO> search(@RequestBody DeliveriesSearchRequest request) {
        return deliveriesSerivce.search(request);
    }

    @PostMapping("/")
    public DeliveriesDTO create(@RequestBody DeliveriesDTO deliveriesDTO) {
        DeliveriesDO deliveriesDO = mapper.makeDO(deliveriesDTO);
        DeliveriesDO dO = deliveriesSerivce.create(deliveriesDO);
        DeliveriesDTO deliveriesDTO1 = mapper.makeDTO(dO);
        return deliveriesDTO1;
    }

    @PutMapping("/")
    public DeliveriesDO update(@RequestBody DeliveriesDO request) {
        return deliveriesSerivce.update(request);
    }

}
