package com.generic.entity.framework.dto.party.contactMech;

import com.generic.entity.framework.dto.GenericDTO;
import com.generic.entity.framework.model.party.contactMech.PartyContactMech;
import lombok.*;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PartyContactMechDTO extends GenericDTO<PartyContactMech> {

    private Long partyContactMechId;

    private Long partyId;
    private Long contactMechId;
    private String contactMechPurposeId;

    private LocalDateTime fromDate;
    private LocalDateTime thruDate;

    @Setter(AccessLevel.NONE)
    private LocalDateTime createdDate;
    @Setter(AccessLevel.NONE)
    private LocalDateTime updatedDate;
}
