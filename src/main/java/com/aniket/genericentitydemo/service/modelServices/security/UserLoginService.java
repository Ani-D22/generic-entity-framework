package com.aniket.genericentitydemo.service.modelServices.security;

import com.aniket.genericentitydemo.model.security.UserLogin;
import com.aniket.genericentitydemo.repo.security.UserLoginRepository;
import com.aniket.genericentitydemo.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService extends GenericServiceImpl<UserLogin, Long> {
    public UserLoginService(UserLoginRepository repository) {
        super(repository);
    }
}
