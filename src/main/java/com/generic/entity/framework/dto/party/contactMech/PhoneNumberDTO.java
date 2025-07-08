package com.generic.entity.framework.dto.party.contactMech;

import com.generic.entity.framework.dto.GenericDTO;
import com.generic.entity.framework.model.party.contactMech.PhoneNumber;
import lombok.*;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhoneNumberDTO extends GenericDTO<PhoneNumber> {

    private Long contactMechId;

    private String countryCode;
    private String phoneNumber;

    @Setter(AccessLevel.NONE)
    private LocalDateTime createdDate;
    @Setter(AccessLevel.NONE)
    private LocalDateTime updatedDate;
}
