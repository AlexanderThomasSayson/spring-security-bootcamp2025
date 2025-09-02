package com.srllc.spring_security_bootcamp2025.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {

    @Schema(example = "john@gmail.com")
    private String userNameOrEmail;

    @Schema(example = "P@ssw0rd")
    private String password;
}
