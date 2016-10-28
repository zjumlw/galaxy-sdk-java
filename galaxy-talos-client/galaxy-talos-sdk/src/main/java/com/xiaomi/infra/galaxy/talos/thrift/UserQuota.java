/**
 * Autogenerated by Thrift Compiler (0.9.2)
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-10-28")
public class UserQuota implements libthrift091.TBase<UserQuota, UserQuota._Fields>, java.io.Serializable, Cloneable, Comparable<UserQuota> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("UserQuota");

  private static final libthrift091.protocol.TField BASE_QUOTA_FIELD_DESC = new libthrift091.protocol.TField("baseQuota", libthrift091.protocol.TType.STRUCT, (short)1);
  private static final libthrift091.protocol.TField TOPIC_NUMBER_QUOTA_FIELD_DESC = new libthrift091.protocol.TField("topicNumberQuota", libthrift091.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UserQuotaStandardSchemeFactory());
    schemes.put(TupleScheme.class, new UserQuotaTupleSchemeFactory());
  }

  /**
   * The base quota member
   * 
   */
  public BaseQuota baseQuota; // required
  /**
   * The max topic number allowed to create for specified developerId,
   * default 20 (1 ~ 100);
   * 
   */
  public int topicNumberQuota; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The base quota member
     * 
     */
    BASE_QUOTA((short)1, "baseQuota"),
    /**
     * The max topic number allowed to create for specified developerId,
     * default 20 (1 ~ 100);
     * 
     */
    TOPIC_NUMBER_QUOTA((short)2, "topicNumberQuota");

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
        case 1: // BASE_QUOTA
          return BASE_QUOTA;
        case 2: // TOPIC_NUMBER_QUOTA
          return TOPIC_NUMBER_QUOTA;
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
  private static final int __TOPICNUMBERQUOTA_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TOPIC_NUMBER_QUOTA};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BASE_QUOTA, new libthrift091.meta_data.FieldMetaData("baseQuota", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, BaseQuota.class)));
    tmpMap.put(_Fields.TOPIC_NUMBER_QUOTA, new libthrift091.meta_data.FieldMetaData("topicNumberQuota", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(UserQuota.class, metaDataMap);
  }

  public UserQuota() {
  }

  public UserQuota(
    BaseQuota baseQuota)
  {
    this();
    this.baseQuota = baseQuota;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserQuota(UserQuota other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetBaseQuota()) {
      this.baseQuota = new BaseQuota(other.baseQuota);
    }
    this.topicNumberQuota = other.topicNumberQuota;
  }

  public UserQuota deepCopy() {
    return new UserQuota(this);
  }

  @Override
  public void clear() {
    this.baseQuota = null;
    setTopicNumberQuotaIsSet(false);
    this.topicNumberQuota = 0;
  }

  /**
   * The base quota member
   * 
   */
  public BaseQuota getBaseQuota() {
    return this.baseQuota;
  }

  /**
   * The base quota member
   * 
   */
  public UserQuota setBaseQuota(BaseQuota baseQuota) {
    this.baseQuota = baseQuota;
    return this;
  }

  public void unsetBaseQuota() {
    this.baseQuota = null;
  }

  /** Returns true if field baseQuota is set (has been assigned a value) and false otherwise */
  public boolean isSetBaseQuota() {
    return this.baseQuota != null;
  }

  public void setBaseQuotaIsSet(boolean value) {
    if (!value) {
      this.baseQuota = null;
    }
  }

  /**
   * The max topic number allowed to create for specified developerId,
   * default 20 (1 ~ 100);
   * 
   */
  public int getTopicNumberQuota() {
    return this.topicNumberQuota;
  }

  /**
   * The max topic number allowed to create for specified developerId,
   * default 20 (1 ~ 100);
   * 
   */
  public UserQuota setTopicNumberQuota(int topicNumberQuota) {
    this.topicNumberQuota = topicNumberQuota;
    setTopicNumberQuotaIsSet(true);
    return this;
  }

  public void unsetTopicNumberQuota() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOPICNUMBERQUOTA_ISSET_ID);
  }

  /** Returns true if field topicNumberQuota is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicNumberQuota() {
    return EncodingUtils.testBit(__isset_bitfield, __TOPICNUMBERQUOTA_ISSET_ID);
  }

  public void setTopicNumberQuotaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOPICNUMBERQUOTA_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BASE_QUOTA:
      if (value == null) {
        unsetBaseQuota();
      } else {
        setBaseQuota((BaseQuota)value);
      }
      break;

    case TOPIC_NUMBER_QUOTA:
      if (value == null) {
        unsetTopicNumberQuota();
      } else {
        setTopicNumberQuota((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BASE_QUOTA:
      return getBaseQuota();

    case TOPIC_NUMBER_QUOTA:
      return Integer.valueOf(getTopicNumberQuota());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BASE_QUOTA:
      return isSetBaseQuota();
    case TOPIC_NUMBER_QUOTA:
      return isSetTopicNumberQuota();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UserQuota)
      return this.equals((UserQuota)that);
    return false;
  }

  public boolean equals(UserQuota that) {
    if (that == null)
      return false;

    boolean this_present_baseQuota = true && this.isSetBaseQuota();
    boolean that_present_baseQuota = true && that.isSetBaseQuota();
    if (this_present_baseQuota || that_present_baseQuota) {
      if (!(this_present_baseQuota && that_present_baseQuota))
        return false;
      if (!this.baseQuota.equals(that.baseQuota))
        return false;
    }

    boolean this_present_topicNumberQuota = true && this.isSetTopicNumberQuota();
    boolean that_present_topicNumberQuota = true && that.isSetTopicNumberQuota();
    if (this_present_topicNumberQuota || that_present_topicNumberQuota) {
      if (!(this_present_topicNumberQuota && that_present_topicNumberQuota))
        return false;
      if (this.topicNumberQuota != that.topicNumberQuota)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_baseQuota = true && (isSetBaseQuota());
    list.add(present_baseQuota);
    if (present_baseQuota)
      list.add(baseQuota);

    boolean present_topicNumberQuota = true && (isSetTopicNumberQuota());
    list.add(present_topicNumberQuota);
    if (present_topicNumberQuota)
      list.add(topicNumberQuota);

    return list.hashCode();
  }

  @Override
  public int compareTo(UserQuota other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBaseQuota()).compareTo(other.isSetBaseQuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBaseQuota()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.baseQuota, other.baseQuota);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTopicNumberQuota()).compareTo(other.isSetTopicNumberQuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicNumberQuota()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicNumberQuota, other.topicNumberQuota);
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
    StringBuilder sb = new StringBuilder("UserQuota(");
    boolean first = true;

    sb.append("baseQuota:");
    if (this.baseQuota == null) {
      sb.append("null");
    } else {
      sb.append(this.baseQuota);
    }
    first = false;
    if (isSetTopicNumberQuota()) {
      if (!first) sb.append(", ");
      sb.append("topicNumberQuota:");
      sb.append(this.topicNumberQuota);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (baseQuota == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'baseQuota' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (baseQuota != null) {
      baseQuota.validate();
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

  private static class UserQuotaStandardSchemeFactory implements SchemeFactory {
    public UserQuotaStandardScheme getScheme() {
      return new UserQuotaStandardScheme();
    }
  }

  private static class UserQuotaStandardScheme extends StandardScheme<UserQuota> {

    public void read(libthrift091.protocol.TProtocol iprot, UserQuota struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BASE_QUOTA
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.baseQuota = new BaseQuota();
              struct.baseQuota.read(iprot);
              struct.setBaseQuotaIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOPIC_NUMBER_QUOTA
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.topicNumberQuota = iprot.readI32();
              struct.setTopicNumberQuotaIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, UserQuota struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.baseQuota != null) {
        oprot.writeFieldBegin(BASE_QUOTA_FIELD_DESC);
        struct.baseQuota.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTopicNumberQuota()) {
        oprot.writeFieldBegin(TOPIC_NUMBER_QUOTA_FIELD_DESC);
        oprot.writeI32(struct.topicNumberQuota);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserQuotaTupleSchemeFactory implements SchemeFactory {
    public UserQuotaTupleScheme getScheme() {
      return new UserQuotaTupleScheme();
    }
  }

  private static class UserQuotaTupleScheme extends TupleScheme<UserQuota> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, UserQuota struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.baseQuota.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetTopicNumberQuota()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetTopicNumberQuota()) {
        oprot.writeI32(struct.topicNumberQuota);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, UserQuota struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.baseQuota = new BaseQuota();
      struct.baseQuota.read(iprot);
      struct.setBaseQuotaIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.topicNumberQuota = iprot.readI32();
        struct.setTopicNumberQuotaIsSet(true);
      }
    }
  }

}

