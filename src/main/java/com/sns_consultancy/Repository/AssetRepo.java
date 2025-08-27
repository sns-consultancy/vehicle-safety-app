package com.sns_consultancy.Repository;

import com.predictasafe.core.domain.domain.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AssetRepo extends JpaRepository<Asset, UUID> {}
