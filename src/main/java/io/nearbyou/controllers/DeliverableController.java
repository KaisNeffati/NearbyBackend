package io.nearbyou.controllers;

import io.nearbyou.domainObject.entities.Deliveries;
import io.nearbyou.domainObject.requests.DeliverableSearchRequest;
import io.nearbyou.service.DeliverableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Kais NEFFATI on 19/12/2017.
 */
@Controller()
@RequestMapping("/deliverables")
public class DeliverableController {

    @Autowired
    private DeliverableService deliverableService;

    @PostMapping("/")
    public void getAllDeliverable(@RequestBody DeliverableSearchRequest deliverableSearchRequest) {
        deliverableService.getAllDeliverable(deliverableSearchRequest);
    }

    @PostMapping("/add")
    public void addDeliveries(@RequestBody Deliveries deliveries) {
        deliverableService.addDeliveries(deliveries);
    }
}
