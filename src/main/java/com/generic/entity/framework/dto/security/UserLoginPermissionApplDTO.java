package com.generic.entity.framework.dto.security;

import com.generic.entity.framework.dto.GenericDTO;
import com.generic.entity.framework.model.security.UserLoginPermissionAppl;
import lombok.*;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginPermissionApplDTO extends GenericDTO<UserLoginPermissionAppl> {

    private Long userLoginPermissionApplId;

    private String userLoginId;
    private String permissionId;

    private LocalDateTime fromDate;
    private LocalDateTime thruDate;

    @Setter(AccessLevel.NONE)
    private LocalDateTime createdDate;
    @Setter(AccessLevel.NONE)
    private LocalDateTime updatedDate;
}
