package com.parking.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class PaymentMethodsDTO {
    private Integer paymentMethodsId;
    private String name;
    private Integer orderOrderId;
}
