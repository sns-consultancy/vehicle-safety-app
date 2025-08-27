package com.sns_consultancy.Repository;

import com.predictasafe.core.domain.domain.MaintenanceLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MaintenanceLogRepo extends JpaRepository<MaintenanceLog, UUID> {}
