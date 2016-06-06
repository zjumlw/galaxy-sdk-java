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
 * record image
 * 
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-6-6")
public class RecordImage implements libthrift091.TBase<RecordImage, RecordImage._Fields>, java.io.Serializable, Cloneable, Comparable<RecordImage> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("RecordImage");

  private static final libthrift091.protocol.TField RECORD_FIELD_DESC = new libthrift091.protocol.TField("record", libthrift091.protocol.TType.MAP, (short)1);
  private static final libthrift091.protocol.TField ROW_DELETED_FIELD_DESC = new libthrift091.protocol.TField("rowDeleted", libthrift091.protocol.TType.BOOL, (short)2);
  private static final libthrift091.protocol.TField TIMESTAMP_FIELD_DESC = new libthrift091.protocol.TField("timestamp", libthrift091.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RecordImageStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RecordImageTupleSchemeFactory());
  }

  /**
   * row key and attributes
   */
  public Map<String,Datum> record; // optional
  /**
   * is row deleted or not
   */
  public boolean rowDeleted; // optional
  /**
   * record mutated timestamp
   */
  public long timestamp; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * row key and attributes
     */
    RECORD((short)1, "record"),
    /**
     * is row deleted or not
     */
    ROW_DELETED((short)2, "rowDeleted"),
    /**
     * record mutated timestamp
     */
    TIMESTAMP((short)3, "timestamp");

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
        case 1: // RECORD
          return RECORD;
        case 2: // ROW_DELETED
          return ROW_DELETED;
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
  private static final int __ROWDELETED_ISSET_ID = 0;
  private static final int __TIMESTAMP_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.RECORD,_Fields.ROW_DELETED,_Fields.TIMESTAMP};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RECORD, new libthrift091.meta_data.FieldMetaData("record", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP        , "Dictionary")));
    tmpMap.put(_Fields.ROW_DELETED, new libthrift091.meta_data.FieldMetaData("rowDeleted", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    tmpMap.put(_Fields.TIMESTAMP, new libthrift091.meta_data.FieldMetaData("timestamp", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(RecordImage.class, metaDataMap);
  }

  public RecordImage() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RecordImage(RecordImage other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRecord()) {
      this.record = other.record;
    }
    this.rowDeleted = other.rowDeleted;
    this.timestamp = other.timestamp;
  }

  public RecordImage deepCopy() {
    return new RecordImage(this);
  }

  @Override
  public void clear() {
    this.record = null;
    setRowDeletedIsSet(false);
    this.rowDeleted = false;
    setTimestampIsSet(false);
    this.timestamp = 0;
  }

  public int getRecordSize() {
    return (this.record == null) ? 0 : this.record.size();
  }

  public void putToRecord(String key, Datum val) {
    if (this.record == null) {
      this.record = new HashMap<String,Datum>();
    }
    this.record.put(key, val);
  }

  /**
   * row key and attributes
   */
  public Map<String,Datum> getRecord() {
    return this.record;
  }

  /**
   * row key and attributes
   */
  public RecordImage setRecord(Map<String,Datum> record) {
    this.record = record;
    return this;
  }

  public void unsetRecord() {
    this.record = null;
  }

  /** Returns true if field record is set (has been assigned a value) and false otherwise */
  public boolean isSetRecord() {
    return this.record != null;
  }

  public void setRecordIsSet(boolean value) {
    if (!value) {
      this.record = null;
    }
  }

  /**
   * is row deleted or not
   */
  public boolean isRowDeleted() {
    return this.rowDeleted;
  }

  /**
   * is row deleted or not
   */
  public RecordImage setRowDeleted(boolean rowDeleted) {
    this.rowDeleted = rowDeleted;
    setRowDeletedIsSet(true);
    return this;
  }

  public void unsetRowDeleted() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ROWDELETED_ISSET_ID);
  }

  /** Returns true if field rowDeleted is set (has been assigned a value) and false otherwise */
  public boolean isSetRowDeleted() {
    return EncodingUtils.testBit(__isset_bitfield, __ROWDELETED_ISSET_ID);
  }

  public void setRowDeletedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ROWDELETED_ISSET_ID, value);
  }

  /**
   * record mutated timestamp
   */
  public long getTimestamp() {
    return this.timestamp;
  }

  /**
   * record mutated timestamp
   */
  public RecordImage setTimestamp(long timestamp) {
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    return this;
  }

  public void unsetTimestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field timestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  public void setTimestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMESTAMP_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RECORD:
      if (value == null) {
        unsetRecord();
      } else {
        setRecord((Map<String,Datum>)value);
      }
      break;

    case ROW_DELETED:
      if (value == null) {
        unsetRowDeleted();
      } else {
        setRowDeleted((Boolean)value);
      }
      break;

    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RECORD:
      return getRecord();

    case ROW_DELETED:
      return Boolean.valueOf(isRowDeleted());

    case TIMESTAMP:
      return Long.valueOf(getTimestamp());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RECORD:
      return isSetRecord();
    case ROW_DELETED:
      return isSetRowDeleted();
    case TIMESTAMP:
      return isSetTimestamp();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RecordImage)
      return this.equals((RecordImage)that);
    return false;
  }

  public boolean equals(RecordImage that) {
    if (that == null)
      return false;

    boolean this_present_record = true && this.isSetRecord();
    boolean that_present_record = true && that.isSetRecord();
    if (this_present_record || that_present_record) {
      if (!(this_present_record && that_present_record))
        return false;
      if (!this.record.equals(that.record))
        return false;
    }

    boolean this_present_rowDeleted = true && this.isSetRowDeleted();
    boolean that_present_rowDeleted = true && that.isSetRowDeleted();
    if (this_present_rowDeleted || that_present_rowDeleted) {
      if (!(this_present_rowDeleted && that_present_rowDeleted))
        return false;
      if (this.rowDeleted != that.rowDeleted)
        return false;
    }

    boolean this_present_timestamp = true && this.isSetTimestamp();
    boolean that_present_timestamp = true && that.isSetTimestamp();
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
    List<Object> list = new ArrayList<Object>();

    boolean present_record = true && (isSetRecord());
    list.add(present_record);
    if (present_record)
      list.add(record);

    boolean present_rowDeleted = true && (isSetRowDeleted());
    list.add(present_rowDeleted);
    if (present_rowDeleted)
      list.add(rowDeleted);

    boolean present_timestamp = true && (isSetTimestamp());
    list.add(present_timestamp);
    if (present_timestamp)
      list.add(timestamp);

    return list.hashCode();
  }

  @Override
  public int compareTo(RecordImage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRecord()).compareTo(other.isSetRecord());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecord()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.record, other.record);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRowDeleted()).compareTo(other.isSetRowDeleted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRowDeleted()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.rowDeleted, other.rowDeleted);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimestamp()).compareTo(other.isSetTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestamp()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.timestamp, other.timestamp);
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
    StringBuilder sb = new StringBuilder("RecordImage(");
    boolean first = true;

    if (isSetRecord()) {
      sb.append("record:");
      if (this.record == null) {
        sb.append("null");
      } else {
        sb.append(this.record);
      }
      first = false;
    }
    if (isSetRowDeleted()) {
      if (!first) sb.append(", ");
      sb.append("rowDeleted:");
      sb.append(this.rowDeleted);
      first = false;
    }
    if (isSetTimestamp()) {
      if (!first) sb.append(", ");
      sb.append("timestamp:");
      sb.append(this.timestamp);
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

  private static class RecordImageStandardSchemeFactory implements SchemeFactory {
    public RecordImageStandardScheme getScheme() {
      return new RecordImageStandardScheme();
    }
  }

  private static class RecordImageStandardScheme extends StandardScheme<RecordImage> {

    public void read(libthrift091.protocol.TProtocol iprot, RecordImage struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RECORD
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map350 = iprot.readMapBegin();
                struct.record = new HashMap<String,Datum>(2*_map350.size);
                String _key351;
                Datum _val352;
                for (int _i353 = 0; _i353 < _map350.size; ++_i353)
                {
                  _key351 = iprot.readString();
                  _val352 = new Datum();
                  _val352.read(iprot);
                  struct.record.put(_key351, _val352);
                }
                iprot.readMapEnd();
              }
              struct.setRecordIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ROW_DELETED
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.rowDeleted = iprot.readBool();
              struct.setRowDeletedIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TIMESTAMP
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.timestamp = iprot.readI64();
              struct.setTimestampIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, RecordImage struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.record != null) {
        if (struct.isSetRecord()) {
          oprot.writeFieldBegin(RECORD_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.record.size()));
            for (Map.Entry<String, Datum> _iter354 : struct.record.entrySet())
            {
              oprot.writeString(_iter354.getKey());
              _iter354.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetRowDeleted()) {
        oprot.writeFieldBegin(ROW_DELETED_FIELD_DESC);
        oprot.writeBool(struct.rowDeleted);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTimestamp()) {
        oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
        oprot.writeI64(struct.timestamp);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RecordImageTupleSchemeFactory implements SchemeFactory {
    public RecordImageTupleScheme getScheme() {
      return new RecordImageTupleScheme();
    }
  }

  private static class RecordImageTupleScheme extends TupleScheme<RecordImage> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, RecordImage struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRecord()) {
        optionals.set(0);
      }
      if (struct.isSetRowDeleted()) {
        optionals.set(1);
      }
      if (struct.isSetTimestamp()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetRecord()) {
        {
          oprot.writeI32(struct.record.size());
          for (Map.Entry<String, Datum> _iter355 : struct.record.entrySet())
          {
            oprot.writeString(_iter355.getKey());
            _iter355.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetRowDeleted()) {
        oprot.writeBool(struct.rowDeleted);
      }
      if (struct.isSetTimestamp()) {
        oprot.writeI64(struct.timestamp);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, RecordImage struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TMap _map356 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.record = new HashMap<String,Datum>(2*_map356.size);
          String _key357;
          Datum _val358;
          for (int _i359 = 0; _i359 < _map356.size; ++_i359)
          {
            _key357 = iprot.readString();
            _val358 = new Datum();
            _val358.read(iprot);
            struct.record.put(_key357, _val358);
          }
        }
        struct.setRecordIsSet(true);
      }
      if (incoming.get(1)) {
        struct.rowDeleted = iprot.readBool();
        struct.setRowDeletedIsSet(true);
      }
      if (incoming.get(2)) {
        struct.timestamp = iprot.readI64();
        struct.setTimestampIsSet(true);
      }
    }
  }

}

