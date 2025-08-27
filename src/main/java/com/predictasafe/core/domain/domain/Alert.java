package com.predictasafe.core.domain.domain;

import jakarta.persistence.*;
import lombok.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity @Table(name = "alert")
@Getter @Setter @NoArgsConstructor
public class Alert {
    @Id @GeneratedValue
    private UUID id;

    @ManyToOne(optional = false) @JoinColumn(name = "event_id")
    private Event event;

    @Column(nullable = false)
    private OffsetDateTime createdAt = OffsetDateTime.now();

    @Enumerated(EnumType.STRING) @Column(nullable = false)
    private Enums.Severity level;

    @Column(nullable = false)
    private String message;

    private UUID acknowledgedBy; // FK to user_account if you want full relation
    private OffsetDateTime acknowledgedAt;
}
