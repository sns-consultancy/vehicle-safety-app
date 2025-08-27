package com.predictasafe.core.domain.repo;

import com.predictasafe.core.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AssetRepo extends JpaRepository<UserAccount, UUID> {}
