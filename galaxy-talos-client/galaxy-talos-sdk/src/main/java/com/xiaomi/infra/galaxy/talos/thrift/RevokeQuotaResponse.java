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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2018-1-4")
public class RevokeQuotaResponse implements libthrift091.TBase<RevokeQuotaResponse, RevokeQuotaResponse._Fields>, java.io.Serializable, Cloneable, Comparable<RevokeQuotaResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("RevokeQuotaResponse");

  private static final libthrift091.protocol.TField PENDING_QUOTA_LIST_FIELD_DESC = new libthrift091.protocol.TField("pendingQuotaList", libthrift091.protocol.TType.LIST, (short)1);
  private static final libthrift091.protocol.TField TALOS_ADMIN_FIELD_DESC = new libthrift091.protocol.TField("talosAdmin", libthrift091.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RevokeQuotaResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RevokeQuotaResponseTupleSchemeFactory());
  }

  /**
   * pending quota application
   * 
   */
  public List<PartitionQuotaInfo> pendingQuotaList; // required
  /**
   * is or not Talos Admin
   * 
   */
  public boolean talosAdmin; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * pending quota application
     * 
     */
    PENDING_QUOTA_LIST((short)1, "pendingQuotaList"),
    /**
     * is or not Talos Admin
     * 
     */
    TALOS_ADMIN((short)2, "talosAdmin");

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
        case 1: // PENDING_QUOTA_LIST
          return PENDING_QUOTA_LIST;
        case 2: // TALOS_ADMIN
          return TALOS_ADMIN;
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
  private static final int __TALOSADMIN_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PENDING_QUOTA_LIST, new libthrift091.meta_data.FieldMetaData("pendingQuotaList", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, PartitionQuotaInfo.class))));
    tmpMap.put(_Fields.TALOS_ADMIN, new libthrift091.meta_data.FieldMetaData("talosAdmin", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(RevokeQuotaResponse.class, metaDataMap);
  }

  public RevokeQuotaResponse() {
  }

  public RevokeQuotaResponse(
    List<PartitionQuotaInfo> pendingQuotaList,
    boolean talosAdmin)
  {
    this();
    this.pendingQuotaList = pendingQuotaList;
    this.talosAdmin = talosAdmin;
    setTalosAdminIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RevokeQuotaResponse(RevokeQuotaResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetPendingQuotaList()) {
      List<PartitionQuotaInfo> __this__pendingQuotaList = new ArrayList<PartitionQuotaInfo>(other.pendingQuotaList.size());
      for (PartitionQuotaInfo other_element : other.pendingQuotaList) {
        __this__pendingQuotaList.add(new PartitionQuotaInfo(other_element));
      }
      this.pendingQuotaList = __this__pendingQuotaList;
    }
    this.talosAdmin = other.talosAdmin;
  }

  public RevokeQuotaResponse deepCopy() {
    return new RevokeQuotaResponse(this);
  }

  @Override
  public void clear() {
    this.pendingQuotaList = null;
    setTalosAdminIsSet(false);
    this.talosAdmin = false;
  }

  public int getPendingQuotaListSize() {
    return (this.pendingQuotaList == null) ? 0 : this.pendingQuotaList.size();
  }

  public java.util.Iterator<PartitionQuotaInfo> getPendingQuotaListIterator() {
    return (this.pendingQuotaList == null) ? null : this.pendingQuotaList.iterator();
  }

  public void addToPendingQuotaList(PartitionQuotaInfo elem) {
    if (this.pendingQuotaList == null) {
      this.pendingQuotaList = new ArrayList<PartitionQuotaInfo>();
    }
    this.pendingQuotaList.add(elem);
  }

  /**
   * pending quota application
   * 
   */
  public List<PartitionQuotaInfo> getPendingQuotaList() {
    return this.pendingQuotaList;
  }

  /**
   * pending quota application
   * 
   */
  public RevokeQuotaResponse setPendingQuotaList(List<PartitionQuotaInfo> pendingQuotaList) {
    this.pendingQuotaList = pendingQuotaList;
    return this;
  }

  public void unsetPendingQuotaList() {
    this.pendingQuotaList = null;
  }

  /** Returns true if field pendingQuotaList is set (has been assigned a value) and false otherwise */
  public boolean isSetPendingQuotaList() {
    return this.pendingQuotaList != null;
  }

  public void setPendingQuotaListIsSet(boolean value) {
    if (!value) {
      this.pendingQuotaList = null;
    }
  }

  /**
   * is or not Talos Admin
   * 
   */
  public boolean isTalosAdmin() {
    return this.talosAdmin;
  }

  /**
   * is or not Talos Admin
   * 
   */
  public RevokeQuotaResponse setTalosAdmin(boolean talosAdmin) {
    this.talosAdmin = talosAdmin;
    setTalosAdminIsSet(true);
    return this;
  }

  public void unsetTalosAdmin() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TALOSADMIN_ISSET_ID);
  }

  /** Returns true if field talosAdmin is set (has been assigned a value) and false otherwise */
  public boolean isSetTalosAdmin() {
    return EncodingUtils.testBit(__isset_bitfield, __TALOSADMIN_ISSET_ID);
  }

  public void setTalosAdminIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TALOSADMIN_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PENDING_QUOTA_LIST:
      if (value == null) {
        unsetPendingQuotaList();
      } else {
        setPendingQuotaList((List<PartitionQuotaInfo>)value);
      }
      break;

    case TALOS_ADMIN:
      if (value == null) {
        unsetTalosAdmin();
      } else {
        setTalosAdmin((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PENDING_QUOTA_LIST:
      return getPendingQuotaList();

    case TALOS_ADMIN:
      return Boolean.valueOf(isTalosAdmin());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PENDING_QUOTA_LIST:
      return isSetPendingQuotaList();
    case TALOS_ADMIN:
      return isSetTalosAdmin();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RevokeQuotaResponse)
      return this.equals((RevokeQuotaResponse)that);
    return false;
  }

  public boolean equals(RevokeQuotaResponse that) {
    if (that == null)
      return false;

    boolean this_present_pendingQuotaList = true && this.isSetPendingQuotaList();
    boolean that_present_pendingQuotaList = true && that.isSetPendingQuotaList();
    if (this_present_pendingQuotaList || that_present_pendingQuotaList) {
      if (!(this_present_pendingQuotaList && that_present_pendingQuotaList))
        return false;
      if (!this.pendingQuotaList.equals(that.pendingQuotaList))
        return false;
    }

    boolean this_present_talosAdmin = true;
    boolean that_present_talosAdmin = true;
    if (this_present_talosAdmin || that_present_talosAdmin) {
      if (!(this_present_talosAdmin && that_present_talosAdmin))
        return false;
      if (this.talosAdmin != that.talosAdmin)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_pendingQuotaList = true && (isSetPendingQuotaList());
    list.add(present_pendingQuotaList);
    if (present_pendingQuotaList)
      list.add(pendingQuotaList);

    boolean present_talosAdmin = true;
    list.add(present_talosAdmin);
    if (present_talosAdmin)
      list.add(talosAdmin);

    return list.hashCode();
  }

  @Override
  public int compareTo(RevokeQuotaResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPendingQuotaList()).compareTo(other.isSetPendingQuotaList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPendingQuotaList()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.pendingQuotaList, other.pendingQuotaList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTalosAdmin()).compareTo(other.isSetTalosAdmin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTalosAdmin()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.talosAdmin, other.talosAdmin);
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
    StringBuilder sb = new StringBuilder("RevokeQuotaResponse(");
    boolean first = true;

    sb.append("pendingQuotaList:");
    if (this.pendingQuotaList == null) {
      sb.append("null");
    } else {
      sb.append(this.pendingQuotaList);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("talosAdmin:");
    sb.append(this.talosAdmin);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (pendingQuotaList == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'pendingQuotaList' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'talosAdmin' because it's a primitive and you chose the non-beans generator.
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

  private static class RevokeQuotaResponseStandardSchemeFactory implements SchemeFactory {
    public RevokeQuotaResponseStandardScheme getScheme() {
      return new RevokeQuotaResponseStandardScheme();
    }
  }

  private static class RevokeQuotaResponseStandardScheme extends StandardScheme<RevokeQuotaResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, RevokeQuotaResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PENDING_QUOTA_LIST
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list34 = iprot.readListBegin();
                struct.pendingQuotaList = new ArrayList<PartitionQuotaInfo>(_list34.size);
                PartitionQuotaInfo _elem35;
                for (int _i36 = 0; _i36 < _list34.size; ++_i36)
                {
                  _elem35 = new PartitionQuotaInfo();
                  _elem35.read(iprot);
                  struct.pendingQuotaList.add(_elem35);
                }
                iprot.readListEnd();
              }
              struct.setPendingQuotaListIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TALOS_ADMIN
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.talosAdmin = iprot.readBool();
              struct.setTalosAdminIsSet(true);
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
      if (!struct.isSetTalosAdmin()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'talosAdmin' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, RevokeQuotaResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.pendingQuotaList != null) {
        oprot.writeFieldBegin(PENDING_QUOTA_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.pendingQuotaList.size()));
          for (PartitionQuotaInfo _iter37 : struct.pendingQuotaList)
          {
            _iter37.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TALOS_ADMIN_FIELD_DESC);
      oprot.writeBool(struct.talosAdmin);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RevokeQuotaResponseTupleSchemeFactory implements SchemeFactory {
    public RevokeQuotaResponseTupleScheme getScheme() {
      return new RevokeQuotaResponseTupleScheme();
    }
  }

  private static class RevokeQuotaResponseTupleScheme extends TupleScheme<RevokeQuotaResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, RevokeQuotaResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.pendingQuotaList.size());
        for (PartitionQuotaInfo _iter38 : struct.pendingQuotaList)
        {
          _iter38.write(oprot);
        }
      }
      oprot.writeBool(struct.talosAdmin);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, RevokeQuotaResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        libthrift091.protocol.TList _list39 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
        struct.pendingQuotaList = new ArrayList<PartitionQuotaInfo>(_list39.size);
        PartitionQuotaInfo _elem40;
        for (int _i41 = 0; _i41 < _list39.size; ++_i41)
        {
          _elem40 = new PartitionQuotaInfo();
          _elem40.read(iprot);
          struct.pendingQuotaList.add(_elem40);
        }
      }
      struct.setPendingQuotaListIsSet(true);
      struct.talosAdmin = iprot.readBool();
      struct.setTalosAdminIsSet(true);
    }
  }

}

