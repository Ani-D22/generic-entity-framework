package com.generic.entity.framework.service.modelServices.party;

import com.generic.entity.framework.model.party.Org;
import com.generic.entity.framework.repo.party.OrgRepository;
import com.generic.entity.framework.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrgService extends GenericServiceImpl<Org, Long> {
    public OrgService(OrgRepository repository) {
        super(repository);
    }
}
