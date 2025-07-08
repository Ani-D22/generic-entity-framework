package com.aniket.genericentitydemo.dto.security;

import com.aniket.genericentitydemo.dto.GenericDTO;
import com.aniket.genericentitydemo.model.security.UserLoginPermissionAppl;
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
