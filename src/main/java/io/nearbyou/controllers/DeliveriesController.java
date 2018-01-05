package io.nearbyou.controllers;

import io.nearbyou.controllers.mapper.impl.DeliveriesMapper;
import io.nearbyou.datatransferobject.impl.DeliveriesDTO;
import io.nearbyou.domainObject.models.impl.DeliveriesDO;
import io.nearbyou.domainObject.requests.DeliveriesSearchRequest;
import io.nearbyou.service.DeliveriesService;
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

    private final DeliveriesService deliveriesSerivce;

    private DeliveriesMapper mapper;

    @Autowired
    public DeliveriesController(DeliveriesService deliveriesSerivce) {
        this.deliveriesSerivce = deliveriesSerivce;
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
        return mapper.makeDTO(deliveriesSerivce.create(deliveriesDO));
    }

    @PutMapping("/")
    public DeliveriesDO update(@RequestBody DeliveriesDO request) {
        return deliveriesSerivce.update(request);
    }

}
