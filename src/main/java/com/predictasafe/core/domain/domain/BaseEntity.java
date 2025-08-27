package com.predictasafe.core.domain.domain;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.threeten.bp.OffsetDateTime;


@MappedSuperclass
@Getter @Setter
public abstract class BaseEntity {
    @Column(name = "created_at", nullable = false)
    protected OffsetDateTime createdAt = OffsetDateTime.now();
}

