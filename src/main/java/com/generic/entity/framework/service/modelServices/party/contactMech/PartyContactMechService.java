package com.generic.entity.framework.service.modelServices.party.contactMech;

import com.generic.entity.framework.model.party.contactMech.PartyContactMech;
import com.generic.entity.framework.repo.party.contactMech.PartyContactMechRepository;
import com.generic.entity.framework.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PartyContactMechService extends GenericServiceImpl<PartyContactMech, Long> {
    public PartyContactMechService(PartyContactMechRepository repository) {
        super(repository);
    }
}
