
package com.predictasafe.core.domain;

import com.predictasafe.core.domain.domain.BaseEntity;
import com.predictasafe.core.domain.domain.Device;
import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.UUID;

@Entity @Table(name = "sensor",
        uniqueConstraints = @UniqueConstraint(name = "uq_sensor_device_type_axis", columnNames = {"device_id","sensor_type_id","axis"}))
@Getter @Setter @NoArgsConstructor
public class Sensor extends BaseEntity {
    @Id @GeneratedValue
    private UUID id;

    @ManyToOne(optional = false) @JoinColumn(name = "device_id")
    private Device device;

    @ManyToOne(optional = false) @JoinColumn(name = "sensor_type_id")
    private SensorType sensorType;

    private String axis; // X/Y/Z or null

    @Type(JsonType.class)
    @Column(columnDefinition = "jsonb")
    private Map<String, Object> configJson;
}
