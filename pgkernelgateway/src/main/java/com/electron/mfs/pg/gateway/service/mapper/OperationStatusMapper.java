package com.electron.mfs.pg.gateway.service.mapper;

import com.electron.mfs.pg.gateway.domain.*;
import com.electron.mfs.pg.gateway.service.dto.OperationStatusDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link OperationStatus} and its DTO {@link OperationStatusDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface OperationStatusMapper extends EntityMapper<OperationStatusDTO, OperationStatus> {



    default OperationStatus fromId(Long id) {
        if (id == null) {
            return null;
        }
        OperationStatus operationStatus = new OperationStatus();
        operationStatus.setId(id);
        return operationStatus;
    }
}
