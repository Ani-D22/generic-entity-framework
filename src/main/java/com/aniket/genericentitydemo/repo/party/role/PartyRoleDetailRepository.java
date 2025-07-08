package com.aniket.genericentitydemo.repo.party.role;

import com.aniket.genericentitydemo.model.party.role.PartyRoleDetail;
import com.aniket.genericentitydemo.repo.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRoleDetailRepository extends GenericRepository<PartyRoleDetail, Long> {
}
