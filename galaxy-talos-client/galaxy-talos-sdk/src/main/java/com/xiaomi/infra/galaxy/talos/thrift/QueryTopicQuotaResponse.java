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

public class QueryTopicQuotaResponse implements libthrift091.TBase<QueryTopicQuotaResponse, QueryTopicQuotaResponse._Fields>, java.io.Serializable, Cloneable, Comparable<QueryTopicQuotaResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("QueryTopicQuotaResponse");

  private static final libthrift091.protocol.TField TOPIC_QUOTA_FIELD_DESC = new libthrift091.protocol.TField("topicQuota", libthrift091.protocol.TType.STRUCT, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QueryTopicQuotaResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QueryTopicQuotaResponseTupleSchemeFactory());
  }

  /**
   * The topic quota
   * 
   */
  public com.xiaomi.infra.galaxy.talos.thrift.BaseQuota topicQuota; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The topic quota
     * 
     */
    TOPIC_QUOTA((short)1, "topicQuota");

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
        case 1: // TOPIC_QUOTA
          return TOPIC_QUOTA;
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
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOPIC_QUOTA, new libthrift091.meta_data.FieldMetaData("topicQuota", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, com.xiaomi.infra.galaxy.talos.thrift.BaseQuota.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(QueryTopicQuotaResponse.class, metaDataMap);
  }

  public QueryTopicQuotaResponse() {
  }

  public QueryTopicQuotaResponse(
    com.xiaomi.infra.galaxy.talos.thrift.BaseQuota topicQuota)
  {
    this();
    this.topicQuota = topicQuota;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QueryTopicQuotaResponse(QueryTopicQuotaResponse other) {
    if (other.isSetTopicQuota()) {
      this.topicQuota = new com.xiaomi.infra.galaxy.talos.thrift.BaseQuota(other.topicQuota);
    }
  }

  public QueryTopicQuotaResponse deepCopy() {
    return new QueryTopicQuotaResponse(this);
  }

  @Override
  public void clear() {
    this.topicQuota = null;
  }

  /**
   * The topic quota
   * 
   */
  public com.xiaomi.infra.galaxy.talos.thrift.BaseQuota getTopicQuota() {
    return this.topicQuota;
  }

  /**
   * The topic quota
   * 
   */
  public QueryTopicQuotaResponse setTopicQuota(com.xiaomi.infra.galaxy.talos.thrift.BaseQuota topicQuota) {
    this.topicQuota = topicQuota;
    return this;
  }

  public void unsetTopicQuota() {
    this.topicQuota = null;
  }

  /** Returns true if field topicQuota is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicQuota() {
    return this.topicQuota != null;
  }

  public void setTopicQuotaIsSet(boolean value) {
    if (!value) {
      this.topicQuota = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPIC_QUOTA:
      if (value == null) {
        unsetTopicQuota();
      } else {
        setTopicQuota((com.xiaomi.infra.galaxy.talos.thrift.BaseQuota)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPIC_QUOTA:
      return getTopicQuota();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPIC_QUOTA:
      return isSetTopicQuota();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QueryTopicQuotaResponse)
      return this.equals((QueryTopicQuotaResponse)that);
    return false;
  }

  public boolean equals(QueryTopicQuotaResponse that) {
    if (that == null)
      return false;

    boolean this_present_topicQuota = true && this.isSetTopicQuota();
    boolean that_present_topicQuota = true && that.isSetTopicQuota();
    if (this_present_topicQuota || that_present_topicQuota) {
      if (!(this_present_topicQuota && that_present_topicQuota))
        return false;
      if (!this.topicQuota.equals(that.topicQuota))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(QueryTopicQuotaResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTopicQuota()).compareTo(other.isSetTopicQuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicQuota()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicQuota, other.topicQuota);
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
    StringBuilder sb = new StringBuilder("QueryTopicQuotaResponse(");
    boolean first = true;

    sb.append("topicQuota:");
    if (this.topicQuota == null) {
      sb.append("null");
    } else {
      sb.append(this.topicQuota);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (topicQuota == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicQuota' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (topicQuota != null) {
      topicQuota.validate();
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
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class QueryTopicQuotaResponseStandardSchemeFactory implements SchemeFactory {
    public QueryTopicQuotaResponseStandardScheme getScheme() {
      return new QueryTopicQuotaResponseStandardScheme();
    }
  }

  private static class QueryTopicQuotaResponseStandardScheme extends StandardScheme<QueryTopicQuotaResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, QueryTopicQuotaResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPIC_QUOTA
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicQuota = new com.xiaomi.infra.galaxy.talos.thrift.BaseQuota();
              struct.topicQuota.read(iprot);
              struct.setTopicQuotaIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, QueryTopicQuotaResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topicQuota != null) {
        oprot.writeFieldBegin(TOPIC_QUOTA_FIELD_DESC);
        struct.topicQuota.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QueryTopicQuotaResponseTupleSchemeFactory implements SchemeFactory {
    public QueryTopicQuotaResponseTupleScheme getScheme() {
      return new QueryTopicQuotaResponseTupleScheme();
    }
  }

  private static class QueryTopicQuotaResponseTupleScheme extends TupleScheme<QueryTopicQuotaResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, QueryTopicQuotaResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.topicQuota.write(oprot);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, QueryTopicQuotaResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topicQuota = new com.xiaomi.infra.galaxy.talos.thrift.BaseQuota();
      struct.topicQuota.read(iprot);
      struct.setTopicQuotaIsSet(true);
    }
  }

}

