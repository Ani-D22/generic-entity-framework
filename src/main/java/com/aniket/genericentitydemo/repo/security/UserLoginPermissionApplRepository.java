package com.aniket.genericentitydemo.repo.security;

import com.aniket.genericentitydemo.model.security.UserLoginPermissionAppl;
import com.aniket.genericentitydemo.repo.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginPermissionApplRepository extends GenericRepository<UserLoginPermissionAppl, Long> {
}
