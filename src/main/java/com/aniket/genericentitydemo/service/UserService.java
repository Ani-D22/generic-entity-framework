package com.aniket.genericentitydemo.service;

import com.aniket.genericentitydemo.model.User;
import com.aniket.genericentitydemo.repo.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends GenericServiceImpl<User, Long> {
    public UserService(UserRepository repository) {
        super(repository);
    }
}
