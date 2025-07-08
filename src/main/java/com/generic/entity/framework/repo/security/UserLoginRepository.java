package com.generic.entity.framework.repo.security;

import com.generic.entity.framework.model.security.UserLogin;
import com.generic.entity.framework.repo.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginRepository extends GenericRepository<UserLogin, Long> {
}
