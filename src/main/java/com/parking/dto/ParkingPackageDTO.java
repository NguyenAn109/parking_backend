package com.parking.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ParkingPackageDTO {
    private Integer parkingPackageId;
    private String name;
    private LocalDateTime validityPeriod;
    private Integer price;
    private String feature;
    private Boolean statusDelete;

}
