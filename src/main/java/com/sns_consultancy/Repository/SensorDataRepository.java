package com.sns_consultancy.Repository;

import com.sns_consultancy.com.vehicle.safety.app.Model.SensorData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorDataRepository extends JpaRepository<SensorData, Long> {

}
