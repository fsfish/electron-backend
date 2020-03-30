package com.electron.mfs.pg.gateway.repository;

import com.electron.mfs.pg.gateway.domain.AccountType;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the AccountType entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType, Long> {

}
