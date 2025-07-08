package com.generic.entity.framework.application.service;

import com.generic.entity.framework.application.model.User;
import com.generic.entity.framework.application.repo.UserRepository;
import com.generic.entity.framework.generics.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserService extends GenericServiceImpl<User, Long> {
    public UserService(UserRepository repository) {
        super(repository);
    }
}
