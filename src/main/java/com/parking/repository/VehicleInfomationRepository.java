package com.parking.repository;

import com.parking.entity.VehicleInfomation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleInfomationRepository extends JpaRepository<VehicleInfomation, Integer> {
}