package com.aniket.genericentitydemo.service.modelServices.party.role;

import com.aniket.genericentitydemo.model.party.role.PartyRelationship;
import com.aniket.genericentitydemo.repo.party.role.PartyRelationshipRepository;
import com.aniket.genericentitydemo.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PartyRelationshipService extends GenericServiceImpl<PartyRelationship, Long> {
    public PartyRelationshipService(PartyRelationshipRepository repository) {
        super(repository);
    }
}
