package com.generic.entity.framework.service.modelServices.security;

import com.generic.entity.framework.model.security.UserLoginPermissionAppl;
import com.generic.entity.framework.repo.security.UserLoginPermissionApplRepository;
import com.generic.entity.framework.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserLoginPermissionApplService extends GenericServiceImpl<UserLoginPermissionAppl, Long> {
    public UserLoginPermissionApplService(UserLoginPermissionApplRepository repository) {
        super(repository);
    }
}
