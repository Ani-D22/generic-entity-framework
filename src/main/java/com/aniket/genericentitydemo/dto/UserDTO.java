package com.aniket.genericentitydemo.dto;

import com.aniket.genericentitydemo.model.User;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO extends GenericDTO<User> {
    private String email;
    private String phone;
}
