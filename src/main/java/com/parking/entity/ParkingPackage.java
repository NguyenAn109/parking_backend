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
@Table(name = "parking_package", schema = "parkingdb")
public class ParkingPackage {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "parking_package_id", nullable = false)
    private int parkingPackageId;
    @Basic
    @Column(name = "name", nullable = true, length = 50)
    private String name;
    @Basic
    @Column(name = "validity_period", nullable = true)
    private Timestamp validityPeriod;
    @Basic
    @Column(name = "price", nullable = true)
    private Integer price;
    @Basic
    @Column(name = "feature", nullable = true, length = 100)
    private String feature;
    @Basic
    @Column(name = "status_delete", nullable = true)
    private Boolean statusDelete;
    @OneToMany(mappedBy = "parkingPackageByRPackagePPackageId")
    private Collection<Reservations> reservationsByParkingPackageId;

}
