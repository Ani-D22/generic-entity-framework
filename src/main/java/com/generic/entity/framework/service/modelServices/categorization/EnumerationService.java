package com.generic.entity.framework.service.modelServices.categorization;

import com.generic.entity.framework.model.categorization.Enumeration;
import com.generic.entity.framework.repo.categorization.EnumerationRepository;
import com.generic.entity.framework.service.GenericServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class EnumerationService extends GenericServiceImpl<Enumeration, String> {
    public EnumerationService(EnumerationRepository repository) {
        super(repository);
    }
}
