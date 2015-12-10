/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emq.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-12-10")
public class MessageAttribute implements libthrift091.TBase<MessageAttribute, MessageAttribute._Fields>, java.io.Serializable, Cloneable, Comparable<MessageAttribute> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("MessageAttribute");

  private static final libthrift091.protocol.TField TYPE_FIELD_DESC = new libthrift091.protocol.TField("type", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField STRING_VALUE_FIELD_DESC = new libthrift091.protocol.TField("stringValue", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField BINARY_VALUE_FIELD_DESC = new libthrift091.protocol.TField("binaryValue", libthrift091.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MessageAttributeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MessageAttributeTupleSchemeFactory());
  }

  /**
   * must start with "STRING" or "BINARY", with an optional "." and a user-defined sub-type
   * like "STRING.INTEGER" or "BINARY.JPEG"
   * do not contain characters excepts alphabets, digits or "."
   * 
   */
  public String type; // required
  /**
   * must be set if type is "STRING"
   * 
   */
  public String stringValue; // optional
  /**
   * must be set if type is "BINARY"
   * 
   */
  public ByteBuffer binaryValue; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * must start with "STRING" or "BINARY", with an optional "." and a user-defined sub-type
     * like "STRING.INTEGER" or "BINARY.JPEG"
     * do not contain characters excepts alphabets, digits or "."
     * 
     */
    TYPE((short)1, "type"),
    /**
     * must be set if type is "STRING"
     * 
     */
    STRING_VALUE((short)2, "stringValue"),
    /**
     * must be set if type is "BINARY"
     * 
     */
    BINARY_VALUE((short)3, "binaryValue");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TYPE
          return TYPE;
        case 2: // STRING_VALUE
          return STRING_VALUE;
        case 3: // BINARY_VALUE
          return BINARY_VALUE;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.STRING_VALUE,_Fields.BINARY_VALUE};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new libthrift091.meta_data.FieldMetaData("type", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.STRING_VALUE, new libthrift091.meta_data.FieldMetaData("stringValue", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.BINARY_VALUE, new libthrift091.meta_data.FieldMetaData("binaryValue", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(MessageAttribute.class, metaDataMap);
  }

  public MessageAttribute() {
  }

  public MessageAttribute(
    String type)
  {
    this();
    this.type = type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MessageAttribute(MessageAttribute other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetStringValue()) {
      this.stringValue = other.stringValue;
    }
    if (other.isSetBinaryValue()) {
      this.binaryValue = libthrift091.TBaseHelper.copyBinary(other.binaryValue);
    }
  }

  public MessageAttribute deepCopy() {
    return new MessageAttribute(this);
  }

  @Override
  public void clear() {
    this.type = null;
    this.stringValue = null;
    this.binaryValue = null;
  }

  /**
   * must start with "STRING" or "BINARY", with an optional "." and a user-defined sub-type
   * like "STRING.INTEGER" or "BINARY.JPEG"
   * do not contain characters excepts alphabets, digits or "."
   * 
   */
  public String getType() {
    return this.type;
  }

  /**
   * must start with "STRING" or "BINARY", with an optional "." and a user-defined sub-type
   * like "STRING.INTEGER" or "BINARY.JPEG"
   * do not contain characters excepts alphabets, digits or "."
   * 
   */
  public MessageAttribute setType(String type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  /**
   * must be set if type is "STRING"
   * 
   */
  public String getStringValue() {
    return this.stringValue;
  }

  /**
   * must be set if type is "STRING"
   * 
   */
  public MessageAttribute setStringValue(String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  public void unsetStringValue() {
    this.stringValue = null;
  }

  /** Returns true if field stringValue is set (has been assigned a value) and false otherwise */
  public boolean isSetStringValue() {
    return this.stringValue != null;
  }

  public void setStringValueIsSet(boolean value) {
    if (!value) {
      this.stringValue = null;
    }
  }

  /**
   * must be set if type is "BINARY"
   * 
   */
  public byte[] getBinaryValue() {
    setBinaryValue(libthrift091.TBaseHelper.rightSize(binaryValue));
    return binaryValue == null ? null : binaryValue.array();
  }

  public ByteBuffer bufferForBinaryValue() {
    return libthrift091.TBaseHelper.copyBinary(binaryValue);
  }

  /**
   * must be set if type is "BINARY"
   * 
   */
  public MessageAttribute setBinaryValue(byte[] binaryValue) {
    this.binaryValue = binaryValue == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(binaryValue, binaryValue.length));
    return this;
  }

  public MessageAttribute setBinaryValue(ByteBuffer binaryValue) {
    this.binaryValue = libthrift091.TBaseHelper.copyBinary(binaryValue);
    return this;
  }

  public void unsetBinaryValue() {
    this.binaryValue = null;
  }

  /** Returns true if field binaryValue is set (has been assigned a value) and false otherwise */
  public boolean isSetBinaryValue() {
    return this.binaryValue != null;
  }

  public void setBinaryValueIsSet(boolean value) {
    if (!value) {
      this.binaryValue = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((String)value);
      }
      break;

    case STRING_VALUE:
      if (value == null) {
        unsetStringValue();
      } else {
        setStringValue((String)value);
      }
      break;

    case BINARY_VALUE:
      if (value == null) {
        unsetBinaryValue();
      } else {
        setBinaryValue((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case STRING_VALUE:
      return getStringValue();

    case BINARY_VALUE:
      return getBinaryValue();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case STRING_VALUE:
      return isSetStringValue();
    case BINARY_VALUE:
      return isSetBinaryValue();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MessageAttribute)
      return this.equals((MessageAttribute)that);
    return false;
  }

  public boolean equals(MessageAttribute that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_stringValue = true && this.isSetStringValue();
    boolean that_present_stringValue = true && that.isSetStringValue();
    if (this_present_stringValue || that_present_stringValue) {
      if (!(this_present_stringValue && that_present_stringValue))
        return false;
      if (!this.stringValue.equals(that.stringValue))
        return false;
    }

    boolean this_present_binaryValue = true && this.isSetBinaryValue();
    boolean that_present_binaryValue = true && that.isSetBinaryValue();
    if (this_present_binaryValue || that_present_binaryValue) {
      if (!(this_present_binaryValue && that_present_binaryValue))
        return false;
      if (!this.binaryValue.equals(that.binaryValue))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type);

    boolean present_stringValue = true && (isSetStringValue());
    list.add(present_stringValue);
    if (present_stringValue)
      list.add(stringValue);

    boolean present_binaryValue = true && (isSetBinaryValue());
    list.add(present_binaryValue);
    if (present_binaryValue)
      list.add(binaryValue);

    return list.hashCode();
  }

  @Override
  public int compareTo(MessageAttribute other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStringValue()).compareTo(other.isSetStringValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStringValue()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.stringValue, other.stringValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBinaryValue()).compareTo(other.isSetBinaryValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBinaryValue()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.binaryValue, other.binaryValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MessageAttribute(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (isSetStringValue()) {
      if (!first) sb.append(", ");
      sb.append("stringValue:");
      if (this.stringValue == null) {
        sb.append("null");
      } else {
        sb.append(this.stringValue);
      }
      first = false;
    }
    if (isSetBinaryValue()) {
      if (!first) sb.append(", ");
      sb.append("binaryValue:");
      if (this.binaryValue == null) {
        sb.append("null");
      } else {
        libthrift091.TBaseHelper.toString(this.binaryValue, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (type == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'type' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MessageAttributeStandardSchemeFactory implements SchemeFactory {
    public MessageAttributeStandardScheme getScheme() {
      return new MessageAttributeStandardScheme();
    }
  }

  private static class MessageAttributeStandardScheme extends StandardScheme<MessageAttribute> {

    public void read(libthrift091.protocol.TProtocol iprot, MessageAttribute struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.type = iprot.readString();
              struct.setTypeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STRING_VALUE
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.stringValue = iprot.readString();
              struct.setStringValueIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BINARY_VALUE
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.binaryValue = iprot.readBinary();
              struct.setBinaryValueIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, MessageAttribute struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeString(struct.type);
        oprot.writeFieldEnd();
      }
      if (struct.stringValue != null) {
        if (struct.isSetStringValue()) {
          oprot.writeFieldBegin(STRING_VALUE_FIELD_DESC);
          oprot.writeString(struct.stringValue);
          oprot.writeFieldEnd();
        }
      }
      if (struct.binaryValue != null) {
        if (struct.isSetBinaryValue()) {
          oprot.writeFieldBegin(BINARY_VALUE_FIELD_DESC);
          oprot.writeBinary(struct.binaryValue);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MessageAttributeTupleSchemeFactory implements SchemeFactory {
    public MessageAttributeTupleScheme getScheme() {
      return new MessageAttributeTupleScheme();
    }
  }

  private static class MessageAttributeTupleScheme extends TupleScheme<MessageAttribute> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, MessageAttribute struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.type);
      BitSet optionals = new BitSet();
      if (struct.isSetStringValue()) {
        optionals.set(0);
      }
      if (struct.isSetBinaryValue()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetStringValue()) {
        oprot.writeString(struct.stringValue);
      }
      if (struct.isSetBinaryValue()) {
        oprot.writeBinary(struct.binaryValue);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, MessageAttribute struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.type = iprot.readString();
      struct.setTypeIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.stringValue = iprot.readString();
        struct.setStringValueIsSet(true);
      }
      if (incoming.get(1)) {
        struct.binaryValue = iprot.readBinary();
        struct.setBinaryValueIsSet(true);
      }
    }
  }

}

