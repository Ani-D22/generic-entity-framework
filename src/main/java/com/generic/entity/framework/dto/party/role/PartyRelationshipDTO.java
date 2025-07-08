package com.generic.entity.framework.dto.party.role;

import com.generic.entity.framework.dto.GenericDTO;
import com.generic.entity.framework.model.party.role.PartyRelationship;
import lombok.*;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PartyRelationshipDTO extends GenericDTO<PartyRelationship> {

    private Long partyRelationshipId;

    private Long partyRoleIdFrom;
    private Long partyRoleIdTo;

    private LocalDateTime fromDate;
    private LocalDateTime thruDate;

    @Setter(AccessLevel.NONE)
    private LocalDateTime createdDate;
    @Setter(AccessLevel.NONE)
    private LocalDateTime updatedDate;
}
