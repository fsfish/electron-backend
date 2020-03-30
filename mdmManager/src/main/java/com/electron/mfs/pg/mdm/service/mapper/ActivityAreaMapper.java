package com.electron.mfs.pg.mdm.service.mapper;

import com.electron.mfs.pg.mdm.domain.*;
import com.electron.mfs.pg.mdm.service.dto.ActivityAreaDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link ActivityArea} and its DTO {@link ActivityAreaDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ActivityAreaMapper extends EntityMapper<ActivityAreaDTO, ActivityArea> {



    default ActivityArea fromId(Long id) {
        if (id == null) {
            return null;
        }
        ActivityArea activityArea = new ActivityArea();
        activityArea.setId(id);
        return activityArea;
    }
}
