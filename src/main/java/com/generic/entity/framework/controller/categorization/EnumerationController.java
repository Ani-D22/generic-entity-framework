package com.generic.entity.framework.controller.categorization;

import com.generic.entity.framework.config.ApiPaths;
import com.generic.entity.framework.controller.GenericController;
import com.generic.entity.framework.dto.categorization.EnumerationDTO;
import com.generic.entity.framework.model.categorization.Enumeration;
import com.generic.entity.framework.service.modelServices.categorization.EnumerationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiPaths.API + "/enumeration")
public class EnumerationController extends GenericController<Enumeration, EnumerationDTO, String> {
    public EnumerationController(EnumerationService service) {
        super(service, Enumeration.class, EnumerationDTO.class);
    }
}
