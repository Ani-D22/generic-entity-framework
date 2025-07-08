package com.aniket.genericentitydemo.repo.categorization;

import com.aniket.genericentitydemo.model.categorization.Enumeration;
import com.aniket.genericentitydemo.repo.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnumerationRepository extends GenericRepository<Enumeration, String> {
}
