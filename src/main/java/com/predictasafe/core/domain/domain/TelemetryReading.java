package com.predictasafe.core.domain.domain;

import com.predictasafe.core.domain.Sensor;
import com.predictasafe.core.domain.Trip;
import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;
import org.threeten.bp.OffsetDateTime;

@Entity
@Table(name = "telemetry_reading")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TelemetryReading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // BIGSERIAL

    @ManyToOne(optional = false)
    @JoinColumn(name = "device_id")
    private Device device;

    @ManyToOne(optional = false)
    @JoinColumn(name = "sensor_id")
    private Sensor sensor;

    @ManyToOne
    @JoinColumn(name = "trip_id")
    private Trip trip;

    @Column(nullable = false)
    private OffsetDateTime ts;

    @Column(nullable = false)
    private Double value;

    private Double lat;
    private Double lon;
    private Double altitudeM;
    private Double speedMps;
    private Double headingDeg;

    @Type(JsonType.class)
    @Column(columnDefinition = "jsonb")
    private String name;

}
