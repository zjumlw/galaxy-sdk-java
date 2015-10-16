/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emr.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-15")
public class StartServiceRequest implements libthrift091.TBase<StartServiceRequest, StartServiceRequest._Fields>, java.io.Serializable, Cloneable, Comparable<StartServiceRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("StartServiceRequest");

  private static final libthrift091.protocol.TField CLUSTER_FIELD_DESC = new libthrift091.protocol.TField("cluster", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField SERVICES_FIELD_DESC = new libthrift091.protocol.TField("services", libthrift091.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StartServiceRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StartServiceRequestTupleSchemeFactory());
  }

  public String cluster; // optional
  public List<String> services; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    CLUSTER((short)1, "cluster"),
    SERVICES((short)2, "services");

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
        case 1: // CLUSTER
          return CLUSTER;
        case 2: // SERVICES
          return SERVICES;
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
  private static final _Fields optionals[] = {_Fields.CLUSTER,_Fields.SERVICES};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CLUSTER, new libthrift091.meta_data.FieldMetaData("cluster", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.SERVICES, new libthrift091.meta_data.FieldMetaData("services", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(StartServiceRequest.class, metaDataMap);
  }

  public StartServiceRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StartServiceRequest(StartServiceRequest other) {
    if (other.isSetCluster()) {
      this.cluster = other.cluster;
    }
    if (other.isSetServices()) {
      List<String> __this__services = new ArrayList<String>(other.services);
      this.services = __this__services;
    }
  }

  public StartServiceRequest deepCopy() {
    return new StartServiceRequest(this);
  }

  @Override
  public void clear() {
    this.cluster = null;
    this.services = null;
  }

  public String getCluster() {
    return this.cluster;
  }

  public StartServiceRequest setCluster(String cluster) {
    this.cluster = cluster;
    return this;
  }

  public void unsetCluster() {
    this.cluster = null;
  }

  /** Returns true if field cluster is set (has been assigned a value) and false otherwise */
  public boolean isSetCluster() {
    return this.cluster != null;
  }

  public void setClusterIsSet(boolean value) {
    if (!value) {
      this.cluster = null;
    }
  }

  public int getServicesSize() {
    return (this.services == null) ? 0 : this.services.size();
  }

  public java.util.Iterator<String> getServicesIterator() {
    return (this.services == null) ? null : this.services.iterator();
  }

  public void addToServices(String elem) {
    if (this.services == null) {
      this.services = new ArrayList<String>();
    }
    this.services.add(elem);
  }

  public List<String> getServices() {
    return this.services;
  }

  public StartServiceRequest setServices(List<String> services) {
    this.services = services;
    return this;
  }

  public void unsetServices() {
    this.services = null;
  }

  /** Returns true if field services is set (has been assigned a value) and false otherwise */
  public boolean isSetServices() {
    return this.services != null;
  }

  public void setServicesIsSet(boolean value) {
    if (!value) {
      this.services = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CLUSTER:
      if (value == null) {
        unsetCluster();
      } else {
        setCluster((String)value);
      }
      break;

    case SERVICES:
      if (value == null) {
        unsetServices();
      } else {
        setServices((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CLUSTER:
      return getCluster();

    case SERVICES:
      return getServices();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CLUSTER:
      return isSetCluster();
    case SERVICES:
      return isSetServices();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StartServiceRequest)
      return this.equals((StartServiceRequest)that);
    return false;
  }

  public boolean equals(StartServiceRequest that) {
    if (that == null)
      return false;

    boolean this_present_cluster = true && this.isSetCluster();
    boolean that_present_cluster = true && that.isSetCluster();
    if (this_present_cluster || that_present_cluster) {
      if (!(this_present_cluster && that_present_cluster))
        return false;
      if (!this.cluster.equals(that.cluster))
        return false;
    }

    boolean this_present_services = true && this.isSetServices();
    boolean that_present_services = true && that.isSetServices();
    if (this_present_services || that_present_services) {
      if (!(this_present_services && that_present_services))
        return false;
      if (!this.services.equals(that.services))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_cluster = true && (isSetCluster());
    list.add(present_cluster);
    if (present_cluster)
      list.add(cluster);

    boolean present_services = true && (isSetServices());
    list.add(present_services);
    if (present_services)
      list.add(services);

    return list.hashCode();
  }

  @Override
  public int compareTo(StartServiceRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCluster()).compareTo(other.isSetCluster());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCluster()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.cluster, other.cluster);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetServices()).compareTo(other.isSetServices());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServices()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.services, other.services);
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
    StringBuilder sb = new StringBuilder("StartServiceRequest(");
    boolean first = true;

    if (isSetCluster()) {
      sb.append("cluster:");
      if (this.cluster == null) {
        sb.append("null");
      } else {
        sb.append(this.cluster);
      }
      first = false;
    }
    if (isSetServices()) {
      if (!first) sb.append(", ");
      sb.append("services:");
      if (this.services == null) {
        sb.append("null");
      } else {
        sb.append(this.services);
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
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StartServiceRequestStandardSchemeFactory implements SchemeFactory {
    public StartServiceRequestStandardScheme getScheme() {
      return new StartServiceRequestStandardScheme();
    }
  }

  private static class StartServiceRequestStandardScheme extends StandardScheme<StartServiceRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, StartServiceRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CLUSTER
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.cluster = iprot.readString();
              struct.setClusterIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SERVICES
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list166 = iprot.readListBegin();
                struct.services = new ArrayList<String>(_list166.size);
                String _elem167;
                for (int _i168 = 0; _i168 < _list166.size; ++_i168)
                {
                  _elem167 = iprot.readString();
                  struct.services.add(_elem167);
                }
                iprot.readListEnd();
              }
              struct.setServicesIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, StartServiceRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cluster != null) {
        if (struct.isSetCluster()) {
          oprot.writeFieldBegin(CLUSTER_FIELD_DESC);
          oprot.writeString(struct.cluster);
          oprot.writeFieldEnd();
        }
      }
      if (struct.services != null) {
        if (struct.isSetServices()) {
          oprot.writeFieldBegin(SERVICES_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRING, struct.services.size()));
            for (String _iter169 : struct.services)
            {
              oprot.writeString(_iter169);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StartServiceRequestTupleSchemeFactory implements SchemeFactory {
    public StartServiceRequestTupleScheme getScheme() {
      return new StartServiceRequestTupleScheme();
    }
  }

  private static class StartServiceRequestTupleScheme extends TupleScheme<StartServiceRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, StartServiceRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCluster()) {
        optionals.set(0);
      }
      if (struct.isSetServices()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCluster()) {
        oprot.writeString(struct.cluster);
      }
      if (struct.isSetServices()) {
        {
          oprot.writeI32(struct.services.size());
          for (String _iter170 : struct.services)
          {
            oprot.writeString(_iter170);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, StartServiceRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.cluster = iprot.readString();
        struct.setClusterIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TList _list171 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRING, iprot.readI32());
          struct.services = new ArrayList<String>(_list171.size);
          String _elem172;
          for (int _i173 = 0; _i173 < _list171.size; ++_i173)
          {
            _elem172 = iprot.readString();
            struct.services.add(_elem172);
          }
        }
        struct.setServicesIsSet(true);
      }
    }
  }

}

