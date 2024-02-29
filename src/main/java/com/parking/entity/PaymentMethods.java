package com.parking.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

@Entity
@Table(name = "payment_methods", schema = "parkingdb")
public class PaymentMethods {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "payment_methods_id", nullable = false)
    private int paymentMethodsId;
    @Basic
    @Column(name = "name", nullable = false, length = 45)
    private String name;
    @Basic
    @Column(name = "order_order_id", nullable = false)
    private int orderOrderId;
    @ManyToOne
    @JoinColumn(name = "order_order_id", referencedColumnName = "order_id", nullable = false, insertable=false, updatable=false)
    private Order orderByOrderOrderId;

}
