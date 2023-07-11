package com.example.springsecurity.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
//cac truong thong tin khi gui request dang ky
public class RegisterRequest {
    private String firstname;
    private String lastname;
    private String email;
    private String password;

}
