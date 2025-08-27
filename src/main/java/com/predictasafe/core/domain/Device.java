package com.predictasafe.core.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.UUID;
import org.threeten.bp.OffsetDateTime;


@Entity @Table(name = "device")
@Getter @Setter @NoArgsConstructor
public class Device extends BaseEntity {
    @Id @GeneratedValue
    private UUID id;

    @ManyToOne(optional = false) @JoinColumn(name = "org_id")
    private Organization org;

    @ManyToOne @JoinColumn(name = "asset_id")
    private Asset asset;

    @Column(nullable = false, unique = true)
    private String serialNo;

    @Column(nullable = false)
    private String firmwareVersion;

    private OffsetDateTime installedAt;

    @Enumerated(EnumType.STRING) @Column(nullable = false)
    private Enums.DeviceStatus status = Enums.DeviceStatus.provisioned;
}

