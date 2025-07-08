package com.generic.entity.framework.application.dto;

import com.generic.entity.framework.application.model.User;
import com.generic.entity.framework.generics.dto.GenericDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(callSuper = true)
@Data
@Getter
@Setter
public class UserDTO extends GenericDTO<User> {
    private String email;
    private String phone;
}
