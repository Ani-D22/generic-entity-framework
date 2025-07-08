package com.generic.entity.framework.repo.security;

import com.generic.entity.framework.model.security.UserLoginPermissionAppl;
import com.generic.entity.framework.repo.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginPermissionApplRepository extends GenericRepository<UserLoginPermissionAppl, Long> {
}
