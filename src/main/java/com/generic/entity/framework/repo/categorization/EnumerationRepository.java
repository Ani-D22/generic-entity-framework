package com.generic.entity.framework.repo.categorization;

import com.generic.entity.framework.model.categorization.Enumeration;
import com.generic.entity.framework.repo.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnumerationRepository extends GenericRepository<Enumeration, String> {
}
