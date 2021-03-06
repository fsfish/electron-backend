package com.electron.mfs.pg.mdm.service.mapper;

import com.electron.mfs.pg.mdm.domain.*;
import com.electron.mfs.pg.mdm.service.dto.PersonTypeDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link PersonType} and its DTO {@link PersonTypeDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface PersonTypeMapper extends EntityMapper<PersonTypeDTO, PersonType> {



    default PersonType fromId(Long id) {
        if (id == null) {
            return null;
        }
        PersonType personType = new PersonType();
        personType.setId(id);
        return personType;
    }
}
