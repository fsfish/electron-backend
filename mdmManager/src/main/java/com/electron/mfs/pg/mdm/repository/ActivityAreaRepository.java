package com.electron.mfs.pg.mdm.repository;

import com.electron.mfs.pg.mdm.domain.ActivityArea;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ActivityArea entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ActivityAreaRepository extends JpaRepository<ActivityArea, Long> {

}
