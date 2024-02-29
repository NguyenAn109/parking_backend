package com.parking.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class VehicleInfomationDTO {
    private Integer vehicleId;
    private Integer userId;
    private String licensePlate;
    private String vehicleType;
    private String brand;
    private Integer manufacturingYear;
    private String color;
    private Integer seatingCapacity;
    private Integer userUserId;
}
