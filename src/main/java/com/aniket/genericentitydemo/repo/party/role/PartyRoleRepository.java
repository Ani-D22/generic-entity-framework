package com.aniket.genericentitydemo.repo.party.role;

import com.aniket.genericentitydemo.model.party.role.PartyRole;
import com.aniket.genericentitydemo.repo.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRoleRepository extends GenericRepository<PartyRole, Long> {
}
