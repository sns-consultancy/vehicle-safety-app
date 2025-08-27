package com.predictasafe.core.domain.repo;

import com.predictasafe.core.domain.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SensorRepo extends JpaRepository<Sensor, UUID> {}
