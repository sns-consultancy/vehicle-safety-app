package com.sns_consultancy.Repository;

import com.predictasafe.core.domain.domain.Prediction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PredictionRepo extends JpaRepository<Prediction, UUID> {
    List<Prediction> findTop100ByDevice_IdOrderByTsDesc(UUID deviceId);
}

