package com.electron.mfs.pg.gateway.repository;

import com.electron.mfs.pg.gateway.domain.LimitType;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the LimitType entity.
 */
@SuppressWarnings("unused")
@Repository
public interface LimitTypeRepository extends JpaRepository<LimitType, Long> {

}
