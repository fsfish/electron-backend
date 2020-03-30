package com.electron.mfs.pg.pg8583client.repository;

import com.electron.mfs.pg.pg8583client.domain.Pg8583Status;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Pg8583Status entity.
 */
@SuppressWarnings("unused")
@Repository
public interface Pg8583StatusRepository extends JpaRepository<Pg8583Status, Long> {

}
