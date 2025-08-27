package com.sns_consultancy.Repository;

import com.predictasafe.core.domain.domain.TelemetryReading;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

public interface TelemetryReadingRepo extends JpaRepository<TelemetryReading, Long> {
    List<TelemetryReading> findTop100ByDevice_IdAndTsBetweenOrderByTsAsc(UUID deviceId, OffsetDateTime from, OffsetDateTime to);

}

