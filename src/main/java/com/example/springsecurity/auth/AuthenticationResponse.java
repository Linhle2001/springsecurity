package com.example.springsecurity.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//du lieu tra ve khi người dung authenticate
public class AuthenticationResponse {
    private String token;

}
