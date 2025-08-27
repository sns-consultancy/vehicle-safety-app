package com.predictasafe.core.domain.domain;

import com.google.storage.v2.Object;
import com.predictasafe.core.domain.Trip;
import jakarta.persistence.*;
import lombok.*;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;
import com.vladmihalcea.hibernate.type.json.JsonType;
import org.hibernate.annotations.Type;

@Entity @Table(name = "event")
@Getter @Setter @NoArgsConstructor
public class Event extends BaseEntity {
    @Id @GeneratedValue
    private UUID id;

    @ManyToOne @JoinColumn(name = "trip_id")
    private Trip trip;

    @ManyToOne @JoinColumn(name = "device_id")
    private Device device;

    @Column(nullable = false)
    private OffsetDateTime ts;

    @Enumerated(EnumType.STRING) @Column(nullable = false)
    private Enums.EventType type;

    @Enumerated(EnumType.STRING) @Column(nullable = false)
    private Enums.Severity severity;

    private java.math.BigDecimal score; // NUMERIC(5,2)

    @Type(JsonType.class)
    @Column(columnDefinition = "jsonb")
    private Map<String, Object> details;
}

