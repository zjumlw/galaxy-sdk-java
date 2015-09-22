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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-9-16")
public class GetQueueInfoResponse implements libthrift091.TBase<GetQueueInfoResponse, GetQueueInfoResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetQueueInfoResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("GetQueueInfoResponse");

  private static final libthrift091.protocol.TField QUEUE_NAME_FIELD_DESC = new libthrift091.protocol.TField("queueName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField QUEUE_ATTRIBUTE_FIELD_DESC = new libthrift091.protocol.TField("queueAttribute", libthrift091.protocol.TType.STRUCT, (short)2);
  private static final libthrift091.protocol.TField QUEUE_STATE_FIELD_DESC = new libthrift091.protocol.TField("queueState", libthrift091.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetQueueInfoResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetQueueInfoResponseTupleSchemeFactory());
  }

  /**
   * The queue name
   * 
   */
  public String queueName; // required
  /**
   * The queue attribute;
   * 
   */
  public QueueAttribute queueAttribute; // required
  /**
   * The queue state;
   * 
   */
  public QueueState queueState; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The queue name
     * 
     */
    QUEUE_NAME((short)1, "queueName"),
    /**
     * The queue attribute;
     * 
     */
    QUEUE_ATTRIBUTE((short)2, "queueAttribute"),
    /**
     * The queue state;
     * 
     */
    QUEUE_STATE((short)3, "queueState");

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
        case 1: // QUEUE_NAME
          return QUEUE_NAME;
        case 2: // QUEUE_ATTRIBUTE
          return QUEUE_ATTRIBUTE;
        case 3: // QUEUE_STATE
          return QUEUE_STATE;
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
    tmpMap.put(_Fields.QUEUE_NAME, new libthrift091.meta_data.FieldMetaData("queueName", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.QUEUE_ATTRIBUTE, new libthrift091.meta_data.FieldMetaData("queueAttribute", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, QueueAttribute.class)));
    tmpMap.put(_Fields.QUEUE_STATE, new libthrift091.meta_data.FieldMetaData("queueState", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, QueueState.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(GetQueueInfoResponse.class, metaDataMap);
  }

  public GetQueueInfoResponse() {
  }

  public GetQueueInfoResponse(
    String queueName,
    QueueAttribute queueAttribute,
    QueueState queueState)
  {
    this();
    this.queueName = queueName;
    this.queueAttribute = queueAttribute;
    this.queueState = queueState;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetQueueInfoResponse(GetQueueInfoResponse other) {
    if (other.isSetQueueName()) {
      this.queueName = other.queueName;
    }
    if (other.isSetQueueAttribute()) {
      this.queueAttribute = new QueueAttribute(other.queueAttribute);
    }
    if (other.isSetQueueState()) {
      this.queueState = new QueueState(other.queueState);
    }
  }

  public GetQueueInfoResponse deepCopy() {
    return new GetQueueInfoResponse(this);
  }

  @Override
  public void clear() {
    this.queueName = null;
    this.queueAttribute = null;
    this.queueState = null;
  }

  /**
   * The queue name
   * 
   */
  public String getQueueName() {
    return this.queueName;
  }

  /**
   * The queue name
   * 
   */
  public GetQueueInfoResponse setQueueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

  public void unsetQueueName() {
    this.queueName = null;
  }

  /** Returns true if field queueName is set (has been assigned a value) and false otherwise */
  public boolean isSetQueueName() {
    return this.queueName != null;
  }

  public void setQueueNameIsSet(boolean value) {
    if (!value) {
      this.queueName = null;
    }
  }

  /**
   * The queue attribute;
   * 
   */
  public QueueAttribute getQueueAttribute() {
    return this.queueAttribute;
  }

  /**
   * The queue attribute;
   * 
   */
  public GetQueueInfoResponse setQueueAttribute(QueueAttribute queueAttribute) {
    this.queueAttribute = queueAttribute;
    return this;
  }

  public void unsetQueueAttribute() {
    this.queueAttribute = null;
  }

  /** Returns true if field queueAttribute is set (has been assigned a value) and false otherwise */
  public boolean isSetQueueAttribute() {
    return this.queueAttribute != null;
  }

  public void setQueueAttributeIsSet(boolean value) {
    if (!value) {
      this.queueAttribute = null;
    }
  }

  /**
   * The queue state;
   * 
   */
  public QueueState getQueueState() {
    return this.queueState;
  }

  /**
   * The queue state;
   * 
   */
  public GetQueueInfoResponse setQueueState(QueueState queueState) {
    this.queueState = queueState;
    return this;
  }

  public void unsetQueueState() {
    this.queueState = null;
  }

  /** Returns true if field queueState is set (has been assigned a value) and false otherwise */
  public boolean isSetQueueState() {
    return this.queueState != null;
  }

  public void setQueueStateIsSet(boolean value) {
    if (!value) {
      this.queueState = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUEUE_NAME:
      if (value == null) {
        unsetQueueName();
      } else {
        setQueueName((String)value);
      }
      break;

    case QUEUE_ATTRIBUTE:
      if (value == null) {
        unsetQueueAttribute();
      } else {
        setQueueAttribute((QueueAttribute)value);
      }
      break;

    case QUEUE_STATE:
      if (value == null) {
        unsetQueueState();
      } else {
        setQueueState((QueueState)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUEUE_NAME:
      return getQueueName();

    case QUEUE_ATTRIBUTE:
      return getQueueAttribute();

    case QUEUE_STATE:
      return getQueueState();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUEUE_NAME:
      return isSetQueueName();
    case QUEUE_ATTRIBUTE:
      return isSetQueueAttribute();
    case QUEUE_STATE:
      return isSetQueueState();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetQueueInfoResponse)
      return this.equals((GetQueueInfoResponse)that);
    return false;
  }

  public boolean equals(GetQueueInfoResponse that) {
    if (that == null)
      return false;

    boolean this_present_queueName = true && this.isSetQueueName();
    boolean that_present_queueName = true && that.isSetQueueName();
    if (this_present_queueName || that_present_queueName) {
      if (!(this_present_queueName && that_present_queueName))
        return false;
      if (!this.queueName.equals(that.queueName))
        return false;
    }

    boolean this_present_queueAttribute = true && this.isSetQueueAttribute();
    boolean that_present_queueAttribute = true && that.isSetQueueAttribute();
    if (this_present_queueAttribute || that_present_queueAttribute) {
      if (!(this_present_queueAttribute && that_present_queueAttribute))
        return false;
      if (!this.queueAttribute.equals(that.queueAttribute))
        return false;
    }

    boolean this_present_queueState = true && this.isSetQueueState();
    boolean that_present_queueState = true && that.isSetQueueState();
    if (this_present_queueState || that_present_queueState) {
      if (!(this_present_queueState && that_present_queueState))
        return false;
      if (!this.queueState.equals(that.queueState))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_queueName = true && (isSetQueueName());
    list.add(present_queueName);
    if (present_queueName)
      list.add(queueName);

    boolean present_queueAttribute = true && (isSetQueueAttribute());
    list.add(present_queueAttribute);
    if (present_queueAttribute)
      list.add(queueAttribute);

    boolean present_queueState = true && (isSetQueueState());
    list.add(present_queueState);
    if (present_queueState)
      list.add(queueState);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetQueueInfoResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetQueueName()).compareTo(other.isSetQueueName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueueName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.queueName, other.queueName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQueueAttribute()).compareTo(other.isSetQueueAttribute());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueueAttribute()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.queueAttribute, other.queueAttribute);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQueueState()).compareTo(other.isSetQueueState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueueState()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.queueState, other.queueState);
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
    StringBuilder sb = new StringBuilder("GetQueueInfoResponse(");
    boolean first = true;

    sb.append("queueName:");
    if (this.queueName == null) {
      sb.append("null");
    } else {
      sb.append(this.queueName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("queueAttribute:");
    if (this.queueAttribute == null) {
      sb.append("null");
    } else {
      sb.append(this.queueAttribute);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("queueState:");
    if (this.queueState == null) {
      sb.append("null");
    } else {
      sb.append(this.queueState);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (queueName == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'queueName' was not present! Struct: " + toString());
    }
    if (queueAttribute == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'queueAttribute' was not present! Struct: " + toString());
    }
    if (queueState == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'queueState' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (queueAttribute != null) {
      queueAttribute.validate();
    }
    if (queueState != null) {
      queueState.validate();
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

  private static class GetQueueInfoResponseStandardSchemeFactory implements SchemeFactory {
    public GetQueueInfoResponseStandardScheme getScheme() {
      return new GetQueueInfoResponseStandardScheme();
    }
  }

  private static class GetQueueInfoResponseStandardScheme extends StandardScheme<GetQueueInfoResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, GetQueueInfoResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUEUE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.queueName = iprot.readString();
              struct.setQueueNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // QUEUE_ATTRIBUTE
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.queueAttribute = new QueueAttribute();
              struct.queueAttribute.read(iprot);
              struct.setQueueAttributeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // QUEUE_STATE
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.queueState = new QueueState();
              struct.queueState.read(iprot);
              struct.setQueueStateIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, GetQueueInfoResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.queueName != null) {
        oprot.writeFieldBegin(QUEUE_NAME_FIELD_DESC);
        oprot.writeString(struct.queueName);
        oprot.writeFieldEnd();
      }
      if (struct.queueAttribute != null) {
        oprot.writeFieldBegin(QUEUE_ATTRIBUTE_FIELD_DESC);
        struct.queueAttribute.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.queueState != null) {
        oprot.writeFieldBegin(QUEUE_STATE_FIELD_DESC);
        struct.queueState.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetQueueInfoResponseTupleSchemeFactory implements SchemeFactory {
    public GetQueueInfoResponseTupleScheme getScheme() {
      return new GetQueueInfoResponseTupleScheme();
    }
  }

  private static class GetQueueInfoResponseTupleScheme extends TupleScheme<GetQueueInfoResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, GetQueueInfoResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.queueName);
      struct.queueAttribute.write(oprot);
      struct.queueState.write(oprot);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, GetQueueInfoResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.queueName = iprot.readString();
      struct.setQueueNameIsSet(true);
      struct.queueAttribute = new QueueAttribute();
      struct.queueAttribute.read(iprot);
      struct.setQueueAttributeIsSet(true);
      struct.queueState = new QueueState();
      struct.queueState.read(iprot);
      struct.setQueueStateIsSet(true);
    }
  }

}

