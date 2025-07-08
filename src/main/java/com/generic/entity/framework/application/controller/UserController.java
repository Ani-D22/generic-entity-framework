package com.generic.entity.framework.application.controller;

import com.generic.entity.framework.application.model.User;
import com.generic.entity.framework.application.service.UserService;
import com.generic.entity.framework.generics.config.ApiPaths;
import com.generic.entity.framework.generics.controller.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiPaths.API + "/user")
public class UserController extends GenericController<User, Long> {
    public UserController(UserService service) {
        super(service);
    }
}
