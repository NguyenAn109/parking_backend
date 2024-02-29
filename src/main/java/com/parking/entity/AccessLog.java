package com.parking.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

@Entity
@Table(name = "access_log", schema = "parkingdb")
public class AccessLog {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "vehicle_id", nullable = false)
    private int vehicleId;
    @Basic
    @Column(name = "parking_space_id", nullable = false, length = 7)
    private String parkingSpaceId;
    @Basic
    @Column(name = "time_in", nullable = false)
    private Timestamp timeIn;
    @Basic
    @Column(name = "time_out", nullable = false)
    private Timestamp timeOut;
    @Basic
    @Column(name = "vehicle_infomation_vehicle_id", nullable = false)
    private int vehicleInfomationVehicleId;
    @Basic
    @Column(name = "parking_space_parking_space_id", nullable = false, length = 7)
    private String parkingSpaceParkingSpaceId;
    @ManyToOne
    @JoinColumn(name = "vehicle_infomation_vehicle_id", referencedColumnName = "vehicle_id", nullable = false, insertable=false, updatable=false)
    private VehicleInfomation vehicleInfomationByVehicleInfomationVehicleId;
    @ManyToOne
    @JoinColumn(name = "parking_space_parking_space_id", referencedColumnName = "parking_space_id", nullable = false, insertable=false, updatable=false)
    private ParkingSpace parkingSpaceByParkingSpaceParkingSpaceId;

}
