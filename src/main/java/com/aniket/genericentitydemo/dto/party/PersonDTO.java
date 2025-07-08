package com.aniket.genericentitydemo.dto.party;

import com.aniket.genericentitydemo.dto.GenericDTO;
import com.aniket.genericentitydemo.model.party.Person;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = false)
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO extends GenericDTO<Person> {

    private Long partyId;

    private String firstName;
    private String middleName;
    private String lastName;

    private LocalDateTime dob;
    private String gender;

    @Setter(AccessLevel.NONE)
    private LocalDateTime createdDate;
    @Setter(AccessLevel.NONE)
    private LocalDateTime updatedDate;
}
