package com.parking.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class AccessLogDTO {
    private Integer id;
    private Integer vehicleId;
    private String parkingSpaceId;
    private LocalDateTime timeIn;
    private LocalDateTime timeOut;
    private Integer vehicleInfomationVehicleId;
    private String parkingSpaceParkingSpaceId;

}
