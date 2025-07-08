package com.aniket.genericentitydemo.service.modelServices.categorization;

import com.aniket.genericentitydemo.model.categorization.Enumeration;
import com.aniket.genericentitydemo.repo.categorization.EnumerationRepository;
import com.aniket.genericentitydemo.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class EnumerationService extends GenericServiceImpl<Enumeration, String> {
    public EnumerationService(EnumerationRepository repository) {
        super(repository);
    }
}
