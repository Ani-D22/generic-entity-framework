package com.aniket.genericentitydemo.controller;

import com.aniket.genericentitydemo.config.ApiPaths;
import com.aniket.genericentitydemo.model.party.Party;
import com.aniket.genericentitydemo.service.GenericService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiPaths.API + "/party")
public class PartyController extends GenericController<Party, Long> {
    public PartyController(GenericService<Party, Long> service) {
        super(service, Party.class);
    }
}