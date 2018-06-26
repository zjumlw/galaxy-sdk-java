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
 * 表配置信息
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2018-6-26")
public class TableSpec implements libthrift091.TBase<TableSpec, TableSpec._Fields>, java.io.Serializable, Cloneable, Comparable<TableSpec> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("TableSpec");

  private static final libthrift091.protocol.TField SCHEMA_FIELD_DESC = new libthrift091.protocol.TField("schema", libthrift091.protocol.TType.STRUCT, (short)1);
  private static final libthrift091.protocol.TField METADATA_FIELD_DESC = new libthrift091.protocol.TField("metadata", libthrift091.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TableSpecStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TableSpecTupleSchemeFactory());
  }

  public TableSchema schema; // optional
  public TableMetadata metadata; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    SCHEMA((short)1, "schema"),
    METADATA((short)2, "metadata");

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
        case 1: // SCHEMA
          return SCHEMA;
        case 2: // METADATA
          return METADATA;
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
  private static final _Fields optionals[] = {_Fields.SCHEMA,_Fields.METADATA};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SCHEMA, new libthrift091.meta_data.FieldMetaData("schema", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, TableSchema.class)));
    tmpMap.put(_Fields.METADATA, new libthrift091.meta_data.FieldMetaData("metadata", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, TableMetadata.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(TableSpec.class, metaDataMap);
  }

  public TableSpec() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TableSpec(TableSpec other) {
    if (other.isSetSchema()) {
      this.schema = new TableSchema(other.schema);
    }
    if (other.isSetMetadata()) {
      this.metadata = new TableMetadata(other.metadata);
    }
  }

  public TableSpec deepCopy() {
    return new TableSpec(this);
  }

  @Override
  public void clear() {
    this.schema = null;
    this.metadata = null;
  }

  public TableSchema getSchema() {
    return this.schema;
  }

  public TableSpec setSchema(TableSchema schema) {
    this.schema = schema;
    return this;
  }

  public void unsetSchema() {
    this.schema = null;
  }

  /** Returns true if field schema is set (has been assigned a value) and false otherwise */
  public boolean isSetSchema() {
    return this.schema != null;
  }

  public void setSchemaIsSet(boolean value) {
    if (!value) {
      this.schema = null;
    }
  }

  public TableMetadata getMetadata() {
    return this.metadata;
  }

  public TableSpec setMetadata(TableMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  public void unsetMetadata() {
    this.metadata = null;
  }

  /** Returns true if field metadata is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadata() {
    return this.metadata != null;
  }

  public void setMetadataIsSet(boolean value) {
    if (!value) {
      this.metadata = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SCHEMA:
      if (value == null) {
        unsetSchema();
      } else {
        setSchema((TableSchema)value);
      }
      break;

    case METADATA:
      if (value == null) {
        unsetMetadata();
      } else {
        setMetadata((TableMetadata)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SCHEMA:
      return getSchema();

    case METADATA:
      return getMetadata();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SCHEMA:
      return isSetSchema();
    case METADATA:
      return isSetMetadata();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TableSpec)
      return this.equals((TableSpec)that);
    return false;
  }

  public boolean equals(TableSpec that) {
    if (that == null)
      return false;

    boolean this_present_schema = true && this.isSetSchema();
    boolean that_present_schema = true && that.isSetSchema();
    if (this_present_schema || that_present_schema) {
      if (!(this_present_schema && that_present_schema))
        return false;
      if (!this.schema.equals(that.schema))
        return false;
    }

    boolean this_present_metadata = true && this.isSetMetadata();
    boolean that_present_metadata = true && that.isSetMetadata();
    if (this_present_metadata || that_present_metadata) {
      if (!(this_present_metadata && that_present_metadata))
        return false;
      if (!this.metadata.equals(that.metadata))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_schema = true && (isSetSchema());
    list.add(present_schema);
    if (present_schema)
      list.add(schema);

    boolean present_metadata = true && (isSetMetadata());
    list.add(present_metadata);
    if (present_metadata)
      list.add(metadata);

    return list.hashCode();
  }

  @Override
  public int compareTo(TableSpec other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSchema()).compareTo(other.isSetSchema());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSchema()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.schema, other.schema);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMetadata()).compareTo(other.isSetMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadata()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.metadata, other.metadata);
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
    StringBuilder sb = new StringBuilder("TableSpec(");
    boolean first = true;

    if (isSetSchema()) {
      sb.append("schema:");
      if (this.schema == null) {
        sb.append("null");
      } else {
        sb.append(this.schema);
      }
      first = false;
    }
    if (isSetMetadata()) {
      if (!first) sb.append(", ");
      sb.append("metadata:");
      if (this.metadata == null) {
        sb.append("null");
      } else {
        sb.append(this.metadata);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
    if (schema != null) {
      schema.validate();
    }
    if (metadata != null) {
      metadata.validate();
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

  private static class TableSpecStandardSchemeFactory implements SchemeFactory {
    public TableSpecStandardScheme getScheme() {
      return new TableSpecStandardScheme();
    }
  }

  private static class TableSpecStandardScheme extends StandardScheme<TableSpec> {

    public void read(libthrift091.protocol.TProtocol iprot, TableSpec struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SCHEMA
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.schema = new TableSchema();
              struct.schema.read(iprot);
              struct.setSchemaIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // METADATA
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.metadata = new TableMetadata();
              struct.metadata.read(iprot);
              struct.setMetadataIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, TableSpec struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.schema != null) {
        if (struct.isSetSchema()) {
          oprot.writeFieldBegin(SCHEMA_FIELD_DESC);
          struct.schema.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.metadata != null) {
        if (struct.isSetMetadata()) {
          oprot.writeFieldBegin(METADATA_FIELD_DESC);
          struct.metadata.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TableSpecTupleSchemeFactory implements SchemeFactory {
    public TableSpecTupleScheme getScheme() {
      return new TableSpecTupleScheme();
    }
  }

  private static class TableSpecTupleScheme extends TupleScheme<TableSpec> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, TableSpec struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSchema()) {
        optionals.set(0);
      }
      if (struct.isSetMetadata()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSchema()) {
        struct.schema.write(oprot);
      }
      if (struct.isSetMetadata()) {
        struct.metadata.write(oprot);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, TableSpec struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.schema = new TableSchema();
        struct.schema.read(iprot);
        struct.setSchemaIsSet(true);
      }
      if (incoming.get(1)) {
        struct.metadata = new TableMetadata();
        struct.metadata.read(iprot);
        struct.setMetadataIsSet(true);
      }
    }
  }

}

