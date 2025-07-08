package com.generic.entity.framework.repo.party;

import com.generic.entity.framework.model.party.Org;
import com.generic.entity.framework.repo.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrgRepository extends GenericRepository<Org, Long> {
}
