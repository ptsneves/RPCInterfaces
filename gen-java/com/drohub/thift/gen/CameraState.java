/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.drohub.thift.gen;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)")
public class CameraState implements org.apache.thrift.TBase<CameraState, CameraState._Fields>, java.io.Serializable, Cloneable, Comparable<CameraState> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CameraState");

  private static final org.apache.thrift.protocol.TField MODE_FIELD_DESC = new org.apache.thrift.protocol.TField("mode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ZOOM_LEVEL_FIELD_DESC = new org.apache.thrift.protocol.TField("zoom_level", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField MIN_ZOOM_FIELD_DESC = new org.apache.thrift.protocol.TField("min_zoom", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField MAX_ZOOM_FIELD_DESC = new org.apache.thrift.protocol.TField("max_zoom", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField SERIAL_FIELD_DESC = new org.apache.thrift.protocol.TField("serial", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp", org.apache.thrift.protocol.TType.I64, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CameraStateStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CameraStateTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable CameraMode mode; // required
  public double zoom_level; // required
  public double min_zoom; // required
  public double max_zoom; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String serial; // required
  public long timestamp; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MODE((short)1, "mode"),
    ZOOM_LEVEL((short)2, "zoom_level"),
    MIN_ZOOM((short)3, "min_zoom"),
    MAX_ZOOM((short)4, "max_zoom"),
    SERIAL((short)5, "serial"),
    TIMESTAMP((short)6, "timestamp");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MODE
          return MODE;
        case 2: // ZOOM_LEVEL
          return ZOOM_LEVEL;
        case 3: // MIN_ZOOM
          return MIN_ZOOM;
        case 4: // MAX_ZOOM
          return MAX_ZOOM;
        case 5: // SERIAL
          return SERIAL;
        case 6: // TIMESTAMP
          return TIMESTAMP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ZOOM_LEVEL_ISSET_ID = 0;
  private static final int __MIN_ZOOM_ISSET_ID = 1;
  private static final int __MAX_ZOOM_ISSET_ID = 2;
  private static final int __TIMESTAMP_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MODE, new org.apache.thrift.meta_data.FieldMetaData("mode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.ENUM        , "CameraMode")));
    tmpMap.put(_Fields.ZOOM_LEVEL, new org.apache.thrift.meta_data.FieldMetaData("zoom_level", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.MIN_ZOOM, new org.apache.thrift.meta_data.FieldMetaData("min_zoom", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.MAX_ZOOM, new org.apache.thrift.meta_data.FieldMetaData("max_zoom", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.SERIAL, new org.apache.thrift.meta_data.FieldMetaData("serial", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("timestamp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CameraState.class, metaDataMap);
  }

  public CameraState() {
  }

  public CameraState(
    CameraMode mode,
    double zoom_level,
    double min_zoom,
    double max_zoom,
    java.lang.String serial,
    long timestamp)
  {
    this();
    this.mode = mode;
    this.zoom_level = zoom_level;
    setZoom_levelIsSet(true);
    this.min_zoom = min_zoom;
    setMin_zoomIsSet(true);
    this.max_zoom = max_zoom;
    setMax_zoomIsSet(true);
    this.serial = serial;
    this.timestamp = timestamp;
    setTimestampIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CameraState(CameraState other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMode()) {
      this.mode = other.mode;
    }
    this.zoom_level = other.zoom_level;
    this.min_zoom = other.min_zoom;
    this.max_zoom = other.max_zoom;
    if (other.isSetSerial()) {
      this.serial = other.serial;
    }
    this.timestamp = other.timestamp;
  }

  public CameraState deepCopy() {
    return new CameraState(this);
  }

  @Override
  public void clear() {
    this.mode = null;
    setZoom_levelIsSet(false);
    this.zoom_level = 0.0;
    setMin_zoomIsSet(false);
    this.min_zoom = 0.0;
    setMax_zoomIsSet(false);
    this.max_zoom = 0.0;
    this.serial = null;
    setTimestampIsSet(false);
    this.timestamp = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public CameraMode getMode() {
    return this.mode;
  }

  public CameraState setMode(@org.apache.thrift.annotation.Nullable CameraMode mode) {
    this.mode = mode;
    return this;
  }

  public void unsetMode() {
    this.mode = null;
  }

  /** Returns true if field mode is set (has been assigned a value) and false otherwise */
  public boolean isSetMode() {
    return this.mode != null;
  }

  public void setModeIsSet(boolean value) {
    if (!value) {
      this.mode = null;
    }
  }

  public double getZoom_level() {
    return this.zoom_level;
  }

  public CameraState setZoom_level(double zoom_level) {
    this.zoom_level = zoom_level;
    setZoom_levelIsSet(true);
    return this;
  }

  public void unsetZoom_level() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ZOOM_LEVEL_ISSET_ID);
  }

  /** Returns true if field zoom_level is set (has been assigned a value) and false otherwise */
  public boolean isSetZoom_level() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ZOOM_LEVEL_ISSET_ID);
  }

  public void setZoom_levelIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ZOOM_LEVEL_ISSET_ID, value);
  }

  public double getMin_zoom() {
    return this.min_zoom;
  }

  public CameraState setMin_zoom(double min_zoom) {
    this.min_zoom = min_zoom;
    setMin_zoomIsSet(true);
    return this;
  }

  public void unsetMin_zoom() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MIN_ZOOM_ISSET_ID);
  }

  /** Returns true if field min_zoom is set (has been assigned a value) and false otherwise */
  public boolean isSetMin_zoom() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MIN_ZOOM_ISSET_ID);
  }

  public void setMin_zoomIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MIN_ZOOM_ISSET_ID, value);
  }

  public double getMax_zoom() {
    return this.max_zoom;
  }

  public CameraState setMax_zoom(double max_zoom) {
    this.max_zoom = max_zoom;
    setMax_zoomIsSet(true);
    return this;
  }

  public void unsetMax_zoom() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MAX_ZOOM_ISSET_ID);
  }

  /** Returns true if field max_zoom is set (has been assigned a value) and false otherwise */
  public boolean isSetMax_zoom() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MAX_ZOOM_ISSET_ID);
  }

  public void setMax_zoomIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MAX_ZOOM_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSerial() {
    return this.serial;
  }

  public CameraState setSerial(@org.apache.thrift.annotation.Nullable java.lang.String serial) {
    this.serial = serial;
    return this;
  }

  public void unsetSerial() {
    this.serial = null;
  }

  /** Returns true if field serial is set (has been assigned a value) and false otherwise */
  public boolean isSetSerial() {
    return this.serial != null;
  }

  public void setSerialIsSet(boolean value) {
    if (!value) {
      this.serial = null;
    }
  }

  public long getTimestamp() {
    return this.timestamp;
  }

  public CameraState setTimestamp(long timestamp) {
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    return this;
  }

  public void unsetTimestamp() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field timestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestamp() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  public void setTimestampIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TIMESTAMP_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case MODE:
      if (value == null) {
        unsetMode();
      } else {
        setMode((CameraMode)value);
      }
      break;

    case ZOOM_LEVEL:
      if (value == null) {
        unsetZoom_level();
      } else {
        setZoom_level((java.lang.Double)value);
      }
      break;

    case MIN_ZOOM:
      if (value == null) {
        unsetMin_zoom();
      } else {
        setMin_zoom((java.lang.Double)value);
      }
      break;

    case MAX_ZOOM:
      if (value == null) {
        unsetMax_zoom();
      } else {
        setMax_zoom((java.lang.Double)value);
      }
      break;

    case SERIAL:
      if (value == null) {
        unsetSerial();
      } else {
        setSerial((java.lang.String)value);
      }
      break;

    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case MODE:
      return getMode();

    case ZOOM_LEVEL:
      return getZoom_level();

    case MIN_ZOOM:
      return getMin_zoom();

    case MAX_ZOOM:
      return getMax_zoom();

    case SERIAL:
      return getSerial();

    case TIMESTAMP:
      return getTimestamp();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case MODE:
      return isSetMode();
    case ZOOM_LEVEL:
      return isSetZoom_level();
    case MIN_ZOOM:
      return isSetMin_zoom();
    case MAX_ZOOM:
      return isSetMax_zoom();
    case SERIAL:
      return isSetSerial();
    case TIMESTAMP:
      return isSetTimestamp();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof CameraState)
      return this.equals((CameraState)that);
    return false;
  }

  public boolean equals(CameraState that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_mode = true && this.isSetMode();
    boolean that_present_mode = true && that.isSetMode();
    if (this_present_mode || that_present_mode) {
      if (!(this_present_mode && that_present_mode))
        return false;
      if (!this.mode.equals(that.mode))
        return false;
    }

    boolean this_present_zoom_level = true;
    boolean that_present_zoom_level = true;
    if (this_present_zoom_level || that_present_zoom_level) {
      if (!(this_present_zoom_level && that_present_zoom_level))
        return false;
      if (this.zoom_level != that.zoom_level)
        return false;
    }

    boolean this_present_min_zoom = true;
    boolean that_present_min_zoom = true;
    if (this_present_min_zoom || that_present_min_zoom) {
      if (!(this_present_min_zoom && that_present_min_zoom))
        return false;
      if (this.min_zoom != that.min_zoom)
        return false;
    }

    boolean this_present_max_zoom = true;
    boolean that_present_max_zoom = true;
    if (this_present_max_zoom || that_present_max_zoom) {
      if (!(this_present_max_zoom && that_present_max_zoom))
        return false;
      if (this.max_zoom != that.max_zoom)
        return false;
    }

    boolean this_present_serial = true && this.isSetSerial();
    boolean that_present_serial = true && that.isSetSerial();
    if (this_present_serial || that_present_serial) {
      if (!(this_present_serial && that_present_serial))
        return false;
      if (!this.serial.equals(that.serial))
        return false;
    }

    boolean this_present_timestamp = true;
    boolean that_present_timestamp = true;
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (this.timestamp != that.timestamp)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMode()) ? 131071 : 524287);
    if (isSetMode())
      hashCode = hashCode * 8191 + mode.getValue();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(zoom_level);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(min_zoom);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(max_zoom);

    hashCode = hashCode * 8191 + ((isSetSerial()) ? 131071 : 524287);
    if (isSetSerial())
      hashCode = hashCode * 8191 + serial.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(timestamp);

    return hashCode;
  }

  @Override
  public int compareTo(CameraState other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetMode(), other.isSetMode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mode, other.mode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetZoom_level(), other.isSetZoom_level());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetZoom_level()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.zoom_level, other.zoom_level);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMin_zoom(), other.isSetMin_zoom());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMin_zoom()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.min_zoom, other.min_zoom);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMax_zoom(), other.isSetMax_zoom());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMax_zoom()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.max_zoom, other.max_zoom);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSerial(), other.isSetSerial());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSerial()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serial, other.serial);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTimestamp(), other.isSetTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestamp, other.timestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraState(");
    boolean first = true;

    sb.append("mode:");
    if (this.mode == null) {
      sb.append("null");
    } else {
      sb.append(this.mode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("zoom_level:");
    sb.append(this.zoom_level);
    first = false;
    if (!first) sb.append(", ");
    sb.append("min_zoom:");
    sb.append(this.min_zoom);
    first = false;
    if (!first) sb.append(", ");
    sb.append("max_zoom:");
    sb.append(this.max_zoom);
    first = false;
    if (!first) sb.append(", ");
    sb.append("serial:");
    if (this.serial == null) {
      sb.append("null");
    } else {
      sb.append(this.serial);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("timestamp:");
    sb.append(this.timestamp);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CameraStateStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CameraStateStandardScheme getScheme() {
      return new CameraStateStandardScheme();
    }
  }

  private static class CameraStateStandardScheme extends org.apache.thrift.scheme.StandardScheme<CameraState> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CameraState struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.mode = com.drohub.thift.gen.CameraMode.findByValue(iprot.readI32());
              struct.setModeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ZOOM_LEVEL
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.zoom_level = iprot.readDouble();
              struct.setZoom_levelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MIN_ZOOM
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.min_zoom = iprot.readDouble();
              struct.setMin_zoomIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MAX_ZOOM
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.max_zoom = iprot.readDouble();
              struct.setMax_zoomIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SERIAL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.serial = iprot.readString();
              struct.setSerialIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timestamp = iprot.readI64();
              struct.setTimestampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CameraState struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.mode != null) {
        oprot.writeFieldBegin(MODE_FIELD_DESC);
        oprot.writeI32(struct.mode.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ZOOM_LEVEL_FIELD_DESC);
      oprot.writeDouble(struct.zoom_level);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MIN_ZOOM_FIELD_DESC);
      oprot.writeDouble(struct.min_zoom);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MAX_ZOOM_FIELD_DESC);
      oprot.writeDouble(struct.max_zoom);
      oprot.writeFieldEnd();
      if (struct.serial != null) {
        oprot.writeFieldBegin(SERIAL_FIELD_DESC);
        oprot.writeString(struct.serial);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
      oprot.writeI64(struct.timestamp);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CameraStateTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CameraStateTupleScheme getScheme() {
      return new CameraStateTupleScheme();
    }
  }

  private static class CameraStateTupleScheme extends org.apache.thrift.scheme.TupleScheme<CameraState> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CameraState struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMode()) {
        optionals.set(0);
      }
      if (struct.isSetZoom_level()) {
        optionals.set(1);
      }
      if (struct.isSetMin_zoom()) {
        optionals.set(2);
      }
      if (struct.isSetMax_zoom()) {
        optionals.set(3);
      }
      if (struct.isSetSerial()) {
        optionals.set(4);
      }
      if (struct.isSetTimestamp()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetMode()) {
        oprot.writeI32(struct.mode.getValue());
      }
      if (struct.isSetZoom_level()) {
        oprot.writeDouble(struct.zoom_level);
      }
      if (struct.isSetMin_zoom()) {
        oprot.writeDouble(struct.min_zoom);
      }
      if (struct.isSetMax_zoom()) {
        oprot.writeDouble(struct.max_zoom);
      }
      if (struct.isSetSerial()) {
        oprot.writeString(struct.serial);
      }
      if (struct.isSetTimestamp()) {
        oprot.writeI64(struct.timestamp);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CameraState struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.mode = com.drohub.thift.gen.CameraMode.findByValue(iprot.readI32());
        struct.setModeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.zoom_level = iprot.readDouble();
        struct.setZoom_levelIsSet(true);
      }
      if (incoming.get(2)) {
        struct.min_zoom = iprot.readDouble();
        struct.setMin_zoomIsSet(true);
      }
      if (incoming.get(3)) {
        struct.max_zoom = iprot.readDouble();
        struct.setMax_zoomIsSet(true);
      }
      if (incoming.get(4)) {
        struct.serial = iprot.readString();
        struct.setSerialIsSet(true);
      }
      if (incoming.get(5)) {
        struct.timestamp = iprot.readI64();
        struct.setTimestampIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

