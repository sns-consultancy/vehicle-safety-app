package com.predictasafe.core.domain;

import com.predictasafe.core.domain.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.UUID;




@Entity @Table(name = "user_account")
@Getter @Setter @NoArgsConstructor
public class UserAccount extends BaseEntity {
    @Id @GeneratedValue
    private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "org_id")
    private Organization org;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String fullName;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Enums.UserRole role = Enums.UserRole.viewer;
}
