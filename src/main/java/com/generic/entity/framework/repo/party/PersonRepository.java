package com.generic.entity.framework.repo.party;

import com.generic.entity.framework.model.party.Person;
import com.generic.entity.framework.repo.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends GenericRepository<Person, Long> {
}