package com.aniket.genericentitydemo.dto.categorization;

import com.aniket.genericentitydemo.dto.GenericDTO;
import com.aniket.genericentitydemo.model.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@Getter
@Setter
public class EnumerationDTO extends GenericDTO<User> {
    private String enumId;

    private String enumTypeId;
    private String enumValue_1;
    private String enumValue_2;
    private String description;

    @Setter(AccessLevel.NONE)
    private LocalDateTime createdDate;
    @Setter(AccessLevel.NONE)
    private LocalDateTime updatedDate;
}
