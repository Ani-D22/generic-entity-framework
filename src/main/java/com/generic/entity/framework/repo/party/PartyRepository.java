package com.generic.entity.framework.repo.party;

import com.generic.entity.framework.model.party.Party;
import com.generic.entity.framework.repo.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRepository extends GenericRepository<Party, Long> {
}
