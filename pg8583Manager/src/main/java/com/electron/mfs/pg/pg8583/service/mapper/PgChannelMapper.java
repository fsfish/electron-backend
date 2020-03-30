package com.electron.mfs.pg.pg8583.service.mapper;

import com.electron.mfs.pg.pg8583.domain.*;
import com.electron.mfs.pg.pg8583.service.dto.PgChannelDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link PgChannel} and its DTO {@link PgChannelDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface PgChannelMapper extends EntityMapper<PgChannelDTO, PgChannel> {



    default PgChannel fromId(Long id) {
        if (id == null) {
            return null;
        }
        PgChannel pgChannel = new PgChannel();
        pgChannel.setId(id);
        return pgChannel;
    }
}
