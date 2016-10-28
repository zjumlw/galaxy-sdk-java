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
public class AddSubResourceNameRequest implements libthrift091.TBase<AddSubResourceNameRequest, AddSubResourceNameRequest._Fields>, java.io.Serializable, Cloneable, Comparable<AddSubResourceNameRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("AddSubResourceNameRequest");

  private static final libthrift091.protocol.TField TOPIC_TALOS_RESOURCE_NAME_FIELD_DESC = new libthrift091.protocol.TField("topicTalosResourceName", libthrift091.protocol.TType.STRUCT, (short)1);
  private static final libthrift091.protocol.TField ORG_ID_FIELD_DESC = new libthrift091.protocol.TField("orgId", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField ADMIN_TEAM_ID_FIELD_DESC = new libthrift091.protocol.TField("adminTeamId", libthrift091.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AddSubResourceNameRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AddSubResourceNameRequestTupleSchemeFactory());
  }

  /**
   * Add subResourceName for specified resourceName, after 'addSubResourceName',
   * one can visit topic by a Role of Cloud-Manager with specified teamId
   * 
   */
  public TopicTalosResourceName topicTalosResourceName; // required
  /**
   * OrgId which the topic transfer to, must starts with 'CL'
   * 
   */
  public String orgId; // required
  /**
   * TeamId which specified the admin of the topic, must starts with 'CI'
   * 
   */
  public String adminTeamId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * Add subResourceName for specified resourceName, after 'addSubResourceName',
     * one can visit topic by a Role of Cloud-Manager with specified teamId
     * 
     */
    TOPIC_TALOS_RESOURCE_NAME((short)1, "topicTalosResourceName"),
    /**
     * OrgId which the topic transfer to, must starts with 'CL'
     * 
     */
    ORG_ID((short)2, "orgId"),
    /**
     * TeamId which specified the admin of the topic, must starts with 'CI'
     * 
     */
    ADMIN_TEAM_ID((short)3, "adminTeamId");

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
        case 1: // TOPIC_TALOS_RESOURCE_NAME
          return TOPIC_TALOS_RESOURCE_NAME;
        case 2: // ORG_ID
          return ORG_ID;
        case 3: // ADMIN_TEAM_ID
          return ADMIN_TEAM_ID;
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
    tmpMap.put(_Fields.TOPIC_TALOS_RESOURCE_NAME, new libthrift091.meta_data.FieldMetaData("topicTalosResourceName", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, TopicTalosResourceName.class)));
    tmpMap.put(_Fields.ORG_ID, new libthrift091.meta_data.FieldMetaData("orgId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.ADMIN_TEAM_ID, new libthrift091.meta_data.FieldMetaData("adminTeamId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(AddSubResourceNameRequest.class, metaDataMap);
  }

  public AddSubResourceNameRequest() {
  }

  public AddSubResourceNameRequest(
    TopicTalosResourceName topicTalosResourceName,
    String orgId,
    String adminTeamId)
  {
    this();
    this.topicTalosResourceName = topicTalosResourceName;
    this.orgId = orgId;
    this.adminTeamId = adminTeamId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AddSubResourceNameRequest(AddSubResourceNameRequest other) {
    if (other.isSetTopicTalosResourceName()) {
      this.topicTalosResourceName = new TopicTalosResourceName(other.topicTalosResourceName);
    }
    if (other.isSetOrgId()) {
      this.orgId = other.orgId;
    }
    if (other.isSetAdminTeamId()) {
      this.adminTeamId = other.adminTeamId;
    }
  }

  public AddSubResourceNameRequest deepCopy() {
    return new AddSubResourceNameRequest(this);
  }

  @Override
  public void clear() {
    this.topicTalosResourceName = null;
    this.orgId = null;
    this.adminTeamId = null;
  }

  /**
   * Add subResourceName for specified resourceName, after 'addSubResourceName',
   * one can visit topic by a Role of Cloud-Manager with specified teamId
   * 
   */
  public TopicTalosResourceName getTopicTalosResourceName() {
    return this.topicTalosResourceName;
  }

  /**
   * Add subResourceName for specified resourceName, after 'addSubResourceName',
   * one can visit topic by a Role of Cloud-Manager with specified teamId
   * 
   */
  public AddSubResourceNameRequest setTopicTalosResourceName(TopicTalosResourceName topicTalosResourceName) {
    this.topicTalosResourceName = topicTalosResourceName;
    return this;
  }

  public void unsetTopicTalosResourceName() {
    this.topicTalosResourceName = null;
  }

  /** Returns true if field topicTalosResourceName is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicTalosResourceName() {
    return this.topicTalosResourceName != null;
  }

  public void setTopicTalosResourceNameIsSet(boolean value) {
    if (!value) {
      this.topicTalosResourceName = null;
    }
  }

  /**
   * OrgId which the topic transfer to, must starts with 'CL'
   * 
   */
  public String getOrgId() {
    return this.orgId;
  }

  /**
   * OrgId which the topic transfer to, must starts with 'CL'
   * 
   */
  public AddSubResourceNameRequest setOrgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

  public void unsetOrgId() {
    this.orgId = null;
  }

  /** Returns true if field orgId is set (has been assigned a value) and false otherwise */
  public boolean isSetOrgId() {
    return this.orgId != null;
  }

  public void setOrgIdIsSet(boolean value) {
    if (!value) {
      this.orgId = null;
    }
  }

  /**
   * TeamId which specified the admin of the topic, must starts with 'CI'
   * 
   */
  public String getAdminTeamId() {
    return this.adminTeamId;
  }

  /**
   * TeamId which specified the admin of the topic, must starts with 'CI'
   * 
   */
  public AddSubResourceNameRequest setAdminTeamId(String adminTeamId) {
    this.adminTeamId = adminTeamId;
    return this;
  }

  public void unsetAdminTeamId() {
    this.adminTeamId = null;
  }

  /** Returns true if field adminTeamId is set (has been assigned a value) and false otherwise */
  public boolean isSetAdminTeamId() {
    return this.adminTeamId != null;
  }

  public void setAdminTeamIdIsSet(boolean value) {
    if (!value) {
      this.adminTeamId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPIC_TALOS_RESOURCE_NAME:
      if (value == null) {
        unsetTopicTalosResourceName();
      } else {
        setTopicTalosResourceName((TopicTalosResourceName)value);
      }
      break;

    case ORG_ID:
      if (value == null) {
        unsetOrgId();
      } else {
        setOrgId((String)value);
      }
      break;

    case ADMIN_TEAM_ID:
      if (value == null) {
        unsetAdminTeamId();
      } else {
        setAdminTeamId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPIC_TALOS_RESOURCE_NAME:
      return getTopicTalosResourceName();

    case ORG_ID:
      return getOrgId();

    case ADMIN_TEAM_ID:
      return getAdminTeamId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPIC_TALOS_RESOURCE_NAME:
      return isSetTopicTalosResourceName();
    case ORG_ID:
      return isSetOrgId();
    case ADMIN_TEAM_ID:
      return isSetAdminTeamId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AddSubResourceNameRequest)
      return this.equals((AddSubResourceNameRequest)that);
    return false;
  }

  public boolean equals(AddSubResourceNameRequest that) {
    if (that == null)
      return false;

    boolean this_present_topicTalosResourceName = true && this.isSetTopicTalosResourceName();
    boolean that_present_topicTalosResourceName = true && that.isSetTopicTalosResourceName();
    if (this_present_topicTalosResourceName || that_present_topicTalosResourceName) {
      if (!(this_present_topicTalosResourceName && that_present_topicTalosResourceName))
        return false;
      if (!this.topicTalosResourceName.equals(that.topicTalosResourceName))
        return false;
    }

    boolean this_present_orgId = true && this.isSetOrgId();
    boolean that_present_orgId = true && that.isSetOrgId();
    if (this_present_orgId || that_present_orgId) {
      if (!(this_present_orgId && that_present_orgId))
        return false;
      if (!this.orgId.equals(that.orgId))
        return false;
    }

    boolean this_present_adminTeamId = true && this.isSetAdminTeamId();
    boolean that_present_adminTeamId = true && that.isSetAdminTeamId();
    if (this_present_adminTeamId || that_present_adminTeamId) {
      if (!(this_present_adminTeamId && that_present_adminTeamId))
        return false;
      if (!this.adminTeamId.equals(that.adminTeamId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topicTalosResourceName = true && (isSetTopicTalosResourceName());
    list.add(present_topicTalosResourceName);
    if (present_topicTalosResourceName)
      list.add(topicTalosResourceName);

    boolean present_orgId = true && (isSetOrgId());
    list.add(present_orgId);
    if (present_orgId)
      list.add(orgId);

    boolean present_adminTeamId = true && (isSetAdminTeamId());
    list.add(present_adminTeamId);
    if (present_adminTeamId)
      list.add(adminTeamId);

    return list.hashCode();
  }

  @Override
  public int compareTo(AddSubResourceNameRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTopicTalosResourceName()).compareTo(other.isSetTopicTalosResourceName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicTalosResourceName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicTalosResourceName, other.topicTalosResourceName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOrgId()).compareTo(other.isSetOrgId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrgId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.orgId, other.orgId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAdminTeamId()).compareTo(other.isSetAdminTeamId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdminTeamId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.adminTeamId, other.adminTeamId);
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
    StringBuilder sb = new StringBuilder("AddSubResourceNameRequest(");
    boolean first = true;

    sb.append("topicTalosResourceName:");
    if (this.topicTalosResourceName == null) {
      sb.append("null");
    } else {
      sb.append(this.topicTalosResourceName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("orgId:");
    if (this.orgId == null) {
      sb.append("null");
    } else {
      sb.append(this.orgId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("adminTeamId:");
    if (this.adminTeamId == null) {
      sb.append("null");
    } else {
      sb.append(this.adminTeamId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (topicTalosResourceName == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicTalosResourceName' was not present! Struct: " + toString());
    }
    if (orgId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'orgId' was not present! Struct: " + toString());
    }
    if (adminTeamId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'adminTeamId' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (topicTalosResourceName != null) {
      topicTalosResourceName.validate();
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

  private static class AddSubResourceNameRequestStandardSchemeFactory implements SchemeFactory {
    public AddSubResourceNameRequestStandardScheme getScheme() {
      return new AddSubResourceNameRequestStandardScheme();
    }
  }

  private static class AddSubResourceNameRequestStandardScheme extends StandardScheme<AddSubResourceNameRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, AddSubResourceNameRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPIC_TALOS_RESOURCE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicTalosResourceName = new TopicTalosResourceName();
              struct.topicTalosResourceName.read(iprot);
              struct.setTopicTalosResourceNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ORG_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.orgId = iprot.readString();
              struct.setOrgIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ADMIN_TEAM_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.adminTeamId = iprot.readString();
              struct.setAdminTeamIdIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, AddSubResourceNameRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topicTalosResourceName != null) {
        oprot.writeFieldBegin(TOPIC_TALOS_RESOURCE_NAME_FIELD_DESC);
        struct.topicTalosResourceName.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.orgId != null) {
        oprot.writeFieldBegin(ORG_ID_FIELD_DESC);
        oprot.writeString(struct.orgId);
        oprot.writeFieldEnd();
      }
      if (struct.adminTeamId != null) {
        oprot.writeFieldBegin(ADMIN_TEAM_ID_FIELD_DESC);
        oprot.writeString(struct.adminTeamId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AddSubResourceNameRequestTupleSchemeFactory implements SchemeFactory {
    public AddSubResourceNameRequestTupleScheme getScheme() {
      return new AddSubResourceNameRequestTupleScheme();
    }
  }

  private static class AddSubResourceNameRequestTupleScheme extends TupleScheme<AddSubResourceNameRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, AddSubResourceNameRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.topicTalosResourceName.write(oprot);
      oprot.writeString(struct.orgId);
      oprot.writeString(struct.adminTeamId);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, AddSubResourceNameRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topicTalosResourceName = new TopicTalosResourceName();
      struct.topicTalosResourceName.read(iprot);
      struct.setTopicTalosResourceNameIsSet(true);
      struct.orgId = iprot.readString();
      struct.setOrgIdIsSet(true);
      struct.adminTeamId = iprot.readString();
      struct.setAdminTeamIdIsSet(true);
    }
  }

}

