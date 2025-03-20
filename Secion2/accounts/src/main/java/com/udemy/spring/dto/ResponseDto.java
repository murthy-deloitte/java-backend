package com.udemy.spring.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(
        name = "Response",
        description = "Successfull response information"
)
public class ResponseDto {

    @Schema(description = "Status code of the response")
    private String statusCode;

    @Schema(description = "Status message of the response")
    private String statusMessage;

}
