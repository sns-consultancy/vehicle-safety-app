package com.predictasafe.core.domain.repo;


import org.springframework.data.jpa.repository.*;
import com.predictasafe.core.domain.*;
import java.util.*;
import java.time.*;

import com.predictasafe.core.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserAccountRepo extends JpaRepository<UserAccount, UUID> {}
