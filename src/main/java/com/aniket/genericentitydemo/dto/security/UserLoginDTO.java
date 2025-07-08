package com.aniket.genericentitydemo.dto.security;

import com.aniket.genericentitydemo.dto.GenericDTO;
import com.aniket.genericentitydemo.model.security.UserLogin;
import lombok.*;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginDTO extends GenericDTO<UserLogin> {

    private String userLoginId;

    private Long partyId;
    private String password;
    private String passwordHint;
    private Boolean isEnabled;

    @Setter(AccessLevel.NONE)
    private LocalDateTime createdDate;
    @Setter(AccessLevel.NONE)
    private LocalDateTime updatedDate;
}
