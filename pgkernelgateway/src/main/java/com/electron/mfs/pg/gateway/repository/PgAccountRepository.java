package com.electron.mfs.pg.gateway.repository;

import com.electron.mfs.pg.gateway.domain.PgAccount;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the PgAccount entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PgAccountRepository extends JpaRepository<PgAccount, Long> {

}
