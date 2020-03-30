package com.electron.mfs.pg.agent.repository;

import com.electron.mfs.pg.agent.domain.AgentType;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the AgentType entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AgentTypeRepository extends JpaRepository<AgentType, Long> {

}
