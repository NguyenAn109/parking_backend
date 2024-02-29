package com.parking.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

@Entity
@Table(name = "order", schema = "parkingdb")
public class Order {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "order_id", nullable = false)
    private int orderId;
    @Basic
    @Column(name = "reservation_id", nullable = false)
    private int reservationId;
    @Basic
    @Column(name = "package_id", nullable = false)
    private int packageId;
    @Basic
    @Column(name = "payment_methods_id", nullable = false)
    private int paymentMethodsId;
    @Basic
    @Column(name = "payment_status", nullable = false)
    private boolean paymentStatus;
    @Basic
    @Column(name = "order_date", nullable = false)
    private Timestamp orderDate;
    @OneToMany(mappedBy = "orderByOrderOrderId")
    @ToString.Exclude
    private Collection<PaymentMethods> paymentMethodsByOrderId;
    @OneToMany(mappedBy = "orderByOrderOrderId")
    @ToString.Exclude
    private Collection<Reservations> reservationsByOrderId;

}
