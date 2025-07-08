package com.aniket.genericentitydemo.repo.party.role;

import com.aniket.genericentitydemo.model.party.role.PartyRelationship;
import com.aniket.genericentitydemo.repo.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRelationshipRepository extends GenericRepository<PartyRelationship, Long> {
}
