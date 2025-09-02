package com.srllc.spring_security_bootcamp2025.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for SWAGGER UI.
 */
@Configuration
public class OpenApiConfig {

    // Configure Custom OpenAPI documentation
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Spring Security Bootcamp 2025")
                        .version("1.0")
                        .description("""
                                API Documentation for Spring Security Bootcamp Batch of 2025
                                
                                **Developers**
                                - Alexander Thomas Sayson
                                """)
                        .contact(new Contact()
                                .name("Alexander Sayson")
                                .email("alexander@solutionsresource.com")))
                .addSecurityItem(new SecurityRequirement().addList("bearerAuth"))
                .components(new Components()
                        .addSecuritySchemes("bearerAuth", new SecurityScheme()
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")
                                .name("Authorization")
                                .description("Bearer Token")));
    }
}
