package com.generic.entity.framework.service.modelServices.security;

import com.generic.entity.framework.model.security.UserLogin;
import com.generic.entity.framework.repo.security.UserLoginRepository;
import com.generic.entity.framework.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService extends GenericServiceImpl<UserLogin, Long> {
    public UserLoginService(UserLoginRepository repository) {
        super(repository);
    }
}
