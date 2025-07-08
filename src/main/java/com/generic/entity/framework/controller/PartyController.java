package com.generic.entity.framework.controller;

import com.generic.entity.framework.config.ApiPaths;
import com.generic.entity.framework.dto.categorization.EnumerationDTO;
import com.generic.entity.framework.dto.party.PartyDTO;
import com.generic.entity.framework.model.party.Party;
import com.generic.entity.framework.service.modelServices.party.PartyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiPaths.API + "/party")
public class PartyController extends GenericController<Party, PartyDTO, Long> {
    public PartyController(PartyService service) {
        super(service, Party.class, PartyDTO.class);
    }
}