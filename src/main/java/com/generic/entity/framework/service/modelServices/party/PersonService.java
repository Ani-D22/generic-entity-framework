package com.generic.entity.framework.service.modelServices.party;

import com.generic.entity.framework.model.party.Person;
import com.generic.entity.framework.repo.party.PersonRepository;
import com.generic.entity.framework.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PersonService extends GenericServiceImpl<Person, Long> {
    public PersonService(PersonRepository repository) {
        super(repository);
    }
}
