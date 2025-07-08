package com.aniket.genericentitydemo.service.modelServices.party.contactMech;

import com.aniket.genericentitydemo.model.party.contactMech.ContactMech;
import com.aniket.genericentitydemo.repo.party.contactMech.ContactMechRepository;
import com.aniket.genericentitydemo.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ContactMechService extends GenericServiceImpl<ContactMech, Long> {
    public ContactMechService(ContactMechRepository repository) {
        super(repository);
    }
}
