package com.aniket.genericentitydemo.repo.party;

import com.aniket.genericentitydemo.model.party.Party;
import com.aniket.genericentitydemo.repo.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRepository extends GenericRepository<Party, Long> {
}
