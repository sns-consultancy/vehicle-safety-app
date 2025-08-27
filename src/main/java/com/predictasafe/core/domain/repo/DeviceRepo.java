package com.predictasafe.core.domain.repo;

import com.predictasafe.core.domain.domain.Device;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface DeviceRepo extends JpaRepository<Device, UUID> {
    List<Device> findByAsset_Id(UUID assetId);

}

