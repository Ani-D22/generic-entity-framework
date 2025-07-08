package com.generic.entity.framework.dto;

import com.generic.entity.framework.model.User;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO extends GenericDTO<User> {
    private Long id;
    private String name;
    private String email;
}
