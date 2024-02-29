package com.parking.restcontroller.auth;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class AuthenticationRequest {
    private String email;
    String password;
}
