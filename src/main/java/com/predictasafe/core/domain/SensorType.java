package com.predictasafe.core.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.UUID;


@Entity @Table(name = "sensor_type")
@Getter @Setter @NoArgsConstructor
public class SensorType {
    @Id @GeneratedValue
    private UUID id;

    @Column(nullable = false, unique = true)
    private String name; // accelerometer, gyroscope, gps_speed, altimeter

    private String unit;
    private Double samplingHz;
    private Double minValue;
    private Double maxValue;
}

