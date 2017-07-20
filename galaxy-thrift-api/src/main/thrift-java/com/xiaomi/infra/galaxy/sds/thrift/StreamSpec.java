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
 * stream specification
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-7-20")
public class StreamSpec implements libthrift091.TBase<StreamSpec, StreamSpec._Fields>, java.io.Serializable, Cloneable, Comparable<StreamSpec> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("StreamSpec");

  private static final libthrift091.protocol.TField ENABLE_STREAM_FIELD_DESC = new libthrift091.protocol.TField("enableStream", libthrift091.protocol.TType.BOOL, (short)1);
  private static final libthrift091.protocol.TField VIEW_TYPE_FIELD_DESC = new libthrift091.protocol.TField("viewType", libthrift091.protocol.TType.I32, (short)2);
  private static final libthrift091.protocol.TField ATTRIBUTES_FIELD_DESC = new libthrift091.protocol.TField("attributes", libthrift091.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StreamSpecStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StreamSpecTupleSchemeFactory());
  }

  /**
   * stream is enabled or not
   */
  public boolean enableStream; // optional
  /**
   * view type
   * 
   * @see StreamViewType
   */
  public StreamViewType viewType; // optional
  /**
   * attribute list
   */
  public List<String> attributes; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * stream is enabled or not
     */
    ENABLE_STREAM((short)1, "enableStream"),
    /**
     * view type
     * 
     * @see StreamViewType
     */
    VIEW_TYPE((short)2, "viewType"),
    /**
     * attribute list
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
        case 1: // ENABLE_STREAM
          return ENABLE_STREAM;
        case 2: // VIEW_TYPE
          return VIEW_TYPE;
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
  private static final int __ENABLESTREAM_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ENABLE_STREAM,_Fields.VIEW_TYPE,_Fields.ATTRIBUTES};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ENABLE_STREAM, new libthrift091.meta_data.FieldMetaData("enableStream", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    tmpMap.put(_Fields.VIEW_TYPE, new libthrift091.meta_data.FieldMetaData("viewType", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, StreamViewType.class)));
    tmpMap.put(_Fields.ATTRIBUTES, new libthrift091.meta_data.FieldMetaData("attributes", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(StreamSpec.class, metaDataMap);
  }

  public StreamSpec() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StreamSpec(StreamSpec other) {
    __isset_bitfield = other.__isset_bitfield;
    this.enableStream = other.enableStream;
    if (other.isSetViewType()) {
      this.viewType = other.viewType;
    }
    if (other.isSetAttributes()) {
      List<String> __this__attributes = new ArrayList<String>(other.attributes);
      this.attributes = __this__attributes;
    }
  }

  public StreamSpec deepCopy() {
    return new StreamSpec(this);
  }

  @Override
  public void clear() {
    setEnableStreamIsSet(false);
    this.enableStream = false;
    this.viewType = null;
    this.attributes = null;
  }

  /**
   * stream is enabled or not
   */
  public boolean isEnableStream() {
    return this.enableStream;
  }

  /**
   * stream is enabled or not
   */
  public StreamSpec setEnableStream(boolean enableStream) {
    this.enableStream = enableStream;
    setEnableStreamIsSet(true);
    return this;
  }

  public void unsetEnableStream() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ENABLESTREAM_ISSET_ID);
  }

  /** Returns true if field enableStream is set (has been assigned a value) and false otherwise */
  public boolean isSetEnableStream() {
    return EncodingUtils.testBit(__isset_bitfield, __ENABLESTREAM_ISSET_ID);
  }

  public void setEnableStreamIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ENABLESTREAM_ISSET_ID, value);
  }

  /**
   * view type
   * 
   * @see StreamViewType
   */
  public StreamViewType getViewType() {
    return this.viewType;
  }

  /**
   * view type
   * 
   * @see StreamViewType
   */
  public StreamSpec setViewType(StreamViewType viewType) {
    this.viewType = viewType;
    return this;
  }

  public void unsetViewType() {
    this.viewType = null;
  }

  /** Returns true if field viewType is set (has been assigned a value) and false otherwise */
  public boolean isSetViewType() {
    return this.viewType != null;
  }

  public void setViewTypeIsSet(boolean value) {
    if (!value) {
      this.viewType = null;
    }
  }

  public int getAttributesSize() {
    return (this.attributes == null) ? 0 : this.attributes.size();
  }

  public java.util.Iterator<String> getAttributesIterator() {
    return (this.attributes == null) ? null : this.attributes.iterator();
  }

  public void addToAttributes(String elem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<String>();
    }
    this.attributes.add(elem);
  }

  /**
   * attribute list
   */
  public List<String> getAttributes() {
    return this.attributes;
  }

  /**
   * attribute list
   */
  public StreamSpec setAttributes(List<String> attributes) {
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
    case ENABLE_STREAM:
      if (value == null) {
        unsetEnableStream();
      } else {
        setEnableStream((Boolean)value);
      }
      break;

    case VIEW_TYPE:
      if (value == null) {
        unsetViewType();
      } else {
        setViewType((StreamViewType)value);
      }
      break;

    case ATTRIBUTES:
      if (value == null) {
        unsetAttributes();
      } else {
        setAttributes((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ENABLE_STREAM:
      return Boolean.valueOf(isEnableStream());

    case VIEW_TYPE:
      return getViewType();

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
    case ENABLE_STREAM:
      return isSetEnableStream();
    case VIEW_TYPE:
      return isSetViewType();
    case ATTRIBUTES:
      return isSetAttributes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StreamSpec)
      return this.equals((StreamSpec)that);
    return false;
  }

  public boolean equals(StreamSpec that) {
    if (that == null)
      return false;

    boolean this_present_enableStream = true && this.isSetEnableStream();
    boolean that_present_enableStream = true && that.isSetEnableStream();
    if (this_present_enableStream || that_present_enableStream) {
      if (!(this_present_enableStream && that_present_enableStream))
        return false;
      if (this.enableStream != that.enableStream)
        return false;
    }

    boolean this_present_viewType = true && this.isSetViewType();
    boolean that_present_viewType = true && that.isSetViewType();
    if (this_present_viewType || that_present_viewType) {
      if (!(this_present_viewType && that_present_viewType))
        return false;
      if (!this.viewType.equals(that.viewType))
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
    List<Object> list = new ArrayList<Object>();

    boolean present_enableStream = true && (isSetEnableStream());
    list.add(present_enableStream);
    if (present_enableStream)
      list.add(enableStream);

    boolean present_viewType = true && (isSetViewType());
    list.add(present_viewType);
    if (present_viewType)
      list.add(viewType.getValue());

    boolean present_attributes = true && (isSetAttributes());
    list.add(present_attributes);
    if (present_attributes)
      list.add(attributes);

    return list.hashCode();
  }

  @Override
  public int compareTo(StreamSpec other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEnableStream()).compareTo(other.isSetEnableStream());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEnableStream()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.enableStream, other.enableStream);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetViewType()).compareTo(other.isSetViewType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetViewType()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.viewType, other.viewType);
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
    StringBuilder sb = new StringBuilder("StreamSpec(");
    boolean first = true;

    if (isSetEnableStream()) {
      sb.append("enableStream:");
      sb.append(this.enableStream);
      first = false;
    }
    if (isSetViewType()) {
      if (!first) sb.append(", ");
      sb.append("viewType:");
      if (this.viewType == null) {
        sb.append("null");
      } else {
        sb.append(this.viewType);
      }
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

  private static class StreamSpecStandardSchemeFactory implements SchemeFactory {
    public StreamSpecStandardScheme getScheme() {
      return new StreamSpecStandardScheme();
    }
  }

  private static class StreamSpecStandardScheme extends StandardScheme<StreamSpec> {

    public void read(libthrift091.protocol.TProtocol iprot, StreamSpec struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ENABLE_STREAM
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.enableStream = iprot.readBool();
              struct.setEnableStreamIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VIEW_TYPE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.viewType = com.xiaomi.infra.galaxy.sds.thrift.StreamViewType.findByValue(iprot.readI32());
              struct.setViewTypeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ATTRIBUTES
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list104 = iprot.readListBegin();
                struct.attributes = new ArrayList<String>(_list104.size);
                String _elem105;
                for (int _i106 = 0; _i106 < _list104.size; ++_i106)
                {
                  _elem105 = iprot.readString();
                  struct.attributes.add(_elem105);
                }
                iprot.readListEnd();
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

    public void write(libthrift091.protocol.TProtocol oprot, StreamSpec struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetEnableStream()) {
        oprot.writeFieldBegin(ENABLE_STREAM_FIELD_DESC);
        oprot.writeBool(struct.enableStream);
        oprot.writeFieldEnd();
      }
      if (struct.viewType != null) {
        if (struct.isSetViewType()) {
          oprot.writeFieldBegin(VIEW_TYPE_FIELD_DESC);
          oprot.writeI32(struct.viewType.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.attributes != null) {
        if (struct.isSetAttributes()) {
          oprot.writeFieldBegin(ATTRIBUTES_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRING, struct.attributes.size()));
            for (String _iter107 : struct.attributes)
            {
              oprot.writeString(_iter107);
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

  private static class StreamSpecTupleSchemeFactory implements SchemeFactory {
    public StreamSpecTupleScheme getScheme() {
      return new StreamSpecTupleScheme();
    }
  }

  private static class StreamSpecTupleScheme extends TupleScheme<StreamSpec> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, StreamSpec struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetEnableStream()) {
        optionals.set(0);
      }
      if (struct.isSetViewType()) {
        optionals.set(1);
      }
      if (struct.isSetAttributes()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetEnableStream()) {
        oprot.writeBool(struct.enableStream);
      }
      if (struct.isSetViewType()) {
        oprot.writeI32(struct.viewType.getValue());
      }
      if (struct.isSetAttributes()) {
        {
          oprot.writeI32(struct.attributes.size());
          for (String _iter108 : struct.attributes)
          {
            oprot.writeString(_iter108);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, StreamSpec struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.enableStream = iprot.readBool();
        struct.setEnableStreamIsSet(true);
      }
      if (incoming.get(1)) {
        struct.viewType = com.xiaomi.infra.galaxy.sds.thrift.StreamViewType.findByValue(iprot.readI32());
        struct.setViewTypeIsSet(true);
      }
      if (incoming.get(2)) {
        {
          libthrift091.protocol.TList _list109 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRING, iprot.readI32());
          struct.attributes = new ArrayList<String>(_list109.size);
          String _elem110;
          for (int _i111 = 0; _i111 < _list109.size; ++_i111)
          {
            _elem110 = iprot.readString();
            struct.attributes.add(_elem110);
          }
        }
        struct.setAttributesIsSet(true);
      }
    }
  }

}

