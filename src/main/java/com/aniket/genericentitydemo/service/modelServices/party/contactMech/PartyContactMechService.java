package com.aniket.genericentitydemo.service.modelServices.party.contactMech;

import com.aniket.genericentitydemo.model.party.contactMech.PartyContactMech;
import com.aniket.genericentitydemo.repo.party.contactMech.PartyContactMechRepository;
import com.aniket.genericentitydemo.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PartyContactMechService extends GenericServiceImpl<PartyContactMech, Long> {
    public PartyContactMechService(PartyContactMechRepository repository) {
        super(repository);
    }
}
