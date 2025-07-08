package com.aniket.genericentitydemo.controller;

import com.aniket.genericentitydemo.config.ApiPaths;
import com.aniket.genericentitydemo.model.User;
import com.aniket.genericentitydemo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiPaths.API + "/user")
public class UserController extends GenericController<User, Long> {
    public UserController(UserService service) {
        super(service, User.class);
    }
}
