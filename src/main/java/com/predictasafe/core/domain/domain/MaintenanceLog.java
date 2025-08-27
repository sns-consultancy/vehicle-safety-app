package com.predictasafe.core.domain.domain;

import jakarta.persistence.*;
import lombok.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity @Table(name = "maintenance_log")
@Getter @Setter @NoArgsConstructor
public class MaintenanceLog {
    @Id @GeneratedValue
    private UUID id;

    @ManyToOne(optional = false) @JoinColumn(name = "asset_id")
    private Asset asset;

    @Column(nullable = false)
    private OffsetDateTime ts;

    @Column(nullable = false)
    private String type; // inspection, battery_replacement, ...

    private String notes;
}
