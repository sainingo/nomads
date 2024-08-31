package com.nomads.nomads.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ApiResponse {
    private String message;
    private Number statusCode;
    private Object data;
}
