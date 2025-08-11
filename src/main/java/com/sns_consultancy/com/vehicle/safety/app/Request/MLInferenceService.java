package com.sns_consultancy.com.vehicle.safety.app.Request;

import org.springframework.stereotype.Service;
import org.tensorflow.SavedModelBundle;
import org.tensorflow.Tensor;
import org.tensorflow.types.TFloat32;
import org.tensorflow.ndarray.Shape;

@Service
public class MLInferenceService {
    private final SavedModelBundle model;

    public MLInferenceService() {
        SavedModelBundle tempModel = null;
        try {
            tempModel = SavedModelBundle.load("model/python/saved_model");
        } catch (Exception e) {
            System.err.println("TensorFlow model not found or failed to load: " + e.getMessage());
        }
        this.model = tempModel;
    }

    public float predict(float[] features) {
        if (model == null) {
            System.err.println("Model not loaded. Prediction cannot be performed.");
            return -1f;
        }
        try (TFloat32 input = TFloat32.tensorOf(Shape.of(1, features.length),
                data -> {
                    for (int i = 0; i < features.length; i++) {
                        data.setFloat(features[i], 0, i);
                    }
                })) {
            try (TFloat32 result = (TFloat32) model.session().runner()
                    .feed("serving_default_input", input)
                    .fetch("StatefulPartitionedCall")
                    .run().get(0)) {
                float value = result.getFloat(0, 0);
                return value;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1f; // Default value if prediction fails
    }
}