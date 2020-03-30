package com.electron.mfs.pg.gateway.repository;

import com.electron.mfs.pg.gateway.domain.PersonDocument;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the PersonDocument entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PersonDocumentRepository extends JpaRepository<PersonDocument, Long> {

}
