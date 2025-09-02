package com.srllc.spring_security_bootcamp2025.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationDto {

    @NotBlank(message = "Firstname cannot be blank!")
    @Schema(example = "John")
    private String firstName;

    @NotBlank(message = "Lastname is required!")
    @Schema(example = "Doe")
    private String lastName;

    @NotBlank(message = "Username is required!")
    @Schema(example = "johnDoe32")
    private String userName;

    @NotBlank(message = "Email is required!")
    @Schema(example = "john@gmail.com")
    private String email;

    @NotBlank(message = "Password is required!")
    @Schema(example = "P@ssw0rd")
    private String password;
}
