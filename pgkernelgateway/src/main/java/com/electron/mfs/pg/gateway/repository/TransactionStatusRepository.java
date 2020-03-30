package com.electron.mfs.pg.gateway.repository;

import com.electron.mfs.pg.gateway.domain.TransactionStatus;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the TransactionStatus entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TransactionStatusRepository extends JpaRepository<TransactionStatus, Long> {

}
