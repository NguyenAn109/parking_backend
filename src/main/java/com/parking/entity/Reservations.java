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
@Table(name = "reservations", schema = "parkingdb")
public class Reservations {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "reservation_id", nullable = false)
    private int reservationId;
    @Basic
    @Column(name = "package_id", nullable = false)
    private int packageId;
    @Basic
    @Column(name = "user_id", nullable = false)
    private int userId;
    @Basic
    @Column(name = "parking_space_id", nullable = false)
    private int parkingSpaceId;
    @Basic
    @Column(name = "reservation_time", nullable = false)
    private Timestamp reservationTime;
    @Basic
    @Column(name = "user_user_id", nullable = false)
    private int userUserId;
    @Basic
    @Column(name = "R_package_P_package_id", nullable = false)
    private int rPackagePPackageId;
    @Basic
    @Column(name = "order_order_id", nullable = false)
    private int orderOrderId;
    @OneToMany(mappedBy = "reservationsByReservationsReservationId")
    @ToString.Exclude
    private Collection<ParkingSpace> parkingSpacesByReservationId;
    @ManyToOne
    @JoinColumn(name = "user_user_id", referencedColumnName = "user_id", nullable = false, insertable=false, updatable=false)
    private User userByUserUserId;
    @ManyToOne
    @JoinColumn(name = "R_package_P_package_id", referencedColumnName = "parking_package_id", nullable = false, insertable=false, updatable=false)
    private ParkingPackage parkingPackageByRPackagePPackageId;
    @ManyToOne
    @JoinColumn(name = "order_order_id", referencedColumnName = "order_id", nullable = false, insertable=false, updatable=false)
    private Order orderByOrderOrderId;

}
