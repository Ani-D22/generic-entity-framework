package com.generic.entity.framework.controller;

import com.generic.entity.framework.config.ApiPaths;
import com.generic.entity.framework.dto.UserDTO;
import com.generic.entity.framework.model.User;
import com.generic.entity.framework.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiPaths.API + "/user")
public class UserController extends GenericController<User, UserDTO, Long> {
    public UserController(UserService service) {
        super(service, User.class, UserDTO.class);
    }
}
