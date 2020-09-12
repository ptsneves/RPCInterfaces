/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.drohub.thift.gen;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)")
public class DroneTakePictureRequest implements org.apache.thrift.TBase<DroneTakePictureRequest, DroneTakePictureRequest._Fields>, java.io.Serializable, Cloneable, Comparable<DroneTakePictureRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DroneTakePictureRequest");

  private static final org.apache.thrift.protocol.TField ACTION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("action_type", org.apache.thrift.protocol.TType.I32, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DroneTakePictureRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DroneTakePictureRequestTupleSchemeFactory();

  /**
   * 
   * @see ActionType
   */
  public @org.apache.thrift.annotation.Nullable ActionType action_type; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see ActionType
     */
    ACTION_TYPE((short)1, "action_type");

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
        case 1: // ACTION_TYPE
          return ACTION_TYPE;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACTION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("action_type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ActionType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DroneTakePictureRequest.class, metaDataMap);
  }

  public DroneTakePictureRequest() {
  }

  public DroneTakePictureRequest(
    ActionType action_type)
  {
    this();
    this.action_type = action_type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DroneTakePictureRequest(DroneTakePictureRequest other) {
    if (other.isSetAction_type()) {
      this.action_type = other.action_type;
    }
  }

  public DroneTakePictureRequest deepCopy() {
    return new DroneTakePictureRequest(this);
  }

  @Override
  public void clear() {
    this.action_type = null;
  }

  /**
   * 
   * @see ActionType
   */
  @org.apache.thrift.annotation.Nullable
  public ActionType getAction_type() {
    return this.action_type;
  }

  /**
   * 
   * @see ActionType
   */
  public DroneTakePictureRequest setAction_type(@org.apache.thrift.annotation.Nullable ActionType action_type) {
    this.action_type = action_type;
    return this;
  }

  public void unsetAction_type() {
    this.action_type = null;
  }

  /** Returns true if field action_type is set (has been assigned a value) and false otherwise */
  public boolean isSetAction_type() {
    return this.action_type != null;
  }

  public void setAction_typeIsSet(boolean value) {
    if (!value) {
      this.action_type = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ACTION_TYPE:
      if (value == null) {
        unsetAction_type();
      } else {
        setAction_type((ActionType)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ACTION_TYPE:
      return getAction_type();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ACTION_TYPE:
      return isSetAction_type();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof DroneTakePictureRequest)
      return this.equals((DroneTakePictureRequest)that);
    return false;
  }

  public boolean equals(DroneTakePictureRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_action_type = true && this.isSetAction_type();
    boolean that_present_action_type = true && that.isSetAction_type();
    if (this_present_action_type || that_present_action_type) {
      if (!(this_present_action_type && that_present_action_type))
        return false;
      if (!this.action_type.equals(that.action_type))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetAction_type()) ? 131071 : 524287);
    if (isSetAction_type())
      hashCode = hashCode * 8191 + action_type.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(DroneTakePictureRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetAction_type(), other.isSetAction_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAction_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.action_type, other.action_type);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("DroneTakePictureRequest(");
    boolean first = true;

    sb.append("action_type:");
    if (this.action_type == null) {
      sb.append("null");
    } else {
      sb.append(this.action_type);
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DroneTakePictureRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DroneTakePictureRequestStandardScheme getScheme() {
      return new DroneTakePictureRequestStandardScheme();
    }
  }

  private static class DroneTakePictureRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<DroneTakePictureRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DroneTakePictureRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACTION_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.action_type = com.drohub.thift.gen.ActionType.findByValue(iprot.readI32());
              struct.setAction_typeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DroneTakePictureRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.action_type != null) {
        oprot.writeFieldBegin(ACTION_TYPE_FIELD_DESC);
        oprot.writeI32(struct.action_type.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DroneTakePictureRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DroneTakePictureRequestTupleScheme getScheme() {
      return new DroneTakePictureRequestTupleScheme();
    }
  }

  private static class DroneTakePictureRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<DroneTakePictureRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DroneTakePictureRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAction_type()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetAction_type()) {
        oprot.writeI32(struct.action_type.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DroneTakePictureRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.action_type = com.drohub.thift.gen.ActionType.findByValue(iprot.readI32());
        struct.setAction_typeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

