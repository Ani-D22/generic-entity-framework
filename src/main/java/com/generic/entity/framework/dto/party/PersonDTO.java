package com.generic.entity.framework.dto.party;

import com.generic.entity.framework.dto.GenericDTO;
import com.generic.entity.framework.model.party.Person;
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
