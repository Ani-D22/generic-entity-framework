package com.generic.entity.framework.service;

import com.generic.entity.framework.model.User;
import com.generic.entity.framework.repo.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends GenericServiceImpl<User, Long> {
    public UserService(UserRepository repository) {
        super(repository);
    }
}
