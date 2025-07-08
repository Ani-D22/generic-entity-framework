package com.aniket.genericentitydemo.service.modelServices.party.role;

import com.aniket.genericentitydemo.model.party.role.PartyRole;
import com.aniket.genericentitydemo.repo.party.role.PartyRoleRepository;
import com.aniket.genericentitydemo.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PartyRoleService extends GenericServiceImpl<PartyRole, Long> {
    public PartyRoleService(PartyRoleRepository repository) {
        super(repository);
    }
}
