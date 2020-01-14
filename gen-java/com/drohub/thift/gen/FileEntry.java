/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.drohub.thift.gen;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-01-14")
public class FileEntry implements org.apache.thrift.TBase<FileEntry, FileEntry._Fields>, java.io.Serializable, Cloneable, Comparable<FileEntry> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FileEntry");

  private static final org.apache.thrift.protocol.TField RESOURCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("resource_id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField THUMBNAIL_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("thumbnail_id", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField RESOURCE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("resource_type", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new FileEntryStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new FileEntryTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String resource_id; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String thumbnail_id; // optional
  /**
   * 
   * @see FileResourceType
   */
  public @org.apache.thrift.annotation.Nullable FileResourceType resource_type; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESOURCE_ID((short)1, "resource_id"),
    THUMBNAIL_ID((short)2, "thumbnail_id"),
    /**
     * 
     * @see FileResourceType
     */
    RESOURCE_TYPE((short)3, "resource_type");

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
        case 1: // RESOURCE_ID
          return RESOURCE_ID;
        case 2: // THUMBNAIL_ID
          return THUMBNAIL_ID;
        case 3: // RESOURCE_TYPE
          return RESOURCE_TYPE;
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
  private static final _Fields optionals[] = {_Fields.THUMBNAIL_ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESOURCE_ID, new org.apache.thrift.meta_data.FieldMetaData("resource_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.THUMBNAIL_ID, new org.apache.thrift.meta_data.FieldMetaData("thumbnail_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RESOURCE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("resource_type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, FileResourceType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FileEntry.class, metaDataMap);
  }

  public FileEntry() {
  }

  public FileEntry(
    java.lang.String resource_id,
    FileResourceType resource_type)
  {
    this();
    this.resource_id = resource_id;
    this.resource_type = resource_type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FileEntry(FileEntry other) {
    if (other.isSetResource_id()) {
      this.resource_id = other.resource_id;
    }
    if (other.isSetThumbnail_id()) {
      this.thumbnail_id = other.thumbnail_id;
    }
    if (other.isSetResource_type()) {
      this.resource_type = other.resource_type;
    }
  }

  public FileEntry deepCopy() {
    return new FileEntry(this);
  }

  @Override
  public void clear() {
    this.resource_id = null;
    this.thumbnail_id = null;
    this.resource_type = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getResource_id() {
    return this.resource_id;
  }

  public FileEntry setResource_id(@org.apache.thrift.annotation.Nullable java.lang.String resource_id) {
    this.resource_id = resource_id;
    return this;
  }

  public void unsetResource_id() {
    this.resource_id = null;
  }

  /** Returns true if field resource_id is set (has been assigned a value) and false otherwise */
  public boolean isSetResource_id() {
    return this.resource_id != null;
  }

  public void setResource_idIsSet(boolean value) {
    if (!value) {
      this.resource_id = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getThumbnail_id() {
    return this.thumbnail_id;
  }

  public FileEntry setThumbnail_id(@org.apache.thrift.annotation.Nullable java.lang.String thumbnail_id) {
    this.thumbnail_id = thumbnail_id;
    return this;
  }

  public void unsetThumbnail_id() {
    this.thumbnail_id = null;
  }

  /** Returns true if field thumbnail_id is set (has been assigned a value) and false otherwise */
  public boolean isSetThumbnail_id() {
    return this.thumbnail_id != null;
  }

  public void setThumbnail_idIsSet(boolean value) {
    if (!value) {
      this.thumbnail_id = null;
    }
  }

  /**
   * 
   * @see FileResourceType
   */
  @org.apache.thrift.annotation.Nullable
  public FileResourceType getResource_type() {
    return this.resource_type;
  }

  /**
   * 
   * @see FileResourceType
   */
  public FileEntry setResource_type(@org.apache.thrift.annotation.Nullable FileResourceType resource_type) {
    this.resource_type = resource_type;
    return this;
  }

  public void unsetResource_type() {
    this.resource_type = null;
  }

  /** Returns true if field resource_type is set (has been assigned a value) and false otherwise */
  public boolean isSetResource_type() {
    return this.resource_type != null;
  }

  public void setResource_typeIsSet(boolean value) {
    if (!value) {
      this.resource_type = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case RESOURCE_ID:
      if (value == null) {
        unsetResource_id();
      } else {
        setResource_id((java.lang.String)value);
      }
      break;

    case THUMBNAIL_ID:
      if (value == null) {
        unsetThumbnail_id();
      } else {
        setThumbnail_id((java.lang.String)value);
      }
      break;

    case RESOURCE_TYPE:
      if (value == null) {
        unsetResource_type();
      } else {
        setResource_type((FileResourceType)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case RESOURCE_ID:
      return getResource_id();

    case THUMBNAIL_ID:
      return getThumbnail_id();

    case RESOURCE_TYPE:
      return getResource_type();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case RESOURCE_ID:
      return isSetResource_id();
    case THUMBNAIL_ID:
      return isSetThumbnail_id();
    case RESOURCE_TYPE:
      return isSetResource_type();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof FileEntry)
      return this.equals((FileEntry)that);
    return false;
  }

  public boolean equals(FileEntry that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_resource_id = true && this.isSetResource_id();
    boolean that_present_resource_id = true && that.isSetResource_id();
    if (this_present_resource_id || that_present_resource_id) {
      if (!(this_present_resource_id && that_present_resource_id))
        return false;
      if (!this.resource_id.equals(that.resource_id))
        return false;
    }

    boolean this_present_thumbnail_id = true && this.isSetThumbnail_id();
    boolean that_present_thumbnail_id = true && that.isSetThumbnail_id();
    if (this_present_thumbnail_id || that_present_thumbnail_id) {
      if (!(this_present_thumbnail_id && that_present_thumbnail_id))
        return false;
      if (!this.thumbnail_id.equals(that.thumbnail_id))
        return false;
    }

    boolean this_present_resource_type = true && this.isSetResource_type();
    boolean that_present_resource_type = true && that.isSetResource_type();
    if (this_present_resource_type || that_present_resource_type) {
      if (!(this_present_resource_type && that_present_resource_type))
        return false;
      if (!this.resource_type.equals(that.resource_type))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetResource_id()) ? 131071 : 524287);
    if (isSetResource_id())
      hashCode = hashCode * 8191 + resource_id.hashCode();

    hashCode = hashCode * 8191 + ((isSetThumbnail_id()) ? 131071 : 524287);
    if (isSetThumbnail_id())
      hashCode = hashCode * 8191 + thumbnail_id.hashCode();

    hashCode = hashCode * 8191 + ((isSetResource_type()) ? 131071 : 524287);
    if (isSetResource_type())
      hashCode = hashCode * 8191 + resource_type.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(FileEntry other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetResource_id(), other.isSetResource_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResource_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resource_id, other.resource_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetThumbnail_id(), other.isSetThumbnail_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThumbnail_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.thumbnail_id, other.thumbnail_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetResource_type(), other.isSetResource_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResource_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resource_type, other.resource_type);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("FileEntry(");
    boolean first = true;

    sb.append("resource_id:");
    if (this.resource_id == null) {
      sb.append("null");
    } else {
      sb.append(this.resource_id);
    }
    first = false;
    if (isSetThumbnail_id()) {
      if (!first) sb.append(", ");
      sb.append("thumbnail_id:");
      if (this.thumbnail_id == null) {
        sb.append("null");
      } else {
        sb.append(this.thumbnail_id);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("resource_type:");
    if (this.resource_type == null) {
      sb.append("null");
    } else {
      sb.append(this.resource_type);
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

  private static class FileEntryStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public FileEntryStandardScheme getScheme() {
      return new FileEntryStandardScheme();
    }
  }

  private static class FileEntryStandardScheme extends org.apache.thrift.scheme.StandardScheme<FileEntry> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FileEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESOURCE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.resource_id = iprot.readString();
              struct.setResource_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // THUMBNAIL_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.thumbnail_id = iprot.readString();
              struct.setThumbnail_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RESOURCE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.resource_type = com.drohub.thift.gen.FileResourceType.findByValue(iprot.readI32());
              struct.setResource_typeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FileEntry struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.resource_id != null) {
        oprot.writeFieldBegin(RESOURCE_ID_FIELD_DESC);
        oprot.writeString(struct.resource_id);
        oprot.writeFieldEnd();
      }
      if (struct.thumbnail_id != null) {
        if (struct.isSetThumbnail_id()) {
          oprot.writeFieldBegin(THUMBNAIL_ID_FIELD_DESC);
          oprot.writeString(struct.thumbnail_id);
          oprot.writeFieldEnd();
        }
      }
      if (struct.resource_type != null) {
        oprot.writeFieldBegin(RESOURCE_TYPE_FIELD_DESC);
        oprot.writeI32(struct.resource_type.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FileEntryTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public FileEntryTupleScheme getScheme() {
      return new FileEntryTupleScheme();
    }
  }

  private static class FileEntryTupleScheme extends org.apache.thrift.scheme.TupleScheme<FileEntry> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FileEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetResource_id()) {
        optionals.set(0);
      }
      if (struct.isSetThumbnail_id()) {
        optionals.set(1);
      }
      if (struct.isSetResource_type()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetResource_id()) {
        oprot.writeString(struct.resource_id);
      }
      if (struct.isSetThumbnail_id()) {
        oprot.writeString(struct.thumbnail_id);
      }
      if (struct.isSetResource_type()) {
        oprot.writeI32(struct.resource_type.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FileEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.resource_id = iprot.readString();
        struct.setResource_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.thumbnail_id = iprot.readString();
        struct.setThumbnail_idIsSet(true);
      }
      if (incoming.get(2)) {
        struct.resource_type = com.drohub.thift.gen.FileResourceType.findByValue(iprot.readI32());
        struct.setResource_typeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
