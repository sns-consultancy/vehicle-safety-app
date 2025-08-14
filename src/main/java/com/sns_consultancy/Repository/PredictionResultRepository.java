package com.sns_consultancy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sns_consultancy.com.vehicle.safety.app.Model.PredictionResult;

public interface PredictionResultRepository extends JpaRepository<PredictionResult, Long> {
    // You can add custom query methods here if needed
}