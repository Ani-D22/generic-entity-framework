package com.generic.entity.framework.service.modelServices.party.contactMech;

import com.generic.entity.framework.model.party.contactMech.ContactMech;
import com.generic.entity.framework.repo.party.contactMech.ContactMechRepository;
import com.generic.entity.framework.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ContactMechService extends GenericServiceImpl<ContactMech, Long> {
    public ContactMechService(ContactMechRepository repository) {
        super(repository);
    }
}
