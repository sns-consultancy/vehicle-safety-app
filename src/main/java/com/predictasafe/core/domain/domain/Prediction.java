package com.predictasafe.core.domain.domain;

import com.predictasafe.core.domain.Trip;
import jakarta.persistence.*;
import lombok.*;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;
import com.vladmihalcea.hibernate.type.json.JsonType;
import org.hibernate.annotations.Type;

@Entity @Table(name = "prediction")
@Getter @Setter @NoArgsConstructor
public class Prediction extends BaseEntity {
    @Id @GeneratedValue
    private UUID id;

    @ManyToOne(optional = false) @JoinColumn(name = "model_id")
    private ModelVersion model;

    @ManyToOne @JoinColumn(name = "trip_id")
    private Trip trip;

    @ManyToOne @JoinColumn(name = "device_id")
    private Device device;

    @Column(nullable = false)
    private OffsetDateTime ts;

    @Column(nullable = false)
    private java.math.BigDecimal riskScore; // NUMERIC(5,2)

    @Enumerated(EnumType.STRING) @Column(nullable = false)
    private Enums.RiskLabel label;

    @Type(JsonType.class)
    @Column(columnDefinition = "jsonb")
    private Map<String, Object> featuresUsed;
}

