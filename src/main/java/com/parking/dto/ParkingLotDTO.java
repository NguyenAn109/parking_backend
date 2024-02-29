package com.parking.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ParkingLotDTO {
    private String parkingLotId;
    private String locationName;
    private String address;
    private String capacity;
    private String parkingSpaceParkingSpaceId;

}
