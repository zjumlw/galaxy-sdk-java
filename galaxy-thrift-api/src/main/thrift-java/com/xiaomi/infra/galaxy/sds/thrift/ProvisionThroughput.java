/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;

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
/**
 * 吞吐量配额
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-6-6")
public class ProvisionThroughput implements libthrift091.TBase<ProvisionThroughput, ProvisionThroughput._Fields>, java.io.Serializable, Cloneable, Comparable<ProvisionThroughput> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ProvisionThroughput");

  private static final libthrift091.protocol.TField READ_CAPACITY_FIELD_DESC = new libthrift091.protocol.TField("readCapacity", libthrift091.protocol.TType.I64, (short)1);
  private static final libthrift091.protocol.TField WRITE_CAPACITY_FIELD_DESC = new libthrift091.protocol.TField("writeCapacity", libthrift091.protocol.TType.I64, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ProvisionThroughputStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ProvisionThroughputTupleSchemeFactory());
  }

  public long readCapacity; // optional
  public long writeCapacity; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    READ_CAPACITY((short)1, "readCapacity"),
    WRITE_CAPACITY((short)2, "writeCapacity");

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
        case 1: // READ_CAPACITY
          return READ_CAPACITY;
        case 2: // WRITE_CAPACITY
          return WRITE_CAPACITY;
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
  private static final int __READCAPACITY_ISSET_ID = 0;
  private static final int __WRITECAPACITY_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.READ_CAPACITY,_Fields.WRITE_CAPACITY};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.READ_CAPACITY, new libthrift091.meta_data.FieldMetaData("readCapacity", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.WRITE_CAPACITY, new libthrift091.meta_data.FieldMetaData("writeCapacity", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ProvisionThroughput.class, metaDataMap);
  }

  public ProvisionThroughput() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProvisionThroughput(ProvisionThroughput other) {
    __isset_bitfield = other.__isset_bitfield;
    this.readCapacity = other.readCapacity;
    this.writeCapacity = other.writeCapacity;
  }

  public ProvisionThroughput deepCopy() {
    return new ProvisionThroughput(this);
  }

  @Override
  public void clear() {
    setReadCapacityIsSet(false);
    this.readCapacity = 0;
    setWriteCapacityIsSet(false);
    this.writeCapacity = 0;
  }

  public long getReadCapacity() {
    return this.readCapacity;
  }

  public ProvisionThroughput setReadCapacity(long readCapacity) {
    this.readCapacity = readCapacity;
    setReadCapacityIsSet(true);
    return this;
  }

  public void unsetReadCapacity() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __READCAPACITY_ISSET_ID);
  }

  /** Returns true if field readCapacity is set (has been assigned a value) and false otherwise */
  public boolean isSetReadCapacity() {
    return EncodingUtils.testBit(__isset_bitfield, __READCAPACITY_ISSET_ID);
  }

  public void setReadCapacityIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __READCAPACITY_ISSET_ID, value);
  }

  public long getWriteCapacity() {
    return this.writeCapacity;
  }

  public ProvisionThroughput setWriteCapacity(long writeCapacity) {
    this.writeCapacity = writeCapacity;
    setWriteCapacityIsSet(true);
    return this;
  }

  public void unsetWriteCapacity() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WRITECAPACITY_ISSET_ID);
  }

  /** Returns true if field writeCapacity is set (has been assigned a value) and false otherwise */
  public boolean isSetWriteCapacity() {
    return EncodingUtils.testBit(__isset_bitfield, __WRITECAPACITY_ISSET_ID);
  }

  public void setWriteCapacityIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WRITECAPACITY_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case READ_CAPACITY:
      if (value == null) {
        unsetReadCapacity();
      } else {
        setReadCapacity((Long)value);
      }
      break;

    case WRITE_CAPACITY:
      if (value == null) {
        unsetWriteCapacity();
      } else {
        setWriteCapacity((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case READ_CAPACITY:
      return Long.valueOf(getReadCapacity());

    case WRITE_CAPACITY:
      return Long.valueOf(getWriteCapacity());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case READ_CAPACITY:
      return isSetReadCapacity();
    case WRITE_CAPACITY:
      return isSetWriteCapacity();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ProvisionThroughput)
      return this.equals((ProvisionThroughput)that);
    return false;
  }

  public boolean equals(ProvisionThroughput that) {
    if (that == null)
      return false;

    boolean this_present_readCapacity = true && this.isSetReadCapacity();
    boolean that_present_readCapacity = true && that.isSetReadCapacity();
    if (this_present_readCapacity || that_present_readCapacity) {
      if (!(this_present_readCapacity && that_present_readCapacity))
        return false;
      if (this.readCapacity != that.readCapacity)
        return false;
    }

    boolean this_present_writeCapacity = true && this.isSetWriteCapacity();
    boolean that_present_writeCapacity = true && that.isSetWriteCapacity();
    if (this_present_writeCapacity || that_present_writeCapacity) {
      if (!(this_present_writeCapacity && that_present_writeCapacity))
        return false;
      if (this.writeCapacity != that.writeCapacity)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_readCapacity = true && (isSetReadCapacity());
    list.add(present_readCapacity);
    if (present_readCapacity)
      list.add(readCapacity);

    boolean present_writeCapacity = true && (isSetWriteCapacity());
    list.add(present_writeCapacity);
    if (present_writeCapacity)
      list.add(writeCapacity);

    return list.hashCode();
  }

  @Override
  public int compareTo(ProvisionThroughput other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetReadCapacity()).compareTo(other.isSetReadCapacity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReadCapacity()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.readCapacity, other.readCapacity);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWriteCapacity()).compareTo(other.isSetWriteCapacity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWriteCapacity()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.writeCapacity, other.writeCapacity);
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
    StringBuilder sb = new StringBuilder("ProvisionThroughput(");
    boolean first = true;

    if (isSetReadCapacity()) {
      sb.append("readCapacity:");
      sb.append(this.readCapacity);
      first = false;
    }
    if (isSetWriteCapacity()) {
      if (!first) sb.append(", ");
      sb.append("writeCapacity:");
      sb.append(this.writeCapacity);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ProvisionThroughputStandardSchemeFactory implements SchemeFactory {
    public ProvisionThroughputStandardScheme getScheme() {
      return new ProvisionThroughputStandardScheme();
    }
  }

  private static class ProvisionThroughputStandardScheme extends StandardScheme<ProvisionThroughput> {

    public void read(libthrift091.protocol.TProtocol iprot, ProvisionThroughput struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // READ_CAPACITY
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.readCapacity = iprot.readI64();
              struct.setReadCapacityIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WRITE_CAPACITY
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.writeCapacity = iprot.readI64();
              struct.setWriteCapacityIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, ProvisionThroughput struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetReadCapacity()) {
        oprot.writeFieldBegin(READ_CAPACITY_FIELD_DESC);
        oprot.writeI64(struct.readCapacity);
        oprot.writeFieldEnd();
      }
      if (struct.isSetWriteCapacity()) {
        oprot.writeFieldBegin(WRITE_CAPACITY_FIELD_DESC);
        oprot.writeI64(struct.writeCapacity);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProvisionThroughputTupleSchemeFactory implements SchemeFactory {
    public ProvisionThroughputTupleScheme getScheme() {
      return new ProvisionThroughputTupleScheme();
    }
  }

  private static class ProvisionThroughputTupleScheme extends TupleScheme<ProvisionThroughput> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ProvisionThroughput struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetReadCapacity()) {
        optionals.set(0);
      }
      if (struct.isSetWriteCapacity()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetReadCapacity()) {
        oprot.writeI64(struct.readCapacity);
      }
      if (struct.isSetWriteCapacity()) {
        oprot.writeI64(struct.writeCapacity);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ProvisionThroughput struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.readCapacity = iprot.readI64();
        struct.setReadCapacityIsSet(true);
      }
      if (incoming.get(1)) {
        struct.writeCapacity = iprot.readI64();
        struct.setWriteCapacityIsSet(true);
      }
    }
  }

}

