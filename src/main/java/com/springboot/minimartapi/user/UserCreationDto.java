package com.springboot.minimartapi.user;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
@Builder
public record UserCreationDto(
        @NotBlank
        @Column(unique = true, nullable = false)
        String userName,
        @NotBlank
        @Column(unique = true, nullable = false)
        @Email
        String emailAddress,
        @NotBlank
        String password
) {
}
