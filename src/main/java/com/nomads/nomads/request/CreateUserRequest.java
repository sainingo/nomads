package com.nomads.nomads.request;

import lombok.Data;

@Data
public class CreateUserRequest {
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
