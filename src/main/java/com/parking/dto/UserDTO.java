package com.parking.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UserDTO {
    private Integer userId;
    private String fullName;
    private String email;
    private String password;
    private Boolean gender;
    private String district;
    private String village;
    private String province;
    private String address;
    private LocalDate dateOfBirth;
    private String phoneNumber;
    private Boolean isActive;
    private LocalDateTime createdAt;
    private String role;

}
