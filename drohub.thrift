service Drone {
    DroneReply pingService(),
    DroneVideoStateResult sendVideoTo(1: DroneSendVideoRequest request),
    DroneVideoStateResult getVideoState(1: DroneSendVideoRequest request),
    DroneReply doTakeoff(),
    DroneReply doLanding(),
    DroneReply doReturnToHome(),
    DronePosition getPosition(),
    DroneBatteryLevel getBatteryLevel(),
    DroneFlyingState getFlyingState(),
    DroneRadioSignal getRadioSignal(),
    DroneReply moveToPosition(1: DroneRequestPosition request),
    DroneFileList getFileList(),
}

enum FileResourceType {
    VIDEO = 0,
    IMAGE = 1,
    OTHER = 2,
}

struct FileEntry {
    1: string resource_id;
    2: optional string thumbnail_id;
    3: FileResourceType resource_type;
}

enum VideoType {
    VP8 = 0,
    H264 = 1
}

struct DroneSendVideoRequest {
    1: string rtp_url;
    2: VideoType video_type;
}

enum DroneVideoState {
    LIVE = 0,
    STOPPED = 1,
    DIED = 2,
    INVALID_CONDITION = 3
}

struct DroneVideoStateResult {
  1: DroneVideoState state;
  2: optional string human_struct;
  3: string rtp_url;
  4: string serial;
  5: i64 timestamp;
}

struct DroneFileList {
    1: list<FileEntry> file_entries;
    2: string serial;
    3: i64 timestamp;
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