package com.electron.mfs.pg.gateway.service.mapper;

import com.electron.mfs.pg.gateway.domain.*;
import com.electron.mfs.pg.gateway.service.dto.ServiceAuthenticationDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link ServiceAuthentication} and its DTO {@link ServiceAuthenticationDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ServiceAuthenticationMapper extends EntityMapper<ServiceAuthenticationDTO, ServiceAuthentication> {



    default ServiceAuthentication fromId(Long id) {
        if (id == null) {
            return null;
        }
        ServiceAuthentication serviceAuthentication = new ServiceAuthentication();
        serviceAuthentication.setId(id);
        return serviceAuthentication;
    }
}
