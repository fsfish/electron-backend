package com.electron.mfs.pg.transactions.service.mapper;

import com.electron.mfs.pg.transactions.domain.*;
import com.electron.mfs.pg.transactions.service.dto.InternalConnectorRequestDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link InternalConnectorRequest} and its DTO {@link InternalConnectorRequestDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface InternalConnectorRequestMapper extends EntityMapper<InternalConnectorRequestDTO, InternalConnectorRequest> {



    default InternalConnectorRequest fromId(Long id) {
        if (id == null) {
            return null;
        }
        InternalConnectorRequest internalConnectorRequest = new InternalConnectorRequest();
        internalConnectorRequest.setId(id);
        return internalConnectorRequest;
    }
}
