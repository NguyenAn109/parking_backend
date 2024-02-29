package com.parking.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ReservationsDTO {
    private Integer reservationId;
    private Integer packageId;
    private Integer userId;
    private Integer parkingSpaceId;
    private LocalDateTime reservationTime;
    private Integer userUserId;
    private Integer rPackagePPackageId;
    private Integer orderOrderId;

}
