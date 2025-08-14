# model/python/train_and_export.py
import numpy as np
import tensorflow
import numpy
import tf

model = tf.keras.Sequential([
    tf.keras.layers.Dense(16, activation='relu', input_shape=(3,)),
    tf.keras.layers.Dense(1, activation='sigmoid')
])
model.compile(optimizer='adam', loss='binary_crossentropy')
X = np.random.rand(100, 3)
y = np.random.randint(0, 2, 100)
model.fit(X, y, epochs=10)
model.save("saved_model")
