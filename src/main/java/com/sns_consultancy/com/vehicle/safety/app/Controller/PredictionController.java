package com.sns_consultancy.com.vehicle.safety.app.Controller;


import com.sns_consultancy.com.vehicle.safety.app.Model.PredictionResult;
import com.sns_consultancy.com.vehicle.safety.app.Repository.PredictionResultRepository;
import com.sns_consultancy.com.vehicle.safety.app.Request.MLInferenceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;

@RestController
@RequestMapping("/api/predict")
public class PredictionController {
    @Autowired
    private MLInferenceService mlService;

    @Autowired
    private PredictionResultRepository repo;

    @PostMapping("/risk")
    public ResponseEntity<PredictionResult> predictRisk(@RequestBody float[] features) {
        float risk = mlService.predict(features);
        PredictionResult result = new PredictionResult();
        result.setRiskScore(risk);
        result.setTimestamp(new Timestamp(System.currentTimeMillis()));
        repo.save(result);
        return ResponseEntity.ok(result);
    }
}