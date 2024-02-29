package com.parking.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class OrderDTO {
    private Integer orderId;
    private Integer reservationId;
    private Integer packageId;
    private Integer paymentMethodsId;
    private Boolean paymentStatus;
    private LocalDateTime orderDate;

}
