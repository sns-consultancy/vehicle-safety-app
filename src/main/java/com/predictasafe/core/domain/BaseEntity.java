package com.predictasafe.core.domain;

import jakarta.persistence.*;
import lombok.*;
import org.threeten.bp.OffsetDateTime;


@MappedSuperclass
@Getter @Setter
public abstract class BaseEntity {
    @Column(name = "created_at", nullable = false)
    protected OffsetDateTime createdAt = OffsetDateTime.now();
}

