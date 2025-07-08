package com.aniket.genericentitydemo.controller.categorization;

import com.aniket.genericentitydemo.config.ApiPaths;
import com.aniket.genericentitydemo.controller.GenericController;
import com.aniket.genericentitydemo.model.categorization.Enumeration;
import com.aniket.genericentitydemo.service.modelServices.categorization.EnumerationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiPaths.API + "/enumeration")
public class EnumerationController extends GenericController<Enumeration, String> {
    public EnumerationController(EnumerationService service) {
        super(service, Enumeration.class);
    }
}
