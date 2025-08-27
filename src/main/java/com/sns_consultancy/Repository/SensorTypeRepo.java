package com.sns_consultancy.Repository;

import com.predictasafe.core.domain.SensorType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SensorTypeRepo extends JpaRepository<SensorType, UUID> {

}