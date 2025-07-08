package com.generic.entity.framework.dto.party.contactMech;

import com.generic.entity.framework.dto.GenericDTO;
import com.generic.entity.framework.model.party.contactMech.ContactMech;
import lombok.*;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactMechDTO extends GenericDTO<ContactMech> {

    private Long contactMechId;

    private String contactMechTypeId;
    private String emailString;

    @Setter(AccessLevel.NONE)
    private LocalDateTime createdDate;
    @Setter(AccessLevel.NONE)
    private LocalDateTime updatedDate;
}
