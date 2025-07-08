package com.generic.entity.framework.service.modelServices.party;

import com.generic.entity.framework.model.party.Party;
import com.generic.entity.framework.repo.party.PartyRepository;
import com.generic.entity.framework.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PartyService extends GenericServiceImpl<Party, Long> {
    public PartyService(PartyRepository repository) {
        super(repository);
    }
}
