package com.predictasafe.core.domain.domain;

public class Enums {
    public enum UserRole { admin, engineer, viewer }
    public enum AssetType { vehicle, aircraft }
    public enum DeviceStatus { provisioned, active, inactive, decommissioned }
    public enum TripKind { drive, flight }
    public enum EventType { harsh_brake, rapid_accel, overspeed, collision_detected, stall_warning, turbulence, hard_landing, engine_anomaly, geo_violation }
    public enum Severity { low, medium, high, critical }
    public enum RiskLabel { safe, watch, risky, critical }
}


