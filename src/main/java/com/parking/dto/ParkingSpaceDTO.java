package com.parking.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class ParkingSpaceDTO {
    private String parkingSpaceId;
    private String parkingLotId;
    private Integer locationNumber;
    private String area;
    private String rate;
    private Boolean status;
    private Integer reservationsReservationId;

}
