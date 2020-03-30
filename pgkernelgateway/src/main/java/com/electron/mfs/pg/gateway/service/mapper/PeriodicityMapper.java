package com.electron.mfs.pg.gateway.service.mapper;

import com.electron.mfs.pg.gateway.domain.*;
import com.electron.mfs.pg.gateway.service.dto.PeriodicityDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Periodicity} and its DTO {@link PeriodicityDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface PeriodicityMapper extends EntityMapper<PeriodicityDTO, Periodicity> {



    default Periodicity fromId(Long id) {
        if (id == null) {
            return null;
        }
        Periodicity periodicity = new Periodicity();
        periodicity.setId(id);
        return periodicity;
    }
}
