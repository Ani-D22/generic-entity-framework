package com.aniket.genericentitydemo.service.modelServices.party.role;

import com.aniket.genericentitydemo.model.party.role.PartyRoleDetail;
import com.aniket.genericentitydemo.repo.party.role.PartyRoleDetailRepository;
import com.aniket.genericentitydemo.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PartyRoleDetailService extends GenericServiceImpl<PartyRoleDetail, Long> {
    public PartyRoleDetailService(PartyRoleDetailRepository repository) {
        super(repository);
    }
}
