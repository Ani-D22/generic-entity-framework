package com.aniket.genericentitydemo.service.modelServices.security;

import com.aniket.genericentitydemo.model.security.UserLoginPermissionAppl;
import com.aniket.genericentitydemo.repo.security.UserLoginPermissionApplRepository;
import com.aniket.genericentitydemo.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserLoginPermissionApplService extends GenericServiceImpl<UserLoginPermissionAppl, Long> {
    public UserLoginPermissionApplService(UserLoginPermissionApplRepository repository) {
        super(repository);
    }
}
