package com.generic.entity.framework.service.modelServices.party.contactMech;

import com.generic.entity.framework.model.party.contactMech.PhoneNumber;
import com.generic.entity.framework.repo.party.contactMech.PhoneNumberRepository;
import com.generic.entity.framework.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PhoneNumberService extends GenericServiceImpl<PhoneNumber, Long> {
    public PhoneNumberService(PhoneNumberRepository repository) {
        super(repository);
    }
}
