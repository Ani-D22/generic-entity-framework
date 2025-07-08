package com.generic.entity.framework.service.modelServices.party.role;

import com.generic.entity.framework.model.party.role.PartyRelationship;
import com.generic.entity.framework.repo.party.role.PartyRelationshipRepository;
import com.generic.entity.framework.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PartyRelationshipService extends GenericServiceImpl<PartyRelationship, Long> {
    public PartyRelationshipService(PartyRelationshipRepository repository) {
        super(repository);
    }
}
