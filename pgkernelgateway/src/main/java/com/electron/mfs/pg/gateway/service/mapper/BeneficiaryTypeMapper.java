package com.electron.mfs.pg.gateway.service.mapper;

import com.electron.mfs.pg.gateway.domain.*;
import com.electron.mfs.pg.gateway.service.dto.BeneficiaryTypeDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link BeneficiaryType} and its DTO {@link BeneficiaryTypeDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface BeneficiaryTypeMapper extends EntityMapper<BeneficiaryTypeDTO, BeneficiaryType> {



    default BeneficiaryType fromId(Long id) {
        if (id == null) {
            return null;
        }
        BeneficiaryType beneficiaryType = new BeneficiaryType();
        beneficiaryType.setId(id);
        return beneficiaryType;
    }
}
