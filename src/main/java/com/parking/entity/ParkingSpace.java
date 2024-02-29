package com.parking.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

@Entity
@Table(name = "parking_space", schema = "parkingdb")
public class ParkingSpace {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "parking_space_id", nullable = false, length = 7)
    private String parkingSpaceId;
    @Basic
    @Column(name = "parking_lot_id", nullable = false, length = 7)
    private String parkingLotId;
    @Basic
    @Column(name = "location_number", nullable = false)
    private int locationNumber;
    @Basic
    @Column(name = "area", nullable = false, length = 10)
    private String area;
    @Basic
    @Column(name = "rate", nullable = true, length = 5)
    private String rate;
    @Basic
    @Column(name = "status", nullable = false)
    private boolean status;
    @Basic
    @Column(name = "reservations_reservation_id", nullable = false)
    private int reservationsReservationId;
    @OneToMany(mappedBy = "parkingSpaceByParkingSpaceParkingSpaceId")
    private Collection<AccessLog> accessLogsByParkingSpaceId;
    @OneToMany(mappedBy = "parkingSpaceByParkingSpaceParkingSpaceId")
    private Collection<ParkingLot> parkingLotsByParkingSpaceId;
    @ManyToOne
    @JoinColumn(name = "reservations_reservation_id", referencedColumnName = "reservation_id", nullable = false, insertable=false, updatable=false)
    private Reservations reservationsByReservationsReservationId;

}
