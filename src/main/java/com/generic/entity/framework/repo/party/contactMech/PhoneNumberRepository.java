package com.generic.entity.framework.repo.party.contactMech;

import com.generic.entity.framework.model.party.contactMech.PhoneNumber;
import com.generic.entity.framework.repo.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneNumberRepository extends GenericRepository<PhoneNumber, Long> {
}
