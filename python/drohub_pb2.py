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
  serialized_pb=_b('\n\x0c\x64rohub.proto\"\x0e\n\x0c\x44roneRequest\"n\n\x14\x44roneRequestPosition\x12\x10\n\x08latitude\x18\x01 \x01(\x01\x12\x11\n\tlongitude\x18\x02 \x01(\x01\x12\x10\n\x08\x61ltitude\x18\x03 \x01(\x01\x12\x0f\n\x07heading\x18\x04 \x01(\x01\x12\x0e\n\x06serial\x18\x05 \x01(\t\"i\n\rDronePosition\x12\x10\n\x08latitude\x18\x01 \x01(\x01\x12\x11\n\tlongitude\x18\x02 \x01(\x01\x12\x10\n\x08\x61ltitude\x18\x03 \x01(\x01\x12\x0e\n\x06serial\x18\x04 \x01(\t\x12\x11\n\ttimestamp\x18\x05 \x01(\r\"\x1d\n\nDroneReply\x12\x0f\n\x07message\x18\x01 \x01(\x08\x32\xc7\x01\n\x05\x44rone\x12)\n\tdoTakeoff\x12\r.DroneRequest\x1a\x0b.DroneReply\"\x00\x12)\n\tdoLanding\x12\r.DroneRequest\x1a\x0b.DroneReply\"\x00\x12\x30\n\x0bgetPosition\x12\r.DroneRequest\x1a\x0e.DronePosition\"\x00\x30\x01\x12\x36\n\x0emoveToPosition\x12\x15.DroneRequestPosition\x1a\x0b.DroneReply\"\x00\x62\x06proto3')
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=16,
  serialized_end=30,
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
  serialized_start=32,
  serialized_end=142,
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
  serialized_start=144,
  serialized_end=249,
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
  serialized_start=251,
  serialized_end=280,
)

DESCRIPTOR.message_types_by_name['DroneRequest'] = _DRONEREQUEST
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
  serialized_start=283,
  serialized_end=482,
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
    name='moveToPosition',
    full_name='Drone.moveToPosition',
    index=3,
    containing_service=None,
    input_type=_DRONEREQUESTPOSITION,
    output_type=_DRONEREPLY,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_DRONE)

DESCRIPTOR.services_by_name['Drone'] = _DRONE

# @@protoc_insertion_point(module_scope)
