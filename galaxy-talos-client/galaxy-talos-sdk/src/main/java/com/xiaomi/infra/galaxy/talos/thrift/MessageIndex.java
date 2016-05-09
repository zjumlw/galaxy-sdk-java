/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageIndex implements libthrift091.TBase<MessageIndex, MessageIndex._Fields>, java.io.Serializable, Cloneable, Comparable<MessageIndex> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("MessageIndex");

  private static final libthrift091.protocol.TField TOPIC_AND_PARTITION_FIELD_DESC = new libthrift091.protocol.TField("topicAndPartition", libthrift091.protocol.TType.STRUCT, (short)1);
  private static final libthrift091.protocol.TField MESSAGE_OFFSET_FIELD_DESC = new libthrift091.protocol.TField("messageOffset", libthrift091.protocol.TType.I64, (short)2);
  private static final libthrift091.protocol.TField HDFS_LOG_FILE_OFFSET_FIELD_DESC = new libthrift091.protocol.TField("hdfsLogFileOffset", libthrift091.protocol.TType.I64, (short)3);
  private static final libthrift091.protocol.TField MESSAGE_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("messageNumber", libthrift091.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MessageIndexStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MessageIndexTupleSchemeFactory());
  }

  /**
   * The topic and partition for the message;
   * 
   */
  public com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition topicAndPartition; // required
  /**
   * Message offset for this index;
   * 
   */
  public long messageOffset; // required
  /**
   * The hdfs log file offset that to store this message;
   * 
   */
  public long hdfsLogFileOffset; // required
  /**
   * the messageNumber for the messageBlock with startMessageOffset as messageOffset;
   * 
   */
  public int messageNumber; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The topic and partition for the message;
     * 
     */
    TOPIC_AND_PARTITION((short)1, "topicAndPartition"),
    /**
     * Message offset for this index;
     * 
     */
    MESSAGE_OFFSET((short)2, "messageOffset"),
    /**
     * The hdfs log file offset that to store this message;
     * 
     */
    HDFS_LOG_FILE_OFFSET((short)3, "hdfsLogFileOffset"),
    /**
     * the messageNumber for the messageBlock with startMessageOffset as messageOffset;
     * 
     */
    MESSAGE_NUMBER((short)4, "messageNumber");

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
        case 1: // TOPIC_AND_PARTITION
          return TOPIC_AND_PARTITION;
        case 2: // MESSAGE_OFFSET
          return MESSAGE_OFFSET;
        case 3: // HDFS_LOG_FILE_OFFSET
          return HDFS_LOG_FILE_OFFSET;
        case 4: // MESSAGE_NUMBER
          return MESSAGE_NUMBER;
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
  private static final int __MESSAGEOFFSET_ISSET_ID = 0;
  private static final int __HDFSLOGFILEOFFSET_ISSET_ID = 1;
  private static final int __MESSAGENUMBER_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOPIC_AND_PARTITION, new libthrift091.meta_data.FieldMetaData("topicAndPartition", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition.class)));
    tmpMap.put(_Fields.MESSAGE_OFFSET, new libthrift091.meta_data.FieldMetaData("messageOffset", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.HDFS_LOG_FILE_OFFSET, new libthrift091.meta_data.FieldMetaData("hdfsLogFileOffset", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.MESSAGE_NUMBER, new libthrift091.meta_data.FieldMetaData("messageNumber", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(MessageIndex.class, metaDataMap);
  }

  public MessageIndex() {
  }

  public MessageIndex(
    com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition topicAndPartition,
    long messageOffset,
    long hdfsLogFileOffset,
    int messageNumber)
  {
    this();
    this.topicAndPartition = topicAndPartition;
    this.messageOffset = messageOffset;
    setMessageOffsetIsSet(true);
    this.hdfsLogFileOffset = hdfsLogFileOffset;
    setHdfsLogFileOffsetIsSet(true);
    this.messageNumber = messageNumber;
    setMessageNumberIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MessageIndex(MessageIndex other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTopicAndPartition()) {
      this.topicAndPartition = new com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition(other.topicAndPartition);
    }
    this.messageOffset = other.messageOffset;
    this.hdfsLogFileOffset = other.hdfsLogFileOffset;
    this.messageNumber = other.messageNumber;
  }

  public MessageIndex deepCopy() {
    return new MessageIndex(this);
  }

  @Override
  public void clear() {
    this.topicAndPartition = null;
    setMessageOffsetIsSet(false);
    this.messageOffset = 0;
    setHdfsLogFileOffsetIsSet(false);
    this.hdfsLogFileOffset = 0;
    setMessageNumberIsSet(false);
    this.messageNumber = 0;
  }

  /**
   * The topic and partition for the message;
   * 
   */
  public com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition getTopicAndPartition() {
    return this.topicAndPartition;
  }

  /**
   * The topic and partition for the message;
   * 
   */
  public MessageIndex setTopicAndPartition(com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition topicAndPartition) {
    this.topicAndPartition = topicAndPartition;
    return this;
  }

  public void unsetTopicAndPartition() {
    this.topicAndPartition = null;
  }

  /** Returns true if field topicAndPartition is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicAndPartition() {
    return this.topicAndPartition != null;
  }

  public void setTopicAndPartitionIsSet(boolean value) {
    if (!value) {
      this.topicAndPartition = null;
    }
  }

  /**
   * Message offset for this index;
   * 
   */
  public long getMessageOffset() {
    return this.messageOffset;
  }

  /**
   * Message offset for this index;
   * 
   */
  public MessageIndex setMessageOffset(long messageOffset) {
    this.messageOffset = messageOffset;
    setMessageOffsetIsSet(true);
    return this;
  }

  public void unsetMessageOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MESSAGEOFFSET_ISSET_ID);
  }

  /** Returns true if field messageOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __MESSAGEOFFSET_ISSET_ID);
  }

  public void setMessageOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MESSAGEOFFSET_ISSET_ID, value);
  }

  /**
   * The hdfs log file offset that to store this message;
   * 
   */
  public long getHdfsLogFileOffset() {
    return this.hdfsLogFileOffset;
  }

  /**
   * The hdfs log file offset that to store this message;
   * 
   */
  public MessageIndex setHdfsLogFileOffset(long hdfsLogFileOffset) {
    this.hdfsLogFileOffset = hdfsLogFileOffset;
    setHdfsLogFileOffsetIsSet(true);
    return this;
  }

  public void unsetHdfsLogFileOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HDFSLOGFILEOFFSET_ISSET_ID);
  }

  /** Returns true if field hdfsLogFileOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetHdfsLogFileOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __HDFSLOGFILEOFFSET_ISSET_ID);
  }

  public void setHdfsLogFileOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HDFSLOGFILEOFFSET_ISSET_ID, value);
  }

  /**
   * the messageNumber for the messageBlock with startMessageOffset as messageOffset;
   * 
   */
  public int getMessageNumber() {
    return this.messageNumber;
  }

  /**
   * the messageNumber for the messageBlock with startMessageOffset as messageOffset;
   * 
   */
  public MessageIndex setMessageNumber(int messageNumber) {
    this.messageNumber = messageNumber;
    setMessageNumberIsSet(true);
    return this;
  }

  public void unsetMessageNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MESSAGENUMBER_ISSET_ID);
  }

  /** Returns true if field messageNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __MESSAGENUMBER_ISSET_ID);
  }

  public void setMessageNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MESSAGENUMBER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPIC_AND_PARTITION:
      if (value == null) {
        unsetTopicAndPartition();
      } else {
        setTopicAndPartition((com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition)value);
      }
      break;

    case MESSAGE_OFFSET:
      if (value == null) {
        unsetMessageOffset();
      } else {
        setMessageOffset((Long)value);
      }
      break;

    case HDFS_LOG_FILE_OFFSET:
      if (value == null) {
        unsetHdfsLogFileOffset();
      } else {
        setHdfsLogFileOffset((Long)value);
      }
      break;

    case MESSAGE_NUMBER:
      if (value == null) {
        unsetMessageNumber();
      } else {
        setMessageNumber((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPIC_AND_PARTITION:
      return getTopicAndPartition();

    case MESSAGE_OFFSET:
      return Long.valueOf(getMessageOffset());

    case HDFS_LOG_FILE_OFFSET:
      return Long.valueOf(getHdfsLogFileOffset());

    case MESSAGE_NUMBER:
      return Integer.valueOf(getMessageNumber());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPIC_AND_PARTITION:
      return isSetTopicAndPartition();
    case MESSAGE_OFFSET:
      return isSetMessageOffset();
    case HDFS_LOG_FILE_OFFSET:
      return isSetHdfsLogFileOffset();
    case MESSAGE_NUMBER:
      return isSetMessageNumber();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MessageIndex)
      return this.equals((MessageIndex)that);
    return false;
  }

  public boolean equals(MessageIndex that) {
    if (that == null)
      return false;

    boolean this_present_topicAndPartition = true && this.isSetTopicAndPartition();
    boolean that_present_topicAndPartition = true && that.isSetTopicAndPartition();
    if (this_present_topicAndPartition || that_present_topicAndPartition) {
      if (!(this_present_topicAndPartition && that_present_topicAndPartition))
        return false;
      if (!this.topicAndPartition.equals(that.topicAndPartition))
        return false;
    }

    boolean this_present_messageOffset = true;
    boolean that_present_messageOffset = true;
    if (this_present_messageOffset || that_present_messageOffset) {
      if (!(this_present_messageOffset && that_present_messageOffset))
        return false;
      if (this.messageOffset != that.messageOffset)
        return false;
    }

    boolean this_present_hdfsLogFileOffset = true;
    boolean that_present_hdfsLogFileOffset = true;
    if (this_present_hdfsLogFileOffset || that_present_hdfsLogFileOffset) {
      if (!(this_present_hdfsLogFileOffset && that_present_hdfsLogFileOffset))
        return false;
      if (this.hdfsLogFileOffset != that.hdfsLogFileOffset)
        return false;
    }

    boolean this_present_messageNumber = true;
    boolean that_present_messageNumber = true;
    if (this_present_messageNumber || that_present_messageNumber) {
      if (!(this_present_messageNumber && that_present_messageNumber))
        return false;
      if (this.messageNumber != that.messageNumber)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(MessageIndex other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTopicAndPartition()).compareTo(other.isSetTopicAndPartition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicAndPartition()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicAndPartition, other.topicAndPartition);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageOffset()).compareTo(other.isSetMessageOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageOffset()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messageOffset, other.messageOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHdfsLogFileOffset()).compareTo(other.isSetHdfsLogFileOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHdfsLogFileOffset()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.hdfsLogFileOffset, other.hdfsLogFileOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageNumber()).compareTo(other.isSetMessageNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messageNumber, other.messageNumber);
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
    StringBuilder sb = new StringBuilder("MessageIndex(");
    boolean first = true;

    sb.append("topicAndPartition:");
    if (this.topicAndPartition == null) {
      sb.append("null");
    } else {
      sb.append(this.topicAndPartition);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageOffset:");
    sb.append(this.messageOffset);
    first = false;
    if (!first) sb.append(", ");
    sb.append("hdfsLogFileOffset:");
    sb.append(this.hdfsLogFileOffset);
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageNumber:");
    sb.append(this.messageNumber);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (topicAndPartition == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicAndPartition' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'messageOffset' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'hdfsLogFileOffset' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'messageNumber' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (topicAndPartition != null) {
      topicAndPartition.validate();
    }
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

  private static class MessageIndexStandardSchemeFactory implements SchemeFactory {
    public MessageIndexStandardScheme getScheme() {
      return new MessageIndexStandardScheme();
    }
  }

  private static class MessageIndexStandardScheme extends StandardScheme<MessageIndex> {

    public void read(libthrift091.protocol.TProtocol iprot, MessageIndex struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPIC_AND_PARTITION
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicAndPartition = new com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition();
              struct.topicAndPartition.read(iprot);
              struct.setTopicAndPartitionIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MESSAGE_OFFSET
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.messageOffset = iprot.readI64();
              struct.setMessageOffsetIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HDFS_LOG_FILE_OFFSET
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.hdfsLogFileOffset = iprot.readI64();
              struct.setHdfsLogFileOffsetIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MESSAGE_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.messageNumber = iprot.readI32();
              struct.setMessageNumberIsSet(true);
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
      if (!struct.isSetMessageOffset()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'messageOffset' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetHdfsLogFileOffset()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'hdfsLogFileOffset' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetMessageNumber()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'messageNumber' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, MessageIndex struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topicAndPartition != null) {
        oprot.writeFieldBegin(TOPIC_AND_PARTITION_FIELD_DESC);
        struct.topicAndPartition.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MESSAGE_OFFSET_FIELD_DESC);
      oprot.writeI64(struct.messageOffset);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(HDFS_LOG_FILE_OFFSET_FIELD_DESC);
      oprot.writeI64(struct.hdfsLogFileOffset);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MESSAGE_NUMBER_FIELD_DESC);
      oprot.writeI32(struct.messageNumber);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MessageIndexTupleSchemeFactory implements SchemeFactory {
    public MessageIndexTupleScheme getScheme() {
      return new MessageIndexTupleScheme();
    }
  }

  private static class MessageIndexTupleScheme extends TupleScheme<MessageIndex> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, MessageIndex struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.topicAndPartition.write(oprot);
      oprot.writeI64(struct.messageOffset);
      oprot.writeI64(struct.hdfsLogFileOffset);
      oprot.writeI32(struct.messageNumber);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, MessageIndex struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topicAndPartition = new com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition();
      struct.topicAndPartition.read(iprot);
      struct.setTopicAndPartitionIsSet(true);
      struct.messageOffset = iprot.readI64();
      struct.setMessageOffsetIsSet(true);
      struct.hdfsLogFileOffset = iprot.readI64();
      struct.setHdfsLogFileOffsetIsSet(true);
      struct.messageNumber = iprot.readI32();
      struct.setMessageNumberIsSet(true);
    }
  }

}

