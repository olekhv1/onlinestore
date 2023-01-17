package com.olekhv.onlinestore.entity.user;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class UserModel {
    private String firstName;
    private String lastName;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @NotBlank(message = "This field can't be blank")
    private String email;
    @NotBlank(message = "This field can't be blank")
    private String password;
    @NotBlank(message = "This field can't be blank")
    private String matchingPassword;
}
