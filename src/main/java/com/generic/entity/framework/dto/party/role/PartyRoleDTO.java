package com.generic.entity.framework.dto.party.role;

import com.generic.entity.framework.dto.GenericDTO;
import com.generic.entity.framework.model.party.role.PartyRole;
import lombok.*;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PartyRoleDTO extends GenericDTO<PartyRole> {

    private Long partyRoleId;

    private Long partyId;
    private String partyRoleTypeId;

    private LocalDateTime fromDate;
    private LocalDateTime thruDate;

    @Setter(AccessLevel.NONE)
    private LocalDateTime createdDate;
    @Setter(AccessLevel.NONE)
    private LocalDateTime updatedDate;
}
