package io.nearbyou.controllers.mapper.impl;

import io.nearbyou.controllers.mapper.Mapper;
import io.nearbyou.datatransferobject.impl.DeliverableDTO;
import io.nearbyou.datatransferobject.impl.DeliverableDTO.DeliverableDTOBuilder;
import io.nearbyou.domainObject.models.impl.DeliverableDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static io.nearbyou.datatransferobject.impl.DeliverableDTO.newBuilder;

@Component
public class DeliverableMapper implements Mapper<DeliverableDO, DeliverableDTO> {
    private final MediaMapper mediaMapper;

    @Autowired
    public DeliverableMapper(MediaMapper mediaMapper) {
        this.mediaMapper = mediaMapper;
    }

    @Override
    public DeliverableDO makeDO(DeliverableDTO dTO) {
        return new DeliverableDO(dTO.getId(), dTO.getTitle(), dTO.getQuantities(), dTO.getPrice(), dTO.getCurrency(),
                dTO.getMediaIds());
    }

    @Override
    public DeliverableDTO makeDTO(DeliverableDO dO) {
        DeliverableDTOBuilder deliverableDTOBuilder = newBuilder()
                .setTitle(dO.getTitle())
                .setId(dO.getId())
                .setPrice(dO.getPrice())
                .setQuantities(dO.getQuantities())
                .setMediaIds(dO.getMediaIds());
        return deliverableDTOBuilder.createDeliveriesDTO();
    }

    @Override
    public DeliverableDO updateDO(DeliverableDO dO, DeliverableDTO dTO) {
        return null;
    }
}
