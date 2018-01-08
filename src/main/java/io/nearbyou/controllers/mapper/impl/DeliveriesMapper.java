package io.nearbyou.controllers.mapper.impl;

import io.nearbyou.controllers.mapper.Mapper;
import io.nearbyou.datatransferobject.impl.DeliveriesDTO;
import io.nearbyou.datatransferobject.impl.DeliveriesDTO.DeliveriesDTOBuilder;
import io.nearbyou.domainObject.models.impl.DeliverableDO;
import io.nearbyou.domainObject.models.impl.DeliveriesDO;
import io.nearbyou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static io.nearbyou.datatransferobject.impl.DeliveriesDTO.newBuilder;

@Component
public class DeliveriesMapper implements Mapper<DeliveriesDO, DeliveriesDTO> {

    private final MediaMapper mediaMapper;

    private final DeliverableMapper deliverableMapper;

    private final UserService userService;

    @Autowired
    public DeliveriesMapper(MediaMapper mediaMapper, DeliverableMapper deliveriesMapper, UserService userService) {
        this.mediaMapper = mediaMapper;
        this.deliverableMapper = deliveriesMapper;
        this.userService = userService;
    }

    @Override
    @SuppressWarnings("unchecked")
    public DeliveriesDO makeDO(DeliveriesDTO dTO) {
        List<DeliverableDO> deliverableDOItems = deliverableMapper.makeDOList(dTO.getDeliverableDTOs());
        DeliveriesDO deliveriesDO = new DeliveriesDO(dTO.getId(), dTO.getTitle(), dTO.getDescription(), dTO.getLocation(),
                dTO.getMediaIds(), dTO.getRadius(), deliverableDOItems
                , userService.getUsetById(dTO.getUserId()));
        deliverableDOItems.forEach(e -> e.setPartOfDeliveries(deliveriesDO));
        return deliveriesDO;
    }

    @Override
    @SuppressWarnings("unchecked")
    public DeliveriesDTO makeDTO(DeliveriesDO dO) {
        DeliveriesDTOBuilder deliveriesDTOBuilder = newBuilder()
                .setTitle(dO.getTitle())
                .setDescription(dO.getDescription())
                .setLocation(dO.getLocation())
                .setRadius(dO.getRadius())
//                .setUserID(dO.getUsers().getId())
                .setDeliverableDTOs(deliverableMapper.makeDTOList(dO.getDeliverableDOItems()))
                .setMediaIds(dO.getMediaIds());
        return deliveriesDTOBuilder.createDeliveriesDTO();
    }

    @Override
    public DeliveriesDO updateDO(DeliveriesDO dO, DeliveriesDTO dTO) {
        return null;
    }
}
