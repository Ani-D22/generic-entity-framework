package com.generic.entity.framework.repo.party.role;

import com.generic.entity.framework.model.party.role.PartyRelationship;
import com.generic.entity.framework.repo.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRelationshipRepository extends GenericRepository<PartyRelationship, Long> {
}
