package com.generic.entity.framework.application.repo;

import com.generic.entity.framework.application.model.User;
import com.generic.entity.framework.generics.repo.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends GenericRepository<User, Long> {
}
