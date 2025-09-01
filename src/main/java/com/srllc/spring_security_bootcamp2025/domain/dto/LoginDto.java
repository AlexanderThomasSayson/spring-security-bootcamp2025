package com.srllc.spring_security_bootcamp2025.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {

    private String userNameOrEmail;
    private String password;
}
