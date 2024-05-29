package com.xoraus.SurvivorsLitClub.auth;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationRequest {

    @NotEmpty(message = "First name is required")
    @NotBlank(message = "First name is required")
    private String firstname;
    @NotBlank(message = "Last name is required")
    @NotEmpty(message = "Last name is required")
    private String lastname;
    @NotBlank(message = "Email is required")
    @NotEmpty(message = "Email is required")
    @Email(message = "Email is invalid")
    private String email;
    @NotBlank(message = "Password is required")
    @NotEmpty(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;
}
