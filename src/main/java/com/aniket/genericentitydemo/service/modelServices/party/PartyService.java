package com.aniket.genericentitydemo.service.modelServices.party;

import com.aniket.genericentitydemo.model.party.Party;
import com.aniket.genericentitydemo.repo.party.PartyRepository;
import com.aniket.genericentitydemo.service.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartyService extends GenericServiceImpl<Party, Long> {

//    @Autowired
//    private PersonService personService;
//    @Autowired
//    private OrgService orgService;

    public PartyService(PartyRepository repository) {
        super(repository);
    }

//    @Override
//    public Party save(Party entity){
//        if(entity.getPartyType().getEnumId().equalsIgnoreCase("PERSON")){
//            a
//        }
//        return repository.save(entity);
//    }

}
