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
@Table(name = "vehicle_infomation", schema = "parkingdb")
public class VehicleInfomation {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "vehicle_id", nullable = false)
    private int vehicleId;
    @Basic
    @Column(name = "user_id", nullable = false)
    private int userId;
    @Basic
    @Column(name = "license_plate", nullable = false, length = 10)
    private String licensePlate;
    @Basic
    @Column(name = "vehicle_type", nullable = true, length = 50)
    private String vehicleType;
    @Basic
    @Column(name = "brand", nullable = true, length = 50)
    private String brand;
    @Basic
    @Column(name = "manufacturing_year", nullable = true)
    private Integer manufacturingYear;
    @Basic
    @Column(name = "color", nullable = true, length = 30)
    private String color;
    @Basic
    @Column(name = "seating_capacity", nullable = false)
    private int seatingCapacity;
    @Basic
    @Column(name = "user_user_id", nullable = false)
    private int userUserId;
    @OneToMany(mappedBy = "vehicleInfomationByVehicleInfomationVehicleId")
    @ToString.Exclude
    private Collection<AccessLog> accessLogsByVehicleId;
}
