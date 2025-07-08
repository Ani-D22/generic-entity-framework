package com.aniket.genericentitydemo.repo.party;

import com.aniket.genericentitydemo.model.party.Org;
import com.aniket.genericentitydemo.repo.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrgRepository extends GenericRepository<Org, Long> {
}
