# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: drohub.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
from google.protobuf import descriptor_pb2
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='drohub.proto',
  package='',
  syntax='proto3',
  serialized_pb=_b('\n\x0c\x64rohub.proto\"\xa6\x01\n\tFileEntry\x12\x13\n\x0bresource_id\x18\x01 \x01(\t\x12\x16\n\x0cthumbnail_id\x18\x02 \x01(\tH\x00\x12.\n\rresource_type\x18\x03 \x01(\x0e\x32\x17.FileEntry.ResourceType\"/\n\x0cResourceType\x12\t\n\x05VIDEO\x10\x00\x12\t\n\x05IMAGE\x10\x01\x12\t\n\x05OTHER\x10\x02\x42\x0b\n\tThumbnail\"~\n\x15\x44roneSendVideoRequest\x12\x0f\n\x07rtp_url\x18\x01 \x01(\t\x12\x34\n\nvideo_type\x18\x02 \x01(\x0e\x32 .DroneSendVideoRequest.VideoType\"\x1e\n\tVideoType\x12\x07\n\x03VP8\x10\x00\x12\x08\n\x04H264\x10\x01\"\xd5\x01\n\x0f\x44roneVideoState\x12%\n\x05state\x18\x01 \x01(\x0e\x32\x16.DroneVideoState.State\x12\x17\n\rhuman_message\x18\x02 \x01(\tH\x00\x12\x0f\n\x07rtp_url\x18\x03 \x01(\t\x12\x0e\n\x06serial\x18\x04 \x01(\t\x12\x11\n\ttimestamp\x18\x05 \x01(\r\"?\n\x05State\x12\x08\n\x04LIVE\x10\x00\x12\x0b\n\x07STOPPED\x10\x01\x12\x08\n\x04\x44IED\x10\x02\x12\x15\n\x11INVALID_CONDITION\x10\x03\x42\r\n\x0bStateString\"T\n\rDroneFileList\x12 \n\x0c\x66ile_entries\x18\x01 \x03(\x0b\x32\n.FileEntry\x12\x0e\n\x06serial\x18\x02 \x01(\t\x12\x11\n\ttimestamp\x18\x03 \x01(\r\"\x0e\n\x0c\x44roneRequest\"U\n\x11\x44roneBatteryLevel\x12\x1d\n\x15\x62\x61ttery_level_percent\x18\x01 \x01(\x01\x12\x0e\n\x06serial\x18\x02 \x01(\t\x12\x11\n\ttimestamp\x18\x03 \x01(\r\"W\n\x12\x44roneBatteryHealth\x12\x1e\n\x16\x62\x61ttery_health_percent\x18\x01 \x01(\x01\x12\x0e\n\x06serial\x18\x02 \x01(\t\x12\x11\n\ttimestamp\x18\x03 \x01(\r\"n\n\x10\x44roneRadioSignal\x12\x18\n\x0esignal_quality\x18\x01 \x01(\x02H\x00\x12\x0e\n\x04rssi\x18\x02 \x01(\x02H\x00\x12\x0e\n\x06serial\x18\x03 \x01(\t\x12\x11\n\ttimestamp\x18\x04 \x01(\rB\r\n\x0bRadioOption\"\x81\x02\n\x10\x44roneFlyingState\x12,\n\x05state\x18\x01 \x01(\x0e\x32\x1d.DroneFlyingState.FlyingState\x12\x0e\n\x06serial\x18\x02 \x01(\t\x12\x11\n\ttimestamp\x18\x03 \x01(\r\"\x9b\x01\n\x0b\x46lyingState\x12\n\n\x06LANDED\x10\x00\x12\x0e\n\nTAKING_OFF\x10\x01\x12\x0c\n\x08HOVERING\x10\x02\x12\n\n\x06\x46LYING\x10\x03\x12\x0b\n\x07LANDING\x10\x04\x12\r\n\tEMERGENCY\x10\x05\x12\x10\n\x0cUSER_TAKEOFF\x10\x06\x12\x11\n\rMOTOR_RAMPING\x10\x07\x12\x15\n\x11\x45MERGENCY_LANDING\x10\x08\"n\n\x14\x44roneRequestPosition\x12\x10\n\x08latitude\x18\x01 \x01(\x01\x12\x11\n\tlongitude\x18\x02 \x01(\x01\x12\x10\n\x08\x61ltitude\x18\x03 \x01(\x01\x12\x0f\n\x07heading\x18\x04 \x01(\x01\x12\x0e\n\x06serial\x18\x05 \x01(\t\"i\n\rDronePosition\x12\x10\n\x08latitude\x18\x01 \x01(\x01\x12\x11\n\tlongitude\x18\x02 \x01(\x01\x12\x10\n\x08\x61ltitude\x18\x03 \x01(\x01\x12\x0e\n\x06serial\x18\x04 \x01(\t\x12\x11\n\ttimestamp\x18\x05 \x01(\r\"@\n\nDroneReply\x12\x0f\n\x07message\x18\x01 \x01(\x08\x12\x0e\n\x06serial\x18\x02 \x01(\t\x12\x11\n\ttimestamp\x18\x03 \x01(\r2\xc5\x04\n\x05\x44rone\x12-\n\x0bpingService\x12\r.DroneRequest\x1a\x0b.DroneReply\"\x00\x30\x01\x12;\n\x0bsendVideoTo\x12\x16.DroneSendVideoRequest\x1a\x10.DroneVideoState\"\x00\x30\x01\x12)\n\tdoTakeoff\x12\r.DroneRequest\x1a\x0b.DroneReply\"\x00\x12)\n\tdoLanding\x12\r.DroneRequest\x1a\x0b.DroneReply\"\x00\x12\x30\n\x0bgetPosition\x12\r.DroneRequest\x1a\x0e.DronePosition\"\x00\x30\x01\x12\x38\n\x0fgetBatteryLevel\x12\r.DroneRequest\x1a\x12.DroneBatteryLevel\"\x00\x30\x01\x12\x36\n\x0egetFlyingState\x12\r.DroneRequest\x1a\x11.DroneFlyingState\"\x00\x30\x01\x12\x36\n\x0egetRadioSignal\x12\r.DroneRequest\x1a\x11.DroneRadioSignal\"\x00\x30\x01\x12\x36\n\x0emoveToPosition\x12\x15.DroneRequestPosition\x1a\x0b.DroneReply\"\x00\x12.\n\x0bgetFileList\x12\r.DroneRequest\x1a\x0e.DroneFileList\"\x00\x12\x36\n\x11getFileListStream\x12\r.DroneRequest\x1a\x0e.DroneFileList\"\x00\x30\x01\x62\x06proto3')
)



_FILEENTRY_RESOURCETYPE = _descriptor.EnumDescriptor(
  name='ResourceType',
  full_name='FileEntry.ResourceType',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='VIDEO', index=0, number=0,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='IMAGE', index=1, number=1,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='OTHER', index=2, number=2,
      options=None,
      type=None),
  ],
  containing_type=None,
  options=None,
  serialized_start=123,
  serialized_end=170,
)
_sym_db.RegisterEnumDescriptor(_FILEENTRY_RESOURCETYPE)

_DRONESENDVIDEOREQUEST_VIDEOTYPE = _descriptor.EnumDescriptor(
  name='VideoType',
  full_name='DroneSendVideoRequest.VideoType',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='VP8', index=0, number=0,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='H264', index=1, number=1,
      options=None,
      type=None),
  ],
  containing_type=None,
  options=None,
  serialized_start=281,
  serialized_end=311,
)
_sym_db.RegisterEnumDescriptor(_DRONESENDVIDEOREQUEST_VIDEOTYPE)

_DRONEVIDEOSTATE_STATE = _descriptor.EnumDescriptor(
  name='State',
  full_name='DroneVideoState.State',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='LIVE', index=0, number=0,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='STOPPED', index=1, number=1,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='DIED', index=2, number=2,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='INVALID_CONDITION', index=3, number=3,
      options=None,
      type=None),
  ],
  containing_type=None,
  options=None,
  serialized_start=449,
  serialized_end=512,
)
_sym_db.RegisterEnumDescriptor(_DRONEVIDEOSTATE_STATE)

_DRONEFLYINGSTATE_FLYINGSTATE = _descriptor.EnumDescriptor(
  name='FlyingState',
  full_name='DroneFlyingState.FlyingState',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='LANDED', index=0, number=0,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='TAKING_OFF', index=1, number=1,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='HOVERING', index=2, number=2,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='FLYING', index=3, number=3,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='LANDING', index=4, number=4,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='EMERGENCY', index=5, number=5,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='USER_TAKEOFF', index=6, number=6,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='MOTOR_RAMPING', index=7, number=7,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='EMERGENCY_LANDING', index=8, number=8,
      options=None,
      type=None),
  ],
  containing_type=None,
  options=None,
  serialized_start=1022,
  serialized_end=1177,
)
_sym_db.RegisterEnumDescriptor(_DRONEFLYINGSTATE_FLYINGSTATE)


_FILEENTRY = _descriptor.Descriptor(
  name='FileEntry',
  full_name='FileEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_id', full_name='FileEntry.resource_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='thumbnail_id', full_name='FileEntry.thumbnail_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='resource_type', full_name='FileEntry.resource_type', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _FILEENTRY_RESOURCETYPE,
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='Thumbnail', full_name='FileEntry.Thumbnail',
      index=0, containing_type=None, fields=[]),
  ],
  serialized_start=17,
  serialized_end=183,
)


_DRONESENDVIDEOREQUEST = _descriptor.Descriptor(
  name='DroneSendVideoRequest',
  full_name='DroneSendVideoRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='rtp_url', full_name='DroneSendVideoRequest.rtp_url', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='video_type', full_name='DroneSendVideoRequest.video_type', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _DRONESENDVIDEOREQUEST_VIDEOTYPE,
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=185,
  serialized_end=311,
)


_DRONEVIDEOSTATE = _descriptor.Descriptor(
  name='DroneVideoState',
  full_name='DroneVideoState',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='state', full_name='DroneVideoState.state', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='human_message', full_name='DroneVideoState.human_message', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='rtp_url', full_name='DroneVideoState.rtp_url', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='serial', full_name='DroneVideoState.serial', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='timestamp', full_name='DroneVideoState.timestamp', index=4,
      number=5, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _DRONEVIDEOSTATE_STATE,
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='StateString', full_name='DroneVideoState.StateString',
      index=0, containing_type=None, fields=[]),
  ],
  serialized_start=314,
  serialized_end=527,
)


_DRONEFILELIST = _descriptor.Descriptor(
  name='DroneFileList',
  full_name='DroneFileList',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='file_entries', full_name='DroneFileList.file_entries', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='serial', full_name='DroneFileList.serial', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='timestamp', full_name='DroneFileList.timestamp', index=2,
      number=3, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=529,
  serialized_end=613,
)


_DRONEREQUEST = _descriptor.Descriptor(
  name='DroneRequest',
  full_name='DroneRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=615,
  serialized_end=629,
)


_DRONEBATTERYLEVEL = _descriptor.Descriptor(
  name='DroneBatteryLevel',
  full_name='DroneBatteryLevel',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='battery_level_percent', full_name='DroneBatteryLevel.battery_level_percent', index=0,
      number=1, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='serial', full_name='DroneBatteryLevel.serial', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='timestamp', full_name='DroneBatteryLevel.timestamp', index=2,
      number=3, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=631,
  serialized_end=716,
)


_DRONEBATTERYHEALTH = _descriptor.Descriptor(
  name='DroneBatteryHealth',
  full_name='DroneBatteryHealth',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='battery_health_percent', full_name='DroneBatteryHealth.battery_health_percent', index=0,
      number=1, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='serial', full_name='DroneBatteryHealth.serial', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='timestamp', full_name='DroneBatteryHealth.timestamp', index=2,
      number=3, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=718,
  serialized_end=805,
)


_DRONERADIOSIGNAL = _descriptor.Descriptor(
  name='DroneRadioSignal',
  full_name='DroneRadioSignal',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='signal_quality', full_name='DroneRadioSignal.signal_quality', index=0,
      number=1, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='rssi', full_name='DroneRadioSignal.rssi', index=1,
      number=2, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='serial', full_name='DroneRadioSignal.serial', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='timestamp', full_name='DroneRadioSignal.timestamp', index=3,
      number=4, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='RadioOption', full_name='DroneRadioSignal.RadioOption',
      index=0, containing_type=None, fields=[]),
  ],
  serialized_start=807,
  serialized_end=917,
)


_DRONEFLYINGSTATE = _descriptor.Descriptor(
  name='DroneFlyingState',
  full_name='DroneFlyingState',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='state', full_name='DroneFlyingState.state', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='serial', full_name='DroneFlyingState.serial', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='timestamp', full_name='DroneFlyingState.timestamp', index=2,
      number=3, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _DRONEFLYINGSTATE_FLYINGSTATE,
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=920,
  serialized_end=1177,
)


_DRONEREQUESTPOSITION = _descriptor.Descriptor(
  name='DroneRequestPosition',
  full_name='DroneRequestPosition',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='latitude', full_name='DroneRequestPosition.latitude', index=0,
      number=1, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='longitude', full_name='DroneRequestPosition.longitude', index=1,
      number=2, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='altitude', full_name='DroneRequestPosition.altitude', index=2,
      number=3, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='heading', full_name='DroneRequestPosition.heading', index=3,
      number=4, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='serial', full_name='DroneRequestPosition.serial', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1179,
  serialized_end=1289,
)


_DRONEPOSITION = _descriptor.Descriptor(
  name='DronePosition',
  full_name='DronePosition',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='latitude', full_name='DronePosition.latitude', index=0,
      number=1, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='longitude', full_name='DronePosition.longitude', index=1,
      number=2, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='altitude', full_name='DronePosition.altitude', index=2,
      number=3, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='serial', full_name='DronePosition.serial', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='timestamp', full_name='DronePosition.timestamp', index=4,
      number=5, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1291,
  serialized_end=1396,
)


_DRONEREPLY = _descriptor.Descriptor(
  name='DroneReply',
  full_name='DroneReply',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='message', full_name='DroneReply.message', index=0,
      number=1, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='serial', full_name='DroneReply.serial', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='timestamp', full_name='DroneReply.timestamp', index=2,
      number=3, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1398,
  serialized_end=1462,
)

_FILEENTRY.fields_by_name['resource_type'].enum_type = _FILEENTRY_RESOURCETYPE
_FILEENTRY_RESOURCETYPE.containing_type = _FILEENTRY
_FILEENTRY.oneofs_by_name['Thumbnail'].fields.append(
  _FILEENTRY.fields_by_name['thumbnail_id'])
_FILEENTRY.fields_by_name['thumbnail_id'].containing_oneof = _FILEENTRY.oneofs_by_name['Thumbnail']
_DRONESENDVIDEOREQUEST.fields_by_name['video_type'].enum_type = _DRONESENDVIDEOREQUEST_VIDEOTYPE
_DRONESENDVIDEOREQUEST_VIDEOTYPE.containing_type = _DRONESENDVIDEOREQUEST
_DRONEVIDEOSTATE.fields_by_name['state'].enum_type = _DRONEVIDEOSTATE_STATE
_DRONEVIDEOSTATE_STATE.containing_type = _DRONEVIDEOSTATE
_DRONEVIDEOSTATE.oneofs_by_name['StateString'].fields.append(
  _DRONEVIDEOSTATE.fields_by_name['human_message'])
_DRONEVIDEOSTATE.fields_by_name['human_message'].containing_oneof = _DRONEVIDEOSTATE.oneofs_by_name['StateString']
_DRONEFILELIST.fields_by_name['file_entries'].message_type = _FILEENTRY
_DRONERADIOSIGNAL.oneofs_by_name['RadioOption'].fields.append(
  _DRONERADIOSIGNAL.fields_by_name['signal_quality'])
_DRONERADIOSIGNAL.fields_by_name['signal_quality'].containing_oneof = _DRONERADIOSIGNAL.oneofs_by_name['RadioOption']
_DRONERADIOSIGNAL.oneofs_by_name['RadioOption'].fields.append(
  _DRONERADIOSIGNAL.fields_by_name['rssi'])
_DRONERADIOSIGNAL.fields_by_name['rssi'].containing_oneof = _DRONERADIOSIGNAL.oneofs_by_name['RadioOption']
_DRONEFLYINGSTATE.fields_by_name['state'].enum_type = _DRONEFLYINGSTATE_FLYINGSTATE
_DRONEFLYINGSTATE_FLYINGSTATE.containing_type = _DRONEFLYINGSTATE
DESCRIPTOR.message_types_by_name['FileEntry'] = _FILEENTRY
DESCRIPTOR.message_types_by_name['DroneSendVideoRequest'] = _DRONESENDVIDEOREQUEST
DESCRIPTOR.message_types_by_name['DroneVideoState'] = _DRONEVIDEOSTATE
DESCRIPTOR.message_types_by_name['DroneFileList'] = _DRONEFILELIST
DESCRIPTOR.message_types_by_name['DroneRequest'] = _DRONEREQUEST
DESCRIPTOR.message_types_by_name['DroneBatteryLevel'] = _DRONEBATTERYLEVEL
DESCRIPTOR.message_types_by_name['DroneBatteryHealth'] = _DRONEBATTERYHEALTH
DESCRIPTOR.message_types_by_name['DroneRadioSignal'] = _DRONERADIOSIGNAL
DESCRIPTOR.message_types_by_name['DroneFlyingState'] = _DRONEFLYINGSTATE
DESCRIPTOR.message_types_by_name['DroneRequestPosition'] = _DRONEREQUESTPOSITION
DESCRIPTOR.message_types_by_name['DronePosition'] = _DRONEPOSITION
DESCRIPTOR.message_types_by_name['DroneReply'] = _DRONEREPLY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

FileEntry = _reflection.GeneratedProtocolMessageType('FileEntry', (_message.Message,), dict(
  DESCRIPTOR = _FILEENTRY,
  __module__ = 'drohub_pb2'
  # @@protoc_insertion_point(class_scope:FileEntry)
  ))
_sym_db.RegisterMessage(FileEntry)

DroneSendVideoRequest = _reflection.GeneratedProtocolMessageType('DroneSendVideoRequest', (_message.Message,), dict(
  DESCRIPTOR = _DRONESENDVIDEOREQUEST,
  __module__ = 'drohub_pb2'
  # @@protoc_insertion_point(class_scope:DroneSendVideoRequest)
  ))
_sym_db.RegisterMessage(DroneSendVideoRequest)

DroneVideoState = _reflection.GeneratedProtocolMessageType('DroneVideoState', (_message.Message,), dict(
  DESCRIPTOR = _DRONEVIDEOSTATE,
  __module__ = 'drohub_pb2'
  # @@protoc_insertion_point(class_scope:DroneVideoState)
  ))
_sym_db.RegisterMessage(DroneVideoState)

DroneFileList = _reflection.GeneratedProtocolMessageType('DroneFileList', (_message.Message,), dict(
  DESCRIPTOR = _DRONEFILELIST,
  __module__ = 'drohub_pb2'
  # @@protoc_insertion_point(class_scope:DroneFileList)
  ))
_sym_db.RegisterMessage(DroneFileList)

DroneRequest = _reflection.GeneratedProtocolMessageType('DroneRequest', (_message.Message,), dict(
  DESCRIPTOR = _DRONEREQUEST,
  __module__ = 'drohub_pb2'
  # @@protoc_insertion_point(class_scope:DroneRequest)
  ))
_sym_db.RegisterMessage(DroneRequest)

DroneBatteryLevel = _reflection.GeneratedProtocolMessageType('DroneBatteryLevel', (_message.Message,), dict(
  DESCRIPTOR = _DRONEBATTERYLEVEL,
  __module__ = 'drohub_pb2'
  # @@protoc_insertion_point(class_scope:DroneBatteryLevel)
  ))
_sym_db.RegisterMessage(DroneBatteryLevel)

DroneBatteryHealth = _reflection.GeneratedProtocolMessageType('DroneBatteryHealth', (_message.Message,), dict(
  DESCRIPTOR = _DRONEBATTERYHEALTH,
  __module__ = 'drohub_pb2'
  # @@protoc_insertion_point(class_scope:DroneBatteryHealth)
  ))
_sym_db.RegisterMessage(DroneBatteryHealth)

DroneRadioSignal = _reflection.GeneratedProtocolMessageType('DroneRadioSignal', (_message.Message,), dict(
  DESCRIPTOR = _DRONERADIOSIGNAL,
  __module__ = 'drohub_pb2'
  # @@protoc_insertion_point(class_scope:DroneRadioSignal)
  ))
_sym_db.RegisterMessage(DroneRadioSignal)

DroneFlyingState = _reflection.GeneratedProtocolMessageType('DroneFlyingState', (_message.Message,), dict(
  DESCRIPTOR = _DRONEFLYINGSTATE,
  __module__ = 'drohub_pb2'
  # @@protoc_insertion_point(class_scope:DroneFlyingState)
  ))
_sym_db.RegisterMessage(DroneFlyingState)

DroneRequestPosition = _reflection.GeneratedProtocolMessageType('DroneRequestPosition', (_message.Message,), dict(
  DESCRIPTOR = _DRONEREQUESTPOSITION,
  __module__ = 'drohub_pb2'
  # @@protoc_insertion_point(class_scope:DroneRequestPosition)
  ))
_sym_db.RegisterMessage(DroneRequestPosition)

DronePosition = _reflection.GeneratedProtocolMessageType('DronePosition', (_message.Message,), dict(
  DESCRIPTOR = _DRONEPOSITION,
  __module__ = 'drohub_pb2'
  # @@protoc_insertion_point(class_scope:DronePosition)
  ))
_sym_db.RegisterMessage(DronePosition)

DroneReply = _reflection.GeneratedProtocolMessageType('DroneReply', (_message.Message,), dict(
  DESCRIPTOR = _DRONEREPLY,
  __module__ = 'drohub_pb2'
  # @@protoc_insertion_point(class_scope:DroneReply)
  ))
_sym_db.RegisterMessage(DroneReply)



_DRONE = _descriptor.ServiceDescriptor(
  name='Drone',
  full_name='Drone',
  file=DESCRIPTOR,
  index=0,
  options=None,
  serialized_start=1465,
  serialized_end=2046,
  methods=[
  _descriptor.MethodDescriptor(
    name='pingService',
    full_name='Drone.pingService',
    index=0,
    containing_service=None,
    input_type=_DRONEREQUEST,
    output_type=_DRONEREPLY,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='sendVideoTo',
    full_name='Drone.sendVideoTo',
    index=1,
    containing_service=None,
    input_type=_DRONESENDVIDEOREQUEST,
    output_type=_DRONEVIDEOSTATE,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='doTakeoff',
    full_name='Drone.doTakeoff',
    index=2,
    containing_service=None,
    input_type=_DRONEREQUEST,
    output_type=_DRONEREPLY,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='doLanding',
    full_name='Drone.doLanding',
    index=3,
    containing_service=None,
    input_type=_DRONEREQUEST,
    output_type=_DRONEREPLY,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='getPosition',
    full_name='Drone.getPosition',
    index=4,
    containing_service=None,
    input_type=_DRONEREQUEST,
    output_type=_DRONEPOSITION,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='getBatteryLevel',
    full_name='Drone.getBatteryLevel',
    index=5,
    containing_service=None,
    input_type=_DRONEREQUEST,
    output_type=_DRONEBATTERYLEVEL,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='getFlyingState',
    full_name='Drone.getFlyingState',
    index=6,
    containing_service=None,
    input_type=_DRONEREQUEST,
    output_type=_DRONEFLYINGSTATE,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='getRadioSignal',
    full_name='Drone.getRadioSignal',
    index=7,
    containing_service=None,
    input_type=_DRONEREQUEST,
    output_type=_DRONERADIOSIGNAL,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='moveToPosition',
    full_name='Drone.moveToPosition',
    index=8,
    containing_service=None,
    input_type=_DRONEREQUESTPOSITION,
    output_type=_DRONEREPLY,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='getFileList',
    full_name='Drone.getFileList',
    index=9,
    containing_service=None,
    input_type=_DRONEREQUEST,
    output_type=_DRONEFILELIST,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='getFileListStream',
    full_name='Drone.getFileListStream',
    index=10,
    containing_service=None,
    input_type=_DRONEREQUEST,
    output_type=_DRONEFILELIST,
    options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_DRONE)

DESCRIPTOR.services_by_name['Drone'] = _DRONE

# @@protoc_insertion_point(module_scope)
