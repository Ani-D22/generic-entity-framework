package com.generic.entity.framework.dto.party;

import com.generic.entity.framework.dto.GenericDTO;
import com.generic.entity.framework.model.party.Org;
import lombok.*;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrgDTO extends GenericDTO<Org> {

    private Long partyId;

    private String orgName;
    private Integer orgGroupSize;

    @Setter(AccessLevel.NONE)
    private LocalDateTime createdDate;
    @Setter(AccessLevel.NONE)
    private LocalDateTime updatedDate;
}
