package com.sns_consultancy.Repository;

import com.predictasafe.core.domain.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

public interface EventRepo extends JpaRepository<Event, UUID> {
    List<Event> findTop50ByTsAfterOrderByTsDesc(OffsetDateTime after);

}

