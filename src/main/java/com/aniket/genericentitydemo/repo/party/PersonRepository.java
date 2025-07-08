package com.aniket.genericentitydemo.repo.party;

import com.aniket.genericentitydemo.model.party.Person;
import com.aniket.genericentitydemo.repo.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends GenericRepository<Person, Long> {
}