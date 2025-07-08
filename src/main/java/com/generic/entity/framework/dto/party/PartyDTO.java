package com.generic.entity.framework.dto.party;

import com.generic.entity.framework.dto.GenericDTO;
import com.generic.entity.framework.model.categorization.Enumeration;
import com.generic.entity.framework.model.party.Party;
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
    /** TODO: partyTypeId and statusId are of String type
     * But they are actually reference to Enumeration Table
     * Fix this implementation as well as
     * TODO: fix the implementation of PersonDTO and OrgDTO
     */

    private LocalDateTime fromDate;
    private LocalDateTime thruDate;

    private PersonDTO person; // optional
    private OrgDTO org; // optional

    @Setter(AccessLevel.NONE)
    private LocalDateTime createdDate;
    @Setter(AccessLevel.NONE)
    private LocalDateTime updatedDate;
}
