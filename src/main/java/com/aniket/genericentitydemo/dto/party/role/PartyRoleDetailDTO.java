package com.aniket.genericentitydemo.dto.party.role;

import com.aniket.genericentitydemo.dto.GenericDTO;
import com.aniket.genericentitydemo.model.party.role.PartyRoleDetail;
import lombok.*;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PartyRoleDetailDTO extends GenericDTO<PartyRoleDetail> {

    private Long partyRoleId;

    private Long enrollmentNo;

    private String courseId;
    private String departmentId;
    private String designationId;

    @Setter(AccessLevel.NONE)
    private LocalDateTime createdDate;
    @Setter(AccessLevel.NONE)
    private LocalDateTime updatedDate;
}
