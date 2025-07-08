package com.generic.entity.framework.repo;

import com.generic.entity.framework.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends GenericRepository<User, Long> {
}
