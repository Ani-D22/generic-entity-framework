package com.aniket.genericentitydemo.repo.party.contactMech;

import com.aniket.genericentitydemo.model.party.contactMech.PartyContactMech;
import com.aniket.genericentitydemo.repo.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyContactMechRepository extends GenericRepository<PartyContactMech, Long> {
}
