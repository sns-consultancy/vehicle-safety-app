package com.predictasafe.core.domain.domain;

import jakarta.persistence.*;
import lombok.*;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;
import com.vladmihalcea.hibernate.type.json.JsonType;
import org.hibernate.annotations.Type;

@Entity @Table(name = "model_version",
        uniqueConstraints = @UniqueConstraint(name = "uq_model_name_version", columnNames = {"name","version"}))
@Getter @Setter @NoArgsConstructor
public class ModelVersion {
    @Id @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String version;

    private OffsetDateTime createdAt = OffsetDateTime.now();

    @Type(JsonType.class)
    @Column(columnDefinition = "jsonb")
    private Map<String, Object> features;

    @Type(JsonType.class)
    @Column(columnDefinition = "jsonb")
    private Map<String, Object> metrics;
}

