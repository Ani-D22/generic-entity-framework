package com.aniket.genericentitydemo.service.modelServices.party;

import com.aniket.genericentitydemo.model.party.Person;
import com.aniket.genericentitydemo.repo.party.PersonRepository;
import com.aniket.genericentitydemo.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PersonService extends GenericServiceImpl<Person, Long> {
    public PersonService(PersonRepository repository) {
        super(repository);
    }
}
