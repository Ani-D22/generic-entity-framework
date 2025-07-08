package com.generic.entity.framework.service;

import com.generic.entity.framework.dto.party.PartyDTO;
import com.generic.entity.framework.dto.party.PersonDTO;
import com.generic.entity.framework.service.modelServices.party.OrgService;
import com.generic.entity.framework.service.modelServices.party.PartyService;
import com.generic.entity.framework.service.modelServices.party.PersonService;
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
