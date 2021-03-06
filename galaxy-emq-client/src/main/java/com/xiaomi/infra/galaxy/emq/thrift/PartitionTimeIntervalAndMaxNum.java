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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-9-13")
public class PartitionTimeIntervalAndMaxNum implements libthrift091.TBase<PartitionTimeIntervalAndMaxNum, PartitionTimeIntervalAndMaxNum._Fields>, java.io.Serializable, Cloneable, Comparable<PartitionTimeIntervalAndMaxNum> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("PartitionTimeIntervalAndMaxNum");

  private static final libthrift091.protocol.TField START_TIMESTAMP_FIELD_DESC = new libthrift091.protocol.TField("startTimestamp", libthrift091.protocol.TType.I64, (short)1);
  private static final libthrift091.protocol.TField END_TIMESTAMP_FIELD_DESC = new libthrift091.protocol.TField("endTimestamp", libthrift091.protocol.TType.I64, (short)2);
  private static final libthrift091.protocol.TField MAX_NUM_FIELD_DESC = new libthrift091.protocol.TField("maxNum", libthrift091.protocol.TType.I32, (short)3);
  private static final libthrift091.protocol.TField PARTITION_ID_FIELD_DESC = new libthrift091.protocol.TField("partitionId", libthrift091.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PartitionTimeIntervalAndMaxNumStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PartitionTimeIntervalAndMaxNumTupleSchemeFactory());
  }

  /**
   * Start timestamp;
   * 
   */
  public long startTimestamp; // optional
  /**
   * End timestamp;
   * 
   */
  public long endTimestamp; // optional
  /**
   * Maximum returned message number;
   * 
   */
  public int maxNum; // optional
  /**
   * Id of a partition, default is a random partitionId;
   * 
   */
  public int partitionId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * Start timestamp;
     * 
     */
    START_TIMESTAMP((short)1, "startTimestamp"),
    /**
     * End timestamp;
     * 
     */
    END_TIMESTAMP((short)2, "endTimestamp"),
    /**
     * Maximum returned message number;
     * 
     */
    MAX_NUM((short)3, "maxNum"),
    /**
     * Id of a partition, default is a random partitionId;
     * 
     */
    PARTITION_ID((short)4, "partitionId");

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
        case 1: // START_TIMESTAMP
          return START_TIMESTAMP;
        case 2: // END_TIMESTAMP
          return END_TIMESTAMP;
        case 3: // MAX_NUM
          return MAX_NUM;
        case 4: // PARTITION_ID
          return PARTITION_ID;
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
  private static final int __STARTTIMESTAMP_ISSET_ID = 0;
  private static final int __ENDTIMESTAMP_ISSET_ID = 1;
  private static final int __MAXNUM_ISSET_ID = 2;
  private static final int __PARTITIONID_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.START_TIMESTAMP,_Fields.END_TIMESTAMP,_Fields.MAX_NUM,_Fields.PARTITION_ID};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.START_TIMESTAMP, new libthrift091.meta_data.FieldMetaData("startTimestamp", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.END_TIMESTAMP, new libthrift091.meta_data.FieldMetaData("endTimestamp", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.MAX_NUM, new libthrift091.meta_data.FieldMetaData("maxNum", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.PARTITION_ID, new libthrift091.meta_data.FieldMetaData("partitionId", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(PartitionTimeIntervalAndMaxNum.class, metaDataMap);
  }

  public PartitionTimeIntervalAndMaxNum() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PartitionTimeIntervalAndMaxNum(PartitionTimeIntervalAndMaxNum other) {
    __isset_bitfield = other.__isset_bitfield;
    this.startTimestamp = other.startTimestamp;
    this.endTimestamp = other.endTimestamp;
    this.maxNum = other.maxNum;
    this.partitionId = other.partitionId;
  }

  public PartitionTimeIntervalAndMaxNum deepCopy() {
    return new PartitionTimeIntervalAndMaxNum(this);
  }

  @Override
  public void clear() {
    setStartTimestampIsSet(false);
    this.startTimestamp = 0;
    setEndTimestampIsSet(false);
    this.endTimestamp = 0;
    setMaxNumIsSet(false);
    this.maxNum = 0;
    setPartitionIdIsSet(false);
    this.partitionId = 0;
  }

  /**
   * Start timestamp;
   * 
   */
  public long getStartTimestamp() {
    return this.startTimestamp;
  }

  /**
   * Start timestamp;
   * 
   */
  public PartitionTimeIntervalAndMaxNum setStartTimestamp(long startTimestamp) {
    this.startTimestamp = startTimestamp;
    setStartTimestampIsSet(true);
    return this;
  }

  public void unsetStartTimestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STARTTIMESTAMP_ISSET_ID);
  }

  /** Returns true if field startTimestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetStartTimestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __STARTTIMESTAMP_ISSET_ID);
  }

  public void setStartTimestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STARTTIMESTAMP_ISSET_ID, value);
  }

  /**
   * End timestamp;
   * 
   */
  public long getEndTimestamp() {
    return this.endTimestamp;
  }

  /**
   * End timestamp;
   * 
   */
  public PartitionTimeIntervalAndMaxNum setEndTimestamp(long endTimestamp) {
    this.endTimestamp = endTimestamp;
    setEndTimestampIsSet(true);
    return this;
  }

  public void unsetEndTimestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ENDTIMESTAMP_ISSET_ID);
  }

  /** Returns true if field endTimestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetEndTimestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __ENDTIMESTAMP_ISSET_ID);
  }

  public void setEndTimestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ENDTIMESTAMP_ISSET_ID, value);
  }

  /**
   * Maximum returned message number;
   * 
   */
  public int getMaxNum() {
    return this.maxNum;
  }

  /**
   * Maximum returned message number;
   * 
   */
  public PartitionTimeIntervalAndMaxNum setMaxNum(int maxNum) {
    this.maxNum = maxNum;
    setMaxNumIsSet(true);
    return this;
  }

  public void unsetMaxNum() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAXNUM_ISSET_ID);
  }

  /** Returns true if field maxNum is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxNum() {
    return EncodingUtils.testBit(__isset_bitfield, __MAXNUM_ISSET_ID);
  }

  public void setMaxNumIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAXNUM_ISSET_ID, value);
  }

  /**
   * Id of a partition, default is a random partitionId;
   * 
   */
  public int getPartitionId() {
    return this.partitionId;
  }

  /**
   * Id of a partition, default is a random partitionId;
   * 
   */
  public PartitionTimeIntervalAndMaxNum setPartitionId(int partitionId) {
    this.partitionId = partitionId;
    setPartitionIdIsSet(true);
    return this;
  }

  public void unsetPartitionId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PARTITIONID_ISSET_ID);
  }

  /** Returns true if field partitionId is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionId() {
    return EncodingUtils.testBit(__isset_bitfield, __PARTITIONID_ISSET_ID);
  }

  public void setPartitionIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PARTITIONID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case START_TIMESTAMP:
      if (value == null) {
        unsetStartTimestamp();
      } else {
        setStartTimestamp((Long)value);
      }
      break;

    case END_TIMESTAMP:
      if (value == null) {
        unsetEndTimestamp();
      } else {
        setEndTimestamp((Long)value);
      }
      break;

    case MAX_NUM:
      if (value == null) {
        unsetMaxNum();
      } else {
        setMaxNum((Integer)value);
      }
      break;

    case PARTITION_ID:
      if (value == null) {
        unsetPartitionId();
      } else {
        setPartitionId((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case START_TIMESTAMP:
      return Long.valueOf(getStartTimestamp());

    case END_TIMESTAMP:
      return Long.valueOf(getEndTimestamp());

    case MAX_NUM:
      return Integer.valueOf(getMaxNum());

    case PARTITION_ID:
      return Integer.valueOf(getPartitionId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case START_TIMESTAMP:
      return isSetStartTimestamp();
    case END_TIMESTAMP:
      return isSetEndTimestamp();
    case MAX_NUM:
      return isSetMaxNum();
    case PARTITION_ID:
      return isSetPartitionId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PartitionTimeIntervalAndMaxNum)
      return this.equals((PartitionTimeIntervalAndMaxNum)that);
    return false;
  }

  public boolean equals(PartitionTimeIntervalAndMaxNum that) {
    if (that == null)
      return false;

    boolean this_present_startTimestamp = true && this.isSetStartTimestamp();
    boolean that_present_startTimestamp = true && that.isSetStartTimestamp();
    if (this_present_startTimestamp || that_present_startTimestamp) {
      if (!(this_present_startTimestamp && that_present_startTimestamp))
        return false;
      if (this.startTimestamp != that.startTimestamp)
        return false;
    }

    boolean this_present_endTimestamp = true && this.isSetEndTimestamp();
    boolean that_present_endTimestamp = true && that.isSetEndTimestamp();
    if (this_present_endTimestamp || that_present_endTimestamp) {
      if (!(this_present_endTimestamp && that_present_endTimestamp))
        return false;
      if (this.endTimestamp != that.endTimestamp)
        return false;
    }

    boolean this_present_maxNum = true && this.isSetMaxNum();
    boolean that_present_maxNum = true && that.isSetMaxNum();
    if (this_present_maxNum || that_present_maxNum) {
      if (!(this_present_maxNum && that_present_maxNum))
        return false;
      if (this.maxNum != that.maxNum)
        return false;
    }

    boolean this_present_partitionId = true && this.isSetPartitionId();
    boolean that_present_partitionId = true && that.isSetPartitionId();
    if (this_present_partitionId || that_present_partitionId) {
      if (!(this_present_partitionId && that_present_partitionId))
        return false;
      if (this.partitionId != that.partitionId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_startTimestamp = true && (isSetStartTimestamp());
    list.add(present_startTimestamp);
    if (present_startTimestamp)
      list.add(startTimestamp);

    boolean present_endTimestamp = true && (isSetEndTimestamp());
    list.add(present_endTimestamp);
    if (present_endTimestamp)
      list.add(endTimestamp);

    boolean present_maxNum = true && (isSetMaxNum());
    list.add(present_maxNum);
    if (present_maxNum)
      list.add(maxNum);

    boolean present_partitionId = true && (isSetPartitionId());
    list.add(present_partitionId);
    if (present_partitionId)
      list.add(partitionId);

    return list.hashCode();
  }

  @Override
  public int compareTo(PartitionTimeIntervalAndMaxNum other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStartTimestamp()).compareTo(other.isSetStartTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartTimestamp()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.startTimestamp, other.startTimestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEndTimestamp()).compareTo(other.isSetEndTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndTimestamp()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.endTimestamp, other.endTimestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMaxNum()).compareTo(other.isSetMaxNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxNum()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.maxNum, other.maxNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartitionId()).compareTo(other.isSetPartitionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.partitionId, other.partitionId);
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
    StringBuilder sb = new StringBuilder("PartitionTimeIntervalAndMaxNum(");
    boolean first = true;

    if (isSetStartTimestamp()) {
      sb.append("startTimestamp:");
      sb.append(this.startTimestamp);
      first = false;
    }
    if (isSetEndTimestamp()) {
      if (!first) sb.append(", ");
      sb.append("endTimestamp:");
      sb.append(this.endTimestamp);
      first = false;
    }
    if (isSetMaxNum()) {
      if (!first) sb.append(", ");
      sb.append("maxNum:");
      sb.append(this.maxNum);
      first = false;
    }
    if (isSetPartitionId()) {
      if (!first) sb.append(", ");
      sb.append("partitionId:");
      sb.append(this.partitionId);
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

  private static class PartitionTimeIntervalAndMaxNumStandardSchemeFactory implements SchemeFactory {
    public PartitionTimeIntervalAndMaxNumStandardScheme getScheme() {
      return new PartitionTimeIntervalAndMaxNumStandardScheme();
    }
  }

  private static class PartitionTimeIntervalAndMaxNumStandardScheme extends StandardScheme<PartitionTimeIntervalAndMaxNum> {

    public void read(libthrift091.protocol.TProtocol iprot, PartitionTimeIntervalAndMaxNum struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // START_TIMESTAMP
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.startTimestamp = iprot.readI64();
              struct.setStartTimestampIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // END_TIMESTAMP
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.endTimestamp = iprot.readI64();
              struct.setEndTimestampIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MAX_NUM
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.maxNum = iprot.readI32();
              struct.setMaxNumIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PARTITION_ID
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.partitionId = iprot.readI32();
              struct.setPartitionIdIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, PartitionTimeIntervalAndMaxNum struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetStartTimestamp()) {
        oprot.writeFieldBegin(START_TIMESTAMP_FIELD_DESC);
        oprot.writeI64(struct.startTimestamp);
        oprot.writeFieldEnd();
      }
      if (struct.isSetEndTimestamp()) {
        oprot.writeFieldBegin(END_TIMESTAMP_FIELD_DESC);
        oprot.writeI64(struct.endTimestamp);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMaxNum()) {
        oprot.writeFieldBegin(MAX_NUM_FIELD_DESC);
        oprot.writeI32(struct.maxNum);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPartitionId()) {
        oprot.writeFieldBegin(PARTITION_ID_FIELD_DESC);
        oprot.writeI32(struct.partitionId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PartitionTimeIntervalAndMaxNumTupleSchemeFactory implements SchemeFactory {
    public PartitionTimeIntervalAndMaxNumTupleScheme getScheme() {
      return new PartitionTimeIntervalAndMaxNumTupleScheme();
    }
  }

  private static class PartitionTimeIntervalAndMaxNumTupleScheme extends TupleScheme<PartitionTimeIntervalAndMaxNum> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, PartitionTimeIntervalAndMaxNum struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStartTimestamp()) {
        optionals.set(0);
      }
      if (struct.isSetEndTimestamp()) {
        optionals.set(1);
      }
      if (struct.isSetMaxNum()) {
        optionals.set(2);
      }
      if (struct.isSetPartitionId()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetStartTimestamp()) {
        oprot.writeI64(struct.startTimestamp);
      }
      if (struct.isSetEndTimestamp()) {
        oprot.writeI64(struct.endTimestamp);
      }
      if (struct.isSetMaxNum()) {
        oprot.writeI32(struct.maxNum);
      }
      if (struct.isSetPartitionId()) {
        oprot.writeI32(struct.partitionId);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, PartitionTimeIntervalAndMaxNum struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.startTimestamp = iprot.readI64();
        struct.setStartTimestampIsSet(true);
      }
      if (incoming.get(1)) {
        struct.endTimestamp = iprot.readI64();
        struct.setEndTimestampIsSet(true);
      }
      if (incoming.get(2)) {
        struct.maxNum = iprot.readI32();
        struct.setMaxNumIsSet(true);
      }
      if (incoming.get(3)) {
        struct.partitionId = iprot.readI32();
        struct.setPartitionIdIsSet(true);
      }
    }
  }

}

