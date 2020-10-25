namespace java com.drohub.thift.gen

service Drone {
    DroneReply pingService(),
    DroneLiveVideoStateResult sendLiveVideoTo(1: DroneSendLiveVideoRequest request),
    DroneLiveVideoStateResult getLiveVideoState(1: DroneSendLiveVideoRequest request),
    DroneReply doTakeoff(),
    DroneReply doLanding(),
    DroneReply doReturnToHome(),
    DronePosition getPosition(),
    DroneBatteryLevel getBatteryLevel(),
    DroneFlyingState getFlyingState(),
    DroneRadioSignal getRadioSignal(),
    DroneReply moveToPosition(1: DroneRequestPosition request),
    DroneReply takePicture(1: DroneTakePictureRequest request),
    DroneReply recordVideo(1: DroneRecordVideoRequest request),
    DroneReply setCameraZoom(1: double zoom_level),
    DroneReply setGimbalAttitude(1: double pitch, 2: double roll, 3: double yaw),
    CameraState getCameraState(),
    GimbalState getGimbalState(),
}

struct GimbalState {
    1: GimbalCalibrationState calibration_state;
    2: double roll;
    3: double pitch;
    4: double yaw;
    5: double min_roll;
    6: double max_roll;
    7: double min_yaw;
    8: double max_yaw;
    9: double min_pitch;
    10: double max_pitch;
    11: bool is_roll_stastabilized;
    12: bool is_yaw_stabilized;
    13: bool is_pitch_stabilized;
    14: string serial;
    15: i64 timestamp;
}

enum GimbalCalibrationState {
    CALIBRATED,
    CALIBRATING,
    UNCALIBRATED,
    ERROR,
}

struct CameraState {
    1: CameraMode mode;
    2: double zoom_level;
    3: double min_zoom;
    4: double max_zoom;
    5: string serial;
    6: i64 timestamp;
}

enum CameraMode {
    VIDEO,
    PICTURE,
    THERMAL,
    ERROR,
}

enum ActionType {
    START = 0,
    STOP = 1
}

struct DroneTakePictureRequest {
    1: ActionType action_type;
}

struct DroneRecordVideoRequest {
    1: ActionType action_type;
}

struct DroneSendLiveVideoRequest {
    1: string room_secret;
    2: i64 room_id;
}

enum DroneLiveVideoState {
    LIVE = 0,
    STOPPED = 1,
    DIED = 2,
    INVALID_CONDITION = 3
}

struct DroneLiveVideoStateResult {
  1: DroneLiveVideoState state;
  4: string serial;
  5: i64 timestamp;
}

struct DroneBatteryLevel {
    1: double battery_level_percent;
    2: string serial;
    3: i64 timestamp;
}

struct DroneBatteryHealth {
    1: double battery_health_percent;
    2: string serial;
    3: i64 timestamp;
}

struct DroneRadioSignal {
    1: optional double signal_quality;
    2: optional double rssi;
    3: string serial;
    4: i64 timestamp;
}

enum FlyingState {
    LANDED = 0;
    TAKING_OFF = 1;
    HOVERING = 2;
    FLYING = 3;
    LANDING = 4;
    EMERGENCY = 5;
    USER_TAKEOFF = 6;
    MOTOR_RAMPING = 7;
    EMERGENCY_LANDING = 8;
}

struct DroneFlyingState {
    1: FlyingState state;
    2: string serial;
    3: i64 timestamp;
}

struct DroneRequestPosition {
    1: double latitude;
    2: double longitude;
    3: double altitude;
    4: double heading;
    5: string serial;
}

struct DronePosition {
    1: double latitude;
    2: double longitude;
    3: double altitude;
    4: string serial;
    5: i64 timestamp;
}

struct DroneReply {
    1: bool result;
    2: string serial;
    3: i64 timestamp;
}