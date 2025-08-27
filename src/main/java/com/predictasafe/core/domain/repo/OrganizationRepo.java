package com.predictasafe.core.repo;

import org.springframework.data.jpa.repository.*;
import com.predictasafe.core.domain.*;
import java.util.*;
import java.time.*;

public interface OrganizationRepo extends JpaRepository<Organization, java.util.UUID> {}

