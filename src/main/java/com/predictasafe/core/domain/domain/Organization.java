package com.predictasafe.core.domain.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.UUID;

@Entity
@Table(name = "organization")
@Getter
@Setter
@NoArgsConstructor
public class Organization extends BaseEntity {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String name;
}

