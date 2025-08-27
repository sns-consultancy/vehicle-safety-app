package com.sns_consultancy.Repository;

import com.predictasafe.core.domain.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface TripRepo extends JpaRepository<Trip, UUID> {
    List<Trip> findByAsset_IdOrderByStartedAtDesc(UUID assetId);
}


