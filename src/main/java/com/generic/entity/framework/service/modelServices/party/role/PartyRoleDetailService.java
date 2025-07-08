package com.generic.entity.framework.service.modelServices.party.role;

import com.generic.entity.framework.model.party.role.PartyRoleDetail;
import com.generic.entity.framework.repo.party.role.PartyRoleDetailRepository;
import com.generic.entity.framework.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PartyRoleDetailService extends GenericServiceImpl<PartyRoleDetail, Long> {
    public PartyRoleDetailService(PartyRoleDetailRepository repository) {
        super(repository);
    }
}
