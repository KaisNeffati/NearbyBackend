package io.nearbyou.controllers.mapper.impl;

import io.nearbyou.controllers.mapper.Mapper;
import io.nearbyou.datatransferobject.impl.DeliverableDTO;
import io.nearbyou.domainObject.models.impl.DeliverableDO;
import org.springframework.beans.factory.annotation.Autowired;


public class DeliverableMapper implements Mapper<DeliverableDO, DeliverableDTO> {
    private final MediaMapper mediaMapper;

    @Autowired
    public DeliverableMapper(MediaMapper mediaMapper) {
        this.mediaMapper = mediaMapper;
    }

    @Override
    public DeliverableDO makeDO(DeliverableDTO dTO) {
        return new DeliverableDO(dTO.getId(), dTO.getTitle(), dTO.getQuantities(), dTO.getPrice(), dTO.getCurrency(),
                mediaMapper.saveList(dTO.getMediaFiles()));
    }

    @Override
    public DeliverableDTO makeDTO(DeliverableDO dO) {
        return null;
    }

    @Override
    public DeliverableDO updateDO(DeliverableDO dO, DeliverableDTO dTO) {
        return null;
    }
}
