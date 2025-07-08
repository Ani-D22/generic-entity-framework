package com.aniket.genericentitydemo.repo;

import com.aniket.genericentitydemo.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends GenericRepository<User, Long> {
}
