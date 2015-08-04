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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-4")
public class SetQuotaRequest implements libthrift091.TBase<SetQuotaRequest, SetQuotaRequest._Fields>, java.io.Serializable, Cloneable, Comparable<SetQuotaRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("SetQuotaRequest");

  private static final libthrift091.protocol.TField DEVELOPER_ID_FIELD_DESC = new libthrift091.protocol.TField("developerId", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField USER_QUOTA_FIELD_DESC = new libthrift091.protocol.TField("userQuota", libthrift091.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SetQuotaRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SetQuotaRequestTupleSchemeFactory());
  }

  /**
   * The developerId to set quota;
   * 
   */
  public String developerId; // required
  /**
   * The user quota;
   * 
   */
  public UserQuota userQuota; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The developerId to set quota;
     * 
     */
    DEVELOPER_ID((short)1, "developerId"),
    /**
     * The user quota;
     * 
     */
    USER_QUOTA((short)2, "userQuota");

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
        case 1: // DEVELOPER_ID
          return DEVELOPER_ID;
        case 2: // USER_QUOTA
          return USER_QUOTA;
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
    tmpMap.put(_Fields.DEVELOPER_ID, new libthrift091.meta_data.FieldMetaData("developerId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_QUOTA, new libthrift091.meta_data.FieldMetaData("userQuota", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, UserQuota.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(SetQuotaRequest.class, metaDataMap);
  }

  public SetQuotaRequest() {
  }

  public SetQuotaRequest(
    String developerId,
    UserQuota userQuota)
  {
    this();
    this.developerId = developerId;
    this.userQuota = userQuota;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SetQuotaRequest(SetQuotaRequest other) {
    if (other.isSetDeveloperId()) {
      this.developerId = other.developerId;
    }
    if (other.isSetUserQuota()) {
      this.userQuota = new UserQuota(other.userQuota);
    }
  }

  public SetQuotaRequest deepCopy() {
    return new SetQuotaRequest(this);
  }

  @Override
  public void clear() {
    this.developerId = null;
    this.userQuota = null;
  }

  /**
   * The developerId to set quota;
   * 
   */
  public String getDeveloperId() {
    return this.developerId;
  }

  /**
   * The developerId to set quota;
   * 
   */
  public SetQuotaRequest setDeveloperId(String developerId) {
    this.developerId = developerId;
    return this;
  }

  public void unsetDeveloperId() {
    this.developerId = null;
  }

  /** Returns true if field developerId is set (has been assigned a value) and false otherwise */
  public boolean isSetDeveloperId() {
    return this.developerId != null;
  }

  public void setDeveloperIdIsSet(boolean value) {
    if (!value) {
      this.developerId = null;
    }
  }

  /**
   * The user quota;
   * 
   */
  public UserQuota getUserQuota() {
    return this.userQuota;
  }

  /**
   * The user quota;
   * 
   */
  public SetQuotaRequest setUserQuota(UserQuota userQuota) {
    this.userQuota = userQuota;
    return this;
  }

  public void unsetUserQuota() {
    this.userQuota = null;
  }

  /** Returns true if field userQuota is set (has been assigned a value) and false otherwise */
  public boolean isSetUserQuota() {
    return this.userQuota != null;
  }

  public void setUserQuotaIsSet(boolean value) {
    if (!value) {
      this.userQuota = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DEVELOPER_ID:
      if (value == null) {
        unsetDeveloperId();
      } else {
        setDeveloperId((String)value);
      }
      break;

    case USER_QUOTA:
      if (value == null) {
        unsetUserQuota();
      } else {
        setUserQuota((UserQuota)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DEVELOPER_ID:
      return getDeveloperId();

    case USER_QUOTA:
      return getUserQuota();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DEVELOPER_ID:
      return isSetDeveloperId();
    case USER_QUOTA:
      return isSetUserQuota();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SetQuotaRequest)
      return this.equals((SetQuotaRequest)that);
    return false;
  }

  public boolean equals(SetQuotaRequest that) {
    if (that == null)
      return false;

    boolean this_present_developerId = true && this.isSetDeveloperId();
    boolean that_present_developerId = true && that.isSetDeveloperId();
    if (this_present_developerId || that_present_developerId) {
      if (!(this_present_developerId && that_present_developerId))
        return false;
      if (!this.developerId.equals(that.developerId))
        return false;
    }

    boolean this_present_userQuota = true && this.isSetUserQuota();
    boolean that_present_userQuota = true && that.isSetUserQuota();
    if (this_present_userQuota || that_present_userQuota) {
      if (!(this_present_userQuota && that_present_userQuota))
        return false;
      if (!this.userQuota.equals(that.userQuota))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_developerId = true && (isSetDeveloperId());
    list.add(present_developerId);
    if (present_developerId)
      list.add(developerId);

    boolean present_userQuota = true && (isSetUserQuota());
    list.add(present_userQuota);
    if (present_userQuota)
      list.add(userQuota);

    return list.hashCode();
  }

  @Override
  public int compareTo(SetQuotaRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDeveloperId()).compareTo(other.isSetDeveloperId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeveloperId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.developerId, other.developerId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserQuota()).compareTo(other.isSetUserQuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserQuota()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.userQuota, other.userQuota);
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
    StringBuilder sb = new StringBuilder("SetQuotaRequest(");
    boolean first = true;

    sb.append("developerId:");
    if (this.developerId == null) {
      sb.append("null");
    } else {
      sb.append(this.developerId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userQuota:");
    if (this.userQuota == null) {
      sb.append("null");
    } else {
      sb.append(this.userQuota);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (developerId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'developerId' was not present! Struct: " + toString());
    }
    if (userQuota == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'userQuota' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (userQuota != null) {
      userQuota.validate();
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

  private static class SetQuotaRequestStandardSchemeFactory implements SchemeFactory {
    public SetQuotaRequestStandardScheme getScheme() {
      return new SetQuotaRequestStandardScheme();
    }
  }

  private static class SetQuotaRequestStandardScheme extends StandardScheme<SetQuotaRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, SetQuotaRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DEVELOPER_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.developerId = iprot.readString();
              struct.setDeveloperIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER_QUOTA
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.userQuota = new UserQuota();
              struct.userQuota.read(iprot);
              struct.setUserQuotaIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, SetQuotaRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.developerId != null) {
        oprot.writeFieldBegin(DEVELOPER_ID_FIELD_DESC);
        oprot.writeString(struct.developerId);
        oprot.writeFieldEnd();
      }
      if (struct.userQuota != null) {
        oprot.writeFieldBegin(USER_QUOTA_FIELD_DESC);
        struct.userQuota.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SetQuotaRequestTupleSchemeFactory implements SchemeFactory {
    public SetQuotaRequestTupleScheme getScheme() {
      return new SetQuotaRequestTupleScheme();
    }
  }

  private static class SetQuotaRequestTupleScheme extends TupleScheme<SetQuotaRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, SetQuotaRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.developerId);
      struct.userQuota.write(oprot);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, SetQuotaRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.developerId = iprot.readString();
      struct.setDeveloperIdIsSet(true);
      struct.userQuota = new UserQuota();
      struct.userQuota.read(iprot);
      struct.setUserQuotaIsSet(true);
    }
  }

}

