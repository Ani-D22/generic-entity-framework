package com.generic.entity.framework.service.modelServices.party.role;

import com.generic.entity.framework.model.party.role.PartyRole;
import com.generic.entity.framework.repo.party.role.PartyRoleRepository;
import com.generic.entity.framework.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PartyRoleService extends GenericServiceImpl<PartyRole, Long> {
    public PartyRoleService(PartyRoleRepository repository) {
        super(repository);
    }
}
