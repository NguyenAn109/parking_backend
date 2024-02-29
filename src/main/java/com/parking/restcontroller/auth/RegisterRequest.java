package com.parking.restcontroller.auth;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class RegisterRequest {
    private String fullName;
    private String email;
    private String password;
    private String phoneNumber;
}
