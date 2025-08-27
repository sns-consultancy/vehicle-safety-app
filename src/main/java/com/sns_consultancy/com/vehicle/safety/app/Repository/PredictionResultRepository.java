package com.sns_consultancy.com.vehicle.safety.app.Repository;

import com.sns_consultancy.com.vehicle.safety.app.Model.PredictionResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PredictionResultRepository extends JpaRepository<PredictionResult, Long> {
}