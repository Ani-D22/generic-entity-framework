package com.aniket.genericentitydemo.service.modelServices.party.contactMech;

import com.aniket.genericentitydemo.model.party.contactMech.PhoneNumber;
import com.aniket.genericentitydemo.repo.party.contactMech.PhoneNumberRepository;
import com.aniket.genericentitydemo.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PhoneNumberService extends GenericServiceImpl<PhoneNumber, Long> {
    public PhoneNumberService(PhoneNumberRepository repository) {
        super(repository);
    }
}
