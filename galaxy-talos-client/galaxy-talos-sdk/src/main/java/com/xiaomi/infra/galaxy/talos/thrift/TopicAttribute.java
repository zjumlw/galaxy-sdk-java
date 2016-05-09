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

public class TopicAttribute implements libthrift091.TBase<TopicAttribute, TopicAttribute._Fields>, java.io.Serializable, Cloneable, Comparable<TopicAttribute> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("TopicAttribute");

  private static final libthrift091.protocol.TField PARTITION_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("partitionNumber", libthrift091.protocol.TType.I32, (short)1);
  private static final libthrift091.protocol.TField MESSAGE_RETENTION_SECS_FIELD_DESC = new libthrift091.protocol.TField("messageRetentionSecs", libthrift091.protocol.TType.I32, (short)2);
  private static final libthrift091.protocol.TField ATTRIBUTES_FIELD_DESC = new libthrift091.protocol.TField("attributes", libthrift091.protocol.TType.MAP, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TopicAttributeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TopicAttributeTupleSchemeFactory());
  }

  /**
   * Partition number for the topic, default 8 (1 ~ 256)
   * 
   */
  public int partitionNumber; // optional
  /**
   * The retention time(in ms) for message in the topic, talos will make sure
   * that message in this topic will be available at least messageRetentionMS,
   * default 24h (1h ~ 30d)
   * 
   */
  public int messageRetentionSecs; // optional
  /**
   * Some other attribute;
   * 
   */
  public Map<String,String> attributes; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * Partition number for the topic, default 8 (1 ~ 256)
     * 
     */
    PARTITION_NUMBER((short)1, "partitionNumber"),
    /**
     * The retention time(in ms) for message in the topic, talos will make sure
     * that message in this topic will be available at least messageRetentionMS,
     * default 24h (1h ~ 30d)
     * 
     */
    MESSAGE_RETENTION_SECS((short)2, "messageRetentionSecs"),
    /**
     * Some other attribute;
     * 
     */
    ATTRIBUTES((short)3, "attributes");

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
        case 1: // PARTITION_NUMBER
          return PARTITION_NUMBER;
        case 2: // MESSAGE_RETENTION_SECS
          return MESSAGE_RETENTION_SECS;
        case 3: // ATTRIBUTES
          return ATTRIBUTES;
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
  private static final int __PARTITIONNUMBER_ISSET_ID = 0;
  private static final int __MESSAGERETENTIONSECS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.PARTITION_NUMBER,_Fields.MESSAGE_RETENTION_SECS,_Fields.ATTRIBUTES};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARTITION_NUMBER, new libthrift091.meta_data.FieldMetaData("partitionNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.MESSAGE_RETENTION_SECS, new libthrift091.meta_data.FieldMetaData("messageRetentionSecs", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.ATTRIBUTES, new libthrift091.meta_data.FieldMetaData("attributes", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING), 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(TopicAttribute.class, metaDataMap);
  }

  public TopicAttribute() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TopicAttribute(TopicAttribute other) {
    __isset_bitfield = other.__isset_bitfield;
    this.partitionNumber = other.partitionNumber;
    this.messageRetentionSecs = other.messageRetentionSecs;
    if (other.isSetAttributes()) {
      Map<String,String> __this__attributes = new HashMap<String,String>(other.attributes);
      this.attributes = __this__attributes;
    }
  }

  public TopicAttribute deepCopy() {
    return new TopicAttribute(this);
  }

  @Override
  public void clear() {
    setPartitionNumberIsSet(false);
    this.partitionNumber = 0;
    setMessageRetentionSecsIsSet(false);
    this.messageRetentionSecs = 0;
    this.attributes = null;
  }

  /**
   * Partition number for the topic, default 8 (1 ~ 256)
   * 
   */
  public int getPartitionNumber() {
    return this.partitionNumber;
  }

  /**
   * Partition number for the topic, default 8 (1 ~ 256)
   * 
   */
  public TopicAttribute setPartitionNumber(int partitionNumber) {
    this.partitionNumber = partitionNumber;
    setPartitionNumberIsSet(true);
    return this;
  }

  public void unsetPartitionNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PARTITIONNUMBER_ISSET_ID);
  }

  /** Returns true if field partitionNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __PARTITIONNUMBER_ISSET_ID);
  }

  public void setPartitionNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PARTITIONNUMBER_ISSET_ID, value);
  }

  /**
   * The retention time(in ms) for message in the topic, talos will make sure
   * that message in this topic will be available at least messageRetentionMS,
   * default 24h (1h ~ 30d)
   * 
   */
  public int getMessageRetentionSecs() {
    return this.messageRetentionSecs;
  }

  /**
   * The retention time(in ms) for message in the topic, talos will make sure
   * that message in this topic will be available at least messageRetentionMS,
   * default 24h (1h ~ 30d)
   * 
   */
  public TopicAttribute setMessageRetentionSecs(int messageRetentionSecs) {
    this.messageRetentionSecs = messageRetentionSecs;
    setMessageRetentionSecsIsSet(true);
    return this;
  }

  public void unsetMessageRetentionSecs() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MESSAGERETENTIONSECS_ISSET_ID);
  }

  /** Returns true if field messageRetentionSecs is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageRetentionSecs() {
    return EncodingUtils.testBit(__isset_bitfield, __MESSAGERETENTIONSECS_ISSET_ID);
  }

  public void setMessageRetentionSecsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MESSAGERETENTIONSECS_ISSET_ID, value);
  }

  public int getAttributesSize() {
    return (this.attributes == null) ? 0 : this.attributes.size();
  }

  public void putToAttributes(String key, String val) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String,String>();
    }
    this.attributes.put(key, val);
  }

  /**
   * Some other attribute;
   * 
   */
  public Map<String,String> getAttributes() {
    return this.attributes;
  }

  /**
   * Some other attribute;
   * 
   */
  public TopicAttribute setAttributes(Map<String,String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public void unsetAttributes() {
    this.attributes = null;
  }

  /** Returns true if field attributes is set (has been assigned a value) and false otherwise */
  public boolean isSetAttributes() {
    return this.attributes != null;
  }

  public void setAttributesIsSet(boolean value) {
    if (!value) {
      this.attributes = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PARTITION_NUMBER:
      if (value == null) {
        unsetPartitionNumber();
      } else {
        setPartitionNumber((Integer)value);
      }
      break;

    case MESSAGE_RETENTION_SECS:
      if (value == null) {
        unsetMessageRetentionSecs();
      } else {
        setMessageRetentionSecs((Integer)value);
      }
      break;

    case ATTRIBUTES:
      if (value == null) {
        unsetAttributes();
      } else {
        setAttributes((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PARTITION_NUMBER:
      return Integer.valueOf(getPartitionNumber());

    case MESSAGE_RETENTION_SECS:
      return Integer.valueOf(getMessageRetentionSecs());

    case ATTRIBUTES:
      return getAttributes();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PARTITION_NUMBER:
      return isSetPartitionNumber();
    case MESSAGE_RETENTION_SECS:
      return isSetMessageRetentionSecs();
    case ATTRIBUTES:
      return isSetAttributes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TopicAttribute)
      return this.equals((TopicAttribute)that);
    return false;
  }

  public boolean equals(TopicAttribute that) {
    if (that == null)
      return false;

    boolean this_present_partitionNumber = true && this.isSetPartitionNumber();
    boolean that_present_partitionNumber = true && that.isSetPartitionNumber();
    if (this_present_partitionNumber || that_present_partitionNumber) {
      if (!(this_present_partitionNumber && that_present_partitionNumber))
        return false;
      if (this.partitionNumber != that.partitionNumber)
        return false;
    }

    boolean this_present_messageRetentionSecs = true && this.isSetMessageRetentionSecs();
    boolean that_present_messageRetentionSecs = true && that.isSetMessageRetentionSecs();
    if (this_present_messageRetentionSecs || that_present_messageRetentionSecs) {
      if (!(this_present_messageRetentionSecs && that_present_messageRetentionSecs))
        return false;
      if (this.messageRetentionSecs != that.messageRetentionSecs)
        return false;
    }

    boolean this_present_attributes = true && this.isSetAttributes();
    boolean that_present_attributes = true && that.isSetAttributes();
    if (this_present_attributes || that_present_attributes) {
      if (!(this_present_attributes && that_present_attributes))
        return false;
      if (!this.attributes.equals(that.attributes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(TopicAttribute other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPartitionNumber()).compareTo(other.isSetPartitionNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.partitionNumber, other.partitionNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageRetentionSecs()).compareTo(other.isSetMessageRetentionSecs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageRetentionSecs()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messageRetentionSecs, other.messageRetentionSecs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAttributes()).compareTo(other.isSetAttributes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttributes()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.attributes, other.attributes);
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
    StringBuilder sb = new StringBuilder("TopicAttribute(");
    boolean first = true;

    if (isSetPartitionNumber()) {
      sb.append("partitionNumber:");
      sb.append(this.partitionNumber);
      first = false;
    }
    if (isSetMessageRetentionSecs()) {
      if (!first) sb.append(", ");
      sb.append("messageRetentionSecs:");
      sb.append(this.messageRetentionSecs);
      first = false;
    }
    if (isSetAttributes()) {
      if (!first) sb.append(", ");
      sb.append("attributes:");
      if (this.attributes == null) {
        sb.append("null");
      } else {
        sb.append(this.attributes);
      }
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

  private static class TopicAttributeStandardSchemeFactory implements SchemeFactory {
    public TopicAttributeStandardScheme getScheme() {
      return new TopicAttributeStandardScheme();
    }
  }

  private static class TopicAttributeStandardScheme extends StandardScheme<TopicAttribute> {

    public void read(libthrift091.protocol.TProtocol iprot, TopicAttribute struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTITION_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.partitionNumber = iprot.readI32();
              struct.setPartitionNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MESSAGE_RETENTION_SECS
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.messageRetentionSecs = iprot.readI32();
              struct.setMessageRetentionSecsIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ATTRIBUTES
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map0 = iprot.readMapBegin();
                struct.attributes = new HashMap<String,String>(2*_map0.size);
                for (int _i1 = 0; _i1 < _map0.size; ++_i1)
                {
                  String _key2;
                  String _val3;
                  _key2 = iprot.readString();
                  _val3 = iprot.readString();
                  struct.attributes.put(_key2, _val3);
                }
                iprot.readMapEnd();
              }
              struct.setAttributesIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, TopicAttribute struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetPartitionNumber()) {
        oprot.writeFieldBegin(PARTITION_NUMBER_FIELD_DESC);
        oprot.writeI32(struct.partitionNumber);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMessageRetentionSecs()) {
        oprot.writeFieldBegin(MESSAGE_RETENTION_SECS_FIELD_DESC);
        oprot.writeI32(struct.messageRetentionSecs);
        oprot.writeFieldEnd();
      }
      if (struct.attributes != null) {
        if (struct.isSetAttributes()) {
          oprot.writeFieldBegin(ATTRIBUTES_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRING, struct.attributes.size()));
            for (Map.Entry<String, String> _iter4 : struct.attributes.entrySet())
            {
              oprot.writeString(_iter4.getKey());
              oprot.writeString(_iter4.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TopicAttributeTupleSchemeFactory implements SchemeFactory {
    public TopicAttributeTupleScheme getScheme() {
      return new TopicAttributeTupleScheme();
    }
  }

  private static class TopicAttributeTupleScheme extends TupleScheme<TopicAttribute> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, TopicAttribute struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPartitionNumber()) {
        optionals.set(0);
      }
      if (struct.isSetMessageRetentionSecs()) {
        optionals.set(1);
      }
      if (struct.isSetAttributes()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetPartitionNumber()) {
        oprot.writeI32(struct.partitionNumber);
      }
      if (struct.isSetMessageRetentionSecs()) {
        oprot.writeI32(struct.messageRetentionSecs);
      }
      if (struct.isSetAttributes()) {
        {
          oprot.writeI32(struct.attributes.size());
          for (Map.Entry<String, String> _iter5 : struct.attributes.entrySet())
          {
            oprot.writeString(_iter5.getKey());
            oprot.writeString(_iter5.getValue());
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, TopicAttribute struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.partitionNumber = iprot.readI32();
        struct.setPartitionNumberIsSet(true);
      }
      if (incoming.get(1)) {
        struct.messageRetentionSecs = iprot.readI32();
        struct.setMessageRetentionSecsIsSet(true);
      }
      if (incoming.get(2)) {
        {
          libthrift091.protocol.TMap _map6 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRING, iprot.readI32());
          struct.attributes = new HashMap<String,String>(2*_map6.size);
          for (int _i7 = 0; _i7 < _map6.size; ++_i7)
          {
            String _key8;
            String _val9;
            _key8 = iprot.readString();
            _val9 = iprot.readString();
            struct.attributes.put(_key8, _val9);
          }
        }
        struct.setAttributesIsSet(true);
      }
    }
  }

}

