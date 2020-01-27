/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.drohub.thift.gen;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-01-25")
public class DroneBatteryHealth implements org.apache.thrift.TBase<DroneBatteryHealth, DroneBatteryHealth._Fields>, java.io.Serializable, Cloneable, Comparable<DroneBatteryHealth> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DroneBatteryHealth");

  private static final org.apache.thrift.protocol.TField BATTERY_HEALTH_PERCENT_FIELD_DESC = new org.apache.thrift.protocol.TField("battery_health_percent", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField SERIAL_FIELD_DESC = new org.apache.thrift.protocol.TField("serial", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DroneBatteryHealthStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DroneBatteryHealthTupleSchemeFactory();

  public double battery_health_percent; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String serial; // required
  public long timestamp; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BATTERY_HEALTH_PERCENT((short)1, "battery_health_percent"),
    SERIAL((short)2, "serial"),
    TIMESTAMP((short)3, "timestamp");

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
        case 1: // BATTERY_HEALTH_PERCENT
          return BATTERY_HEALTH_PERCENT;
        case 2: // SERIAL
          return SERIAL;
        case 3: // TIMESTAMP
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
  private static final int __BATTERY_HEALTH_PERCENT_ISSET_ID = 0;
  private static final int __TIMESTAMP_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BATTERY_HEALTH_PERCENT, new org.apache.thrift.meta_data.FieldMetaData("battery_health_percent", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.SERIAL, new org.apache.thrift.meta_data.FieldMetaData("serial", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("timestamp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DroneBatteryHealth.class, metaDataMap);
  }

  public DroneBatteryHealth() {
  }

  public DroneBatteryHealth(
    double battery_health_percent,
    java.lang.String serial,
    long timestamp)
  {
    this();
    this.battery_health_percent = battery_health_percent;
    setBattery_health_percentIsSet(true);
    this.serial = serial;
    this.timestamp = timestamp;
    setTimestampIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DroneBatteryHealth(DroneBatteryHealth other) {
    __isset_bitfield = other.__isset_bitfield;
    this.battery_health_percent = other.battery_health_percent;
    if (other.isSetSerial()) {
      this.serial = other.serial;
    }
    this.timestamp = other.timestamp;
  }

  public DroneBatteryHealth deepCopy() {
    return new DroneBatteryHealth(this);
  }

  @Override
  public void clear() {
    setBattery_health_percentIsSet(false);
    this.battery_health_percent = 0.0;
    this.serial = null;
    setTimestampIsSet(false);
    this.timestamp = 0;
  }

  public double getBattery_health_percent() {
    return this.battery_health_percent;
  }

  public DroneBatteryHealth setBattery_health_percent(double battery_health_percent) {
    this.battery_health_percent = battery_health_percent;
    setBattery_health_percentIsSet(true);
    return this;
  }

  public void unsetBattery_health_percent() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BATTERY_HEALTH_PERCENT_ISSET_ID);
  }

  /** Returns true if field battery_health_percent is set (has been assigned a value) and false otherwise */
  public boolean isSetBattery_health_percent() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BATTERY_HEALTH_PERCENT_ISSET_ID);
  }

  public void setBattery_health_percentIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BATTERY_HEALTH_PERCENT_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSerial() {
    return this.serial;
  }

  public DroneBatteryHealth setSerial(@org.apache.thrift.annotation.Nullable java.lang.String serial) {
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

  public DroneBatteryHealth setTimestamp(long timestamp) {
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
    case BATTERY_HEALTH_PERCENT:
      if (value == null) {
        unsetBattery_health_percent();
      } else {
        setBattery_health_percent((java.lang.Double)value);
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
    case BATTERY_HEALTH_PERCENT:
      return getBattery_health_percent();

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
    case BATTERY_HEALTH_PERCENT:
      return isSetBattery_health_percent();
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
    if (that instanceof DroneBatteryHealth)
      return this.equals((DroneBatteryHealth)that);
    return false;
  }

  public boolean equals(DroneBatteryHealth that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_battery_health_percent = true;
    boolean that_present_battery_health_percent = true;
    if (this_present_battery_health_percent || that_present_battery_health_percent) {
      if (!(this_present_battery_health_percent && that_present_battery_health_percent))
        return false;
      if (this.battery_health_percent != that.battery_health_percent)
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

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(battery_health_percent);

    hashCode = hashCode * 8191 + ((isSetSerial()) ? 131071 : 524287);
    if (isSetSerial())
      hashCode = hashCode * 8191 + serial.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(timestamp);

    return hashCode;
  }

  @Override
  public int compareTo(DroneBatteryHealth other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetBattery_health_percent(), other.isSetBattery_health_percent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBattery_health_percent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.battery_health_percent, other.battery_health_percent);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("DroneBatteryHealth(");
    boolean first = true;

    sb.append("battery_health_percent:");
    sb.append(this.battery_health_percent);
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

  private static class DroneBatteryHealthStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DroneBatteryHealthStandardScheme getScheme() {
      return new DroneBatteryHealthStandardScheme();
    }
  }

  private static class DroneBatteryHealthStandardScheme extends org.apache.thrift.scheme.StandardScheme<DroneBatteryHealth> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DroneBatteryHealth struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BATTERY_HEALTH_PERCENT
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.battery_health_percent = iprot.readDouble();
              struct.setBattery_health_percentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SERIAL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.serial = iprot.readString();
              struct.setSerialIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TIMESTAMP
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DroneBatteryHealth struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(BATTERY_HEALTH_PERCENT_FIELD_DESC);
      oprot.writeDouble(struct.battery_health_percent);
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

  private static class DroneBatteryHealthTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DroneBatteryHealthTupleScheme getScheme() {
      return new DroneBatteryHealthTupleScheme();
    }
  }

  private static class DroneBatteryHealthTupleScheme extends org.apache.thrift.scheme.TupleScheme<DroneBatteryHealth> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DroneBatteryHealth struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetBattery_health_percent()) {
        optionals.set(0);
      }
      if (struct.isSetSerial()) {
        optionals.set(1);
      }
      if (struct.isSetTimestamp()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetBattery_health_percent()) {
        oprot.writeDouble(struct.battery_health_percent);
      }
      if (struct.isSetSerial()) {
        oprot.writeString(struct.serial);
      }
      if (struct.isSetTimestamp()) {
        oprot.writeI64(struct.timestamp);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DroneBatteryHealth struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.battery_health_percent = iprot.readDouble();
        struct.setBattery_health_percentIsSet(true);
      }
      if (incoming.get(1)) {
        struct.serial = iprot.readString();
        struct.setSerialIsSet(true);
      }
      if (incoming.get(2)) {
        struct.timestamp = iprot.readI64();
        struct.setTimestampIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

