package com.aniket.genericentitydemo.service.modelServices.party;

import com.aniket.genericentitydemo.model.party.Org;
import com.aniket.genericentitydemo.repo.party.OrgRepository;
import com.aniket.genericentitydemo.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrgService extends GenericServiceImpl<Org, Long> {
    public OrgService(OrgRepository repository) {
        super(repository);
    }
}
