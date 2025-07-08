package com.aniket.genericentitydemo.dto.party;

import com.aniket.genericentitydemo.dto.GenericDTO;
import com.aniket.genericentitydemo.model.User;
import com.aniket.genericentitydemo.model.party.Party;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PartyDTO extends GenericDTO<Party> {

    private Long partyId;

    private String partyTypeId;  // enumId from Enumeration
    private String statusId;     // enumId from Enumeration

    private LocalDateTime fromDate;
    private LocalDateTime thruDate;

    private PersonDTO person; // optional
    private OrgDTO org; // optional

    @Setter(AccessLevel.NONE)
    private LocalDateTime createdDate;
    @Setter(AccessLevel.NONE)
    private LocalDateTime updatedDate;
}
