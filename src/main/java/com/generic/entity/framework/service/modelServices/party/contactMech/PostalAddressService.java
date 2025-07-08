package com.generic.entity.framework.service.modelServices.party.contactMech;

import com.generic.entity.framework.model.party.contactMech.PostalAddress;
import com.generic.entity.framework.repo.party.contactMech.PostalAddressRepository;
import com.generic.entity.framework.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PostalAddressService extends GenericServiceImpl<PostalAddress, Long> {
    public PostalAddressService(PostalAddressRepository repository) {
        super(repository);
    }
}
