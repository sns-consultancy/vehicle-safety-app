package com.predictasafe.core.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.validator.constraints.UUID;




@Entity @Table(name = "asset")
@Getter @Setter @NoArgsConstructor
public class Asset extends BaseEntity {
    @Id @GeneratedValue
    private UUID id;

    @ManyToOne(optional = false) @JoinColumn(name = "org_id")
    private Organization org;

    @Enumerated(EnumType.STRING) @Column(nullable = false)
    private Enums.AssetType type;

    @Column(nullable = false)
    private String name;

    private String make;
    private String model;
    private Integer year;

    @Column(unique = true)
    private String vin;

    @Column(unique = true)
    private String tailNumber;
}

