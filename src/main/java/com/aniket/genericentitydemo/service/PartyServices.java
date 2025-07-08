package com.aniket.genericentitydemo.service;

import com.aniket.genericentitydemo.dto.party.PartyDTO;
import com.aniket.genericentitydemo.dto.party.PersonDTO;
import com.aniket.genericentitydemo.model.party.Party;
import com.aniket.genericentitydemo.service.modelServices.party.OrgService;
import com.aniket.genericentitydemo.service.modelServices.party.PartyService;
import com.aniket.genericentitydemo.service.modelServices.party.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyServices {
    @Autowired
    private PartyService partyService;
    @Autowired
    private PersonService personService;
    @Autowired
    private OrgService orgService;

    public PersonDTO getPartyById(Long id) {
        return null;
    }
    public List<PartyDTO> getAllParty(){
        return null;
    }
    public String createParty(PartyDTO partyDTO){
        System.out.println("PartyServices createParty======"+partyDTO);
//        if(partyDTO.getPartyTypeId().equalsIgnoreCase("PERSON"))
        return "PartyServices createParty======"+partyDTO+"==========="+partyDTO.getClass();
    }
    public PartyDTO putParty(Long partyId, PartyDTO partyDTO){
        return null;
    }
    public PartyDTO patchParty(Long partyId, PartyDTO partyDTO){
        return null;
    }
    public Boolean deleteParty(Long partyId){
        return null;
    }
}
