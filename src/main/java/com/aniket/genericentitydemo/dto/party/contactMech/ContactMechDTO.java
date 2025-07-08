package com.aniket.genericentitydemo.dto.party.contactMech;

import com.aniket.genericentitydemo.dto.GenericDTO;
import com.aniket.genericentitydemo.model.party.contactMech.ContactMech;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
