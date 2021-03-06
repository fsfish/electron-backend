package com.electron.mfs.pg.gateway.service.mapper;

import com.electron.mfs.pg.gateway.domain.*;
import com.electron.mfs.pg.gateway.service.dto.PartnerSecurityDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link PartnerSecurity} and its DTO {@link PartnerSecurityDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface PartnerSecurityMapper extends EntityMapper<PartnerSecurityDTO, PartnerSecurity> {



    default PartnerSecurity fromId(Long id) {
        if (id == null) {
            return null;
        }
        PartnerSecurity partnerSecurity = new PartnerSecurity();
        partnerSecurity.setId(id);
        return partnerSecurity;
    }
}
