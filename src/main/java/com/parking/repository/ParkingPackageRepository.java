package com.parking.repository;

import com.parking.entity.ParkingPackage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingPackageRepository extends JpaRepository<ParkingPackage, Integer> {
}