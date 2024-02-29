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
@Table(name = "parking_lot", schema = "parkingdb")
public class ParkingLot {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "parking_lot_id", nullable = false, length = 7)
    private String parkingLotId;
    @Basic
    @Column(name = "location_name", nullable = false, length = 100)
    private String locationName;
    @Basic
    @Column(name = "address", nullable = false, length = 255)
    private String address;
    @Basic
    @Column(name = "capacity", nullable = false, length = 10)
    private String capacity;
    @Basic
    @Column(name = "parking_space_parking_space_id", nullable = false, length = 7)
    private String parkingSpaceParkingSpaceId;
    @ManyToOne
    @JoinColumn(name = "parking_space_parking_space_id", referencedColumnName = "parking_space_id", nullable = false, insertable=false, updatable=false)
    private ParkingSpace parkingSpaceByParkingSpaceParkingSpaceId;

}
