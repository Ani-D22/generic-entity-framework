package com.aniket.genericentitydemo.repo.security;

import com.aniket.genericentitydemo.model.security.UserLogin;
import com.aniket.genericentitydemo.repo.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginRepository extends GenericRepository<UserLogin, Long> {
}
