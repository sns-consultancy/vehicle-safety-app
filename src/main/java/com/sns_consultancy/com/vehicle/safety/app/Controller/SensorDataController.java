package com.sns_consultancy.com.vehicle.safety.app.Controller;

import com.sns_consultancy.com.vehicle.safety.app.Repository.SensorDataRepository;
import com.sns_consultancy.com.vehicle.safety.app.Model.SensorData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;

@RestController
@RequestMapping("/api/sensor")
public class SensorDataController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private SensorDataRepository repo;

    @PostMapping("/vehicle")
    public ResponseEntity<String> receiveVehicleData(@RequestBody SensorData data) {
        kafkaTemplate.send("vehicle-sensor-data", data.toString());
        return ResponseEntity.ok("Data received!");
    }

    @PostMapping("/vehicle/ingest")
    public ResponseEntity<?> ingestVehicle(@RequestBody SensorData data) {
        data.setType("vehicle");
        data.setTimestamp(new Timestamp(System.currentTimeMillis()));
        repo.save(data);
        return ResponseEntity.ok("Vehicle data saved.");
    }
// ...existing code...

    @PostMapping("/flight")
    public ResponseEntity<?> ingestFlight(@RequestBody SensorData data) {
        data.setType("flight");
        data.setTimestamp(new Timestamp(System.currentTimeMillis()));
        repo.save(data);
        return ResponseEntity.ok("Flight data saved.");
    }
} // <-- Add this closing brace

