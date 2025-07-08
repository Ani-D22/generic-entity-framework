package com.generic.entity.framework.repo.party.contactMech;

import com.generic.entity.framework.model.party.contactMech.ContactMech;
import com.generic.entity.framework.repo.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactMechRepository extends GenericRepository<ContactMech, Long> {
}
