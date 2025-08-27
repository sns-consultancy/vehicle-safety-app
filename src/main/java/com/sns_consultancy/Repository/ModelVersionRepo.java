package com.sns_consultancy.Repository;

import com.predictasafe.core.domain.domain.ModelVersion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ModelVersionRepo extends JpaRepository<ModelVersion, UUID> {
    Optional<ModelVersion> findFirstByNameOrderByCreatedAtDesc(String name);
}
