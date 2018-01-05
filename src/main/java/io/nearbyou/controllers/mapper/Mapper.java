package io.nearbyou.controllers.mapper;

import io.nearbyou.datatransferobject.DTO;
import io.nearbyou.domainObject.models.PersistedEntity;

import java.util.List;
import java.util.stream.Collectors;

public interface Mapper<T extends PersistedEntity, D extends DTO> {

    T makeDO(D dTO);

    D makeDTO(T dO);

    T updateDO(T dO, D dTO);

    default List makeDTOList(final List<T> dO) {
        return dO.stream()
                .map(this::makeDTO)
                .collect(Collectors.toList());
    }

    default List makeDOList(final List<D> dTO) {
        return dTO.stream()
                .map(this::makeDO)
                .collect(Collectors.toList());
    }

}