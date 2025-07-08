package com.aniket.genericentitydemo.repo.party.contactMech;

import com.aniket.genericentitydemo.model.party.contactMech.ContactMech;
import com.aniket.genericentitydemo.repo.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactMechRepository extends GenericRepository<ContactMech, Long> {
}
