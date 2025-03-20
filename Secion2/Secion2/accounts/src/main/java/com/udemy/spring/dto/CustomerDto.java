package com.udemy.spring.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Customer details and Account details"
)
public class CustomerDto {

    @Schema(
            description = "Name of the customer", example = "John Doe"
    )
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 5,max = 30, message = "Name should be between 5 and 30 characters")
    private String name;

    @Schema(
            description = "Email of the customer", example = "2z7dM@example.com"
    )
    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email should be valid")
    private String email;

    @Schema(
            description = "Mobile number of the customer", example = "1234567890"
    )
    @Pattern(regexp = "^\\d{10}$", message = "Mobile number should be 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
