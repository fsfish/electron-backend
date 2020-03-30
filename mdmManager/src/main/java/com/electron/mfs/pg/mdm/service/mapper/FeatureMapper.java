package com.electron.mfs.pg.mdm.service.mapper;

import com.electron.mfs.pg.mdm.domain.*;
import com.electron.mfs.pg.mdm.service.dto.FeatureDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Feature} and its DTO {@link FeatureDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface FeatureMapper extends EntityMapper<FeatureDTO, Feature> {



    default Feature fromId(Long id) {
        if (id == null) {
            return null;
        }
        Feature feature = new Feature();
        feature.setId(id);
        return feature;
    }
}
