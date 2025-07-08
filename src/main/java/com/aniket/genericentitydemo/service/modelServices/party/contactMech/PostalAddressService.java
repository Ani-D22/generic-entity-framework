package com.aniket.genericentitydemo.service.modelServices.party.contactMech;

import com.aniket.genericentitydemo.model.party.contactMech.PostalAddress;
import com.aniket.genericentitydemo.repo.party.contactMech.PostalAddressRepository;
import com.aniket.genericentitydemo.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PostalAddressService extends GenericServiceImpl<PostalAddress, Long> {
    public PostalAddressService(PostalAddressRepository repository) {
        super(repository);
    }
}
