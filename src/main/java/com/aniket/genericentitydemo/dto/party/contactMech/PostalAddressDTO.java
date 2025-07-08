package com.aniket.genericentitydemo.dto.party.contactMech;

import com.aniket.genericentitydemo.dto.GenericDTO;
import com.aniket.genericentitydemo.model.party.contactMech.PostalAddress;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostalAddressDTO extends GenericDTO<PostalAddress> {

    private Long contactMechId;

    private String address_1;
    private String address_2;
    private String city;
    private String state;
    private String country;

    @Setter(AccessLevel.NONE)
    private LocalDateTime createdDate;
    @Setter(AccessLevel.NONE)
    private LocalDateTime updatedDate;
}
