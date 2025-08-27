package com.predictasafe.core.domain.domain;

import jakarta.persistence.*;
import lombok.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity @Table(name = "firmware_update")
@Getter @Setter @NoArgsConstructor
public class FirmwareUpdate {
    @Id @GeneratedValue
    private UUID id;

    @ManyToOne(optional = false) @JoinColumn(name = "device_id")
    private Device device;

    @Column(nullable = false)
    private String version;

    @Column(nullable = false)
    private OffsetDateTime pushedAt = OffsetDateTime.now();

    @Column(nullable = false)
    private String status; // scheduled, in_progress, succeeded, failed

    private String notes;
}

