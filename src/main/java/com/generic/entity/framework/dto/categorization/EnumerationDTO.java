package com.generic.entity.framework.dto.categorization;

import com.generic.entity.framework.dto.GenericDTO;
import com.generic.entity.framework.model.User;
import com.generic.entity.framework.model.categorization.Enumeration;
import lombok.*;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@Getter
@Setter
public class EnumerationDTO extends GenericDTO<Enumeration> {
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
