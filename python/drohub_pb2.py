# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: drohub.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='drohub.proto',
  package='',
  syntax='proto3',
  serialized_options=None,
  serialized_pb=_b('\n\x0c\x64rohub.proto\"\x0e\n\x0c\x44roneRequest\"U\n\x11\x44roneBatteryLevel\x12\x1d\n\x15\x62\x61ttery_level_percent\x18\x01 \x01(\x01\x12\x0e\n\x06serial\x18\x02 \x01(\t\x12\x11\n\ttimestamp\x18\x03 \x01(\r\"W\n\x12\x44roneBatteryHealth\x12\x1e\n\x16\x62\x61ttery_health_percent\x18\x01 \x01(\x01\x12\x0e\n\x06serial\x18\x02 \x01(\t\x12\x11\n\ttimestamp\x18\x03 \x01(\r\"n\n\x10\x44roneRadioSignal\x12\x18\n\x0esignal_quality\x18\x01 \x01(\x02H\x00\x12\x0e\n\x04rssi\x18\x02 \x01(\x02H\x00\x12\x0e\n\x06serial\x18\x03 \x01(\t\x12\x11\n\ttimestamp\x18\x04 \x01(\rB\r\n\x0bRadioOption\"\x81\x02\n\x10\x44roneFlyingState\x12,\n\x05state\x18\x01 \x01(\x0e\x32\x1d.DroneFlyingState.FlyingState\x12\x0e\n\x06serial\x18\x02 \x01(\t\x12\x11\n\ttimestamp\x18\x03 \x01(\r\"\x9b\x01\n\x0b\x46lyingState\x12\n\n\x06LANDED\x10\x00\x12\x0e\n\nTAKING_OFF\x10\x01\x12\x0c\n\x08HOVERING\x10\x02\x12\n\n\x06\x46LYING\x10\x03\x12\x0b\n\x07LANDING\x10\x04\x12\r\n\tEMERGENCY\x10\x05\x12\x10\n\x0cUSER_TAKEOFF\x10\x06\x12\x11\n\rMOTOR_RAMPING\x10\x07\x12\x15\n\x11\x45MERGENCY_LANDING\x10\x08\"n\n\x14\x44roneRequestPosition\x12\x10\n\x08latitude\x18\x01 \x01(\x01\x12\x11\n\tlongitude\x18\x02 \x01(\x01\x12\x10\n\x08\x61ltitude\x18\x03 \x01(\x01\x12\x0f\n\x07heading\x18\x04 \x01(\x01\x12\x0e\n\x06serial\x18\x05 \x01(\t\"i\n\rDronePosition\x12\x10\n\x08latitude\x18\x01 \x01(\x01\x12\x11\n\tlongitude\x18\x02 \x01(\x01\x12\x10\n\x08\x61ltitude\x18\x03 \x01(\x01\x12\x0e\n\x06serial\x18\x04 \x01(\t\x12\x11\n\ttimestamp\x18\x05 \x01(\r\"\x1d\n\nDroneReply\x12\x0f\n\x07message\x18\x01 \x01(\x08\x32\xf1\x02\n\x05\x44rone\x12)\n\tdoTakeoff\x12\r.DroneRequest\x1a\x0b.DroneReply\"\x00\x12)\n\tdoLanding\x12\r.DroneRequest\x1a\x0b.DroneReply\"\x00\x12\x30\n\x0bgetPosition\x12\r.DroneRequest\x1a\x0e.DronePosition\"\x00\x30\x01\x12\x38\n\x0fgetBatteryLevel\x12\r.DroneRequest\x1a\x12.DroneBatteryLevel\"\x00\x30\x01\x12\x36\n\x0egetFlyingState\x12\r.DroneRequest\x1a\x11.DroneFlyingState\"\x00\x30\x01\x12\x36\n\x0egetRadioSignal\x12\r.DroneRequest\x1a\x11.DroneRadioSignal\"\x00\x30\x01\x12\x36\n\x0emoveToPosition\x12\x15.DroneRequestPosition\x1a\x0b.DroneReply\"\x00\x62\x06proto3')
)



_DRONEFLYINGSTATE_FLYINGSTATE = _descriptor.EnumDescriptor(
  name='FlyingState',
  full_name='DroneFlyingState.FlyingState',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='LANDED', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='TAKING_OFF', index=1, number=1,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='HOVERING', index=2, number=2,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='FLYING', index=3, number=3,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='LANDING', index=4, number=4,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='EMERGENCY', index=5, number=5,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='USER_TAKEOFF', index=6, number=6,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='MOTOR_RAMPING', index=7, number=7,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='EMERGENCY_LANDING', index=8, number=8,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=423,
  serialized_end=578,
)
_sym_db.RegisterEnumDescriptor(_DRONEFLYINGSTATE_FLYINGSTATE)


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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=16,
  serialized_end=30,
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
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='serial', full_name='DroneBatteryLevel.serial', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='timestamp', full_name='DroneBatteryLevel.timestamp', index=2,
      number=3, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=32,
  serialized_end=117,
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
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='serial', full_name='DroneBatteryHealth.serial', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='timestamp', full_name='DroneBatteryHealth.timestamp', index=2,
      number=3, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=119,
  serialized_end=206,
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
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='rssi', full_name='DroneRadioSignal.rssi', index=1,
      number=2, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='serial', full_name='DroneRadioSignal.serial', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='timestamp', full_name='DroneRadioSignal.timestamp', index=3,
      number=4, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='RadioOption', full_name='DroneRadioSignal.RadioOption',
      index=0, containing_type=None, fields=[]),
  ],
  serialized_start=208,
  serialized_end=318,
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
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='serial', full_name='DroneFlyingState.serial', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='timestamp', full_name='DroneFlyingState.timestamp', index=2,
      number=3, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _DRONEFLYINGSTATE_FLYINGSTATE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=321,
  serialized_end=578,
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
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='longitude', full_name='DroneRequestPosition.longitude', index=1,
      number=2, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='altitude', full_name='DroneRequestPosition.altitude', index=2,
      number=3, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='heading', full_name='DroneRequestPosition.heading', index=3,
      number=4, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='serial', full_name='DroneRequestPosition.serial', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=580,
  serialized_end=690,
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
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='longitude', full_name='DronePosition.longitude', index=1,
      number=2, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='altitude', full_name='DronePosition.altitude', index=2,
      number=3, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='serial', full_name='DronePosition.serial', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='timestamp', full_name='DronePosition.timestamp', index=4,
      number=5, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=692,
  serialized_end=797,
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
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=799,
  serialized_end=828,
)

_DRONERADIOSIGNAL.oneofs_by_name['RadioOption'].fields.append(
  _DRONERADIOSIGNAL.fields_by_name['signal_quality'])
_DRONERADIOSIGNAL.fields_by_name['signal_quality'].containing_oneof = _DRONERADIOSIGNAL.oneofs_by_name['RadioOption']
_DRONERADIOSIGNAL.oneofs_by_name['RadioOption'].fields.append(
  _DRONERADIOSIGNAL.fields_by_name['rssi'])
_DRONERADIOSIGNAL.fields_by_name['rssi'].containing_oneof = _DRONERADIOSIGNAL.oneofs_by_name['RadioOption']
_DRONEFLYINGSTATE.fields_by_name['state'].enum_type = _DRONEFLYINGSTATE_FLYINGSTATE
_DRONEFLYINGSTATE_FLYINGSTATE.containing_type = _DRONEFLYINGSTATE
DESCRIPTOR.message_types_by_name['DroneRequest'] = _DRONEREQUEST
DESCRIPTOR.message_types_by_name['DroneBatteryLevel'] = _DRONEBATTERYLEVEL
DESCRIPTOR.message_types_by_name['DroneBatteryHealth'] = _DRONEBATTERYHEALTH
DESCRIPTOR.message_types_by_name['DroneRadioSignal'] = _DRONERADIOSIGNAL
DESCRIPTOR.message_types_by_name['DroneFlyingState'] = _DRONEFLYINGSTATE
DESCRIPTOR.message_types_by_name['DroneRequestPosition'] = _DRONEREQUESTPOSITION
DESCRIPTOR.message_types_by_name['DronePosition'] = _DRONEPOSITION
DESCRIPTOR.message_types_by_name['DroneReply'] = _DRONEREPLY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

DroneRequest = _reflection.GeneratedProtocolMessageType('DroneRequest', (_message.Message,), {
  'DESCRIPTOR' : _DRONEREQUEST,
  '__module__' : 'drohub_pb2'
  # @@protoc_insertion_point(class_scope:DroneRequest)
  })
_sym_db.RegisterMessage(DroneRequest)

DroneBatteryLevel = _reflection.GeneratedProtocolMessageType('DroneBatteryLevel', (_message.Message,), {
  'DESCRIPTOR' : _DRONEBATTERYLEVEL,
  '__module__' : 'drohub_pb2'
  # @@protoc_insertion_point(class_scope:DroneBatteryLevel)
  })
_sym_db.RegisterMessage(DroneBatteryLevel)

DroneBatteryHealth = _reflection.GeneratedProtocolMessageType('DroneBatteryHealth', (_message.Message,), {
  'DESCRIPTOR' : _DRONEBATTERYHEALTH,
  '__module__' : 'drohub_pb2'
  # @@protoc_insertion_point(class_scope:DroneBatteryHealth)
  })
_sym_db.RegisterMessage(DroneBatteryHealth)

DroneRadioSignal = _reflection.GeneratedProtocolMessageType('DroneRadioSignal', (_message.Message,), {
  'DESCRIPTOR' : _DRONERADIOSIGNAL,
  '__module__' : 'drohub_pb2'
  # @@protoc_insertion_point(class_scope:DroneRadioSignal)
  })
_sym_db.RegisterMessage(DroneRadioSignal)

DroneFlyingState = _reflection.GeneratedProtocolMessageType('DroneFlyingState', (_message.Message,), {
  'DESCRIPTOR' : _DRONEFLYINGSTATE,
  '__module__' : 'drohub_pb2'
  # @@protoc_insertion_point(class_scope:DroneFlyingState)
  })
_sym_db.RegisterMessage(DroneFlyingState)

DroneRequestPosition = _reflection.GeneratedProtocolMessageType('DroneRequestPosition', (_message.Message,), {
  'DESCRIPTOR' : _DRONEREQUESTPOSITION,
  '__module__' : 'drohub_pb2'
  # @@protoc_insertion_point(class_scope:DroneRequestPosition)
  })
_sym_db.RegisterMessage(DroneRequestPosition)

DronePosition = _reflection.GeneratedProtocolMessageType('DronePosition', (_message.Message,), {
  'DESCRIPTOR' : _DRONEPOSITION,
  '__module__' : 'drohub_pb2'
  # @@protoc_insertion_point(class_scope:DronePosition)
  })
_sym_db.RegisterMessage(DronePosition)

DroneReply = _reflection.GeneratedProtocolMessageType('DroneReply', (_message.Message,), {
  'DESCRIPTOR' : _DRONEREPLY,
  '__module__' : 'drohub_pb2'
  # @@protoc_insertion_point(class_scope:DroneReply)
  })
_sym_db.RegisterMessage(DroneReply)



_DRONE = _descriptor.ServiceDescriptor(
  name='Drone',
  full_name='Drone',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=831,
  serialized_end=1200,
  methods=[
  _descriptor.MethodDescriptor(
    name='doTakeoff',
    full_name='Drone.doTakeoff',
    index=0,
    containing_service=None,
    input_type=_DRONEREQUEST,
    output_type=_DRONEREPLY,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='doLanding',
    full_name='Drone.doLanding',
    index=1,
    containing_service=None,
    input_type=_DRONEREQUEST,
    output_type=_DRONEREPLY,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='getPosition',
    full_name='Drone.getPosition',
    index=2,
    containing_service=None,
    input_type=_DRONEREQUEST,
    output_type=_DRONEPOSITION,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='getBatteryLevel',
    full_name='Drone.getBatteryLevel',
    index=3,
    containing_service=None,
    input_type=_DRONEREQUEST,
    output_type=_DRONEBATTERYLEVEL,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='getFlyingState',
    full_name='Drone.getFlyingState',
    index=4,
    containing_service=None,
    input_type=_DRONEREQUEST,
    output_type=_DRONEFLYINGSTATE,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='getRadioSignal',
    full_name='Drone.getRadioSignal',
    index=5,
    containing_service=None,
    input_type=_DRONEREQUEST,
    output_type=_DRONERADIOSIGNAL,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='moveToPosition',
    full_name='Drone.moveToPosition',
    index=6,
    containing_service=None,
    input_type=_DRONEREQUESTPOSITION,
    output_type=_DRONEREPLY,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_DRONE)

DESCRIPTOR.services_by_name['Drone'] = _DRONE

# @@protoc_insertion_point(module_scope)
