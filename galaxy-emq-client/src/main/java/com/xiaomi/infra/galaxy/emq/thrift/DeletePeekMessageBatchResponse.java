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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-9-13")
public class DeletePeekMessageBatchResponse implements libthrift091.TBase<DeletePeekMessageBatchResponse, DeletePeekMessageBatchResponse._Fields>, java.io.Serializable, Cloneable, Comparable<DeletePeekMessageBatchResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("DeletePeekMessageBatchResponse");

  private static final libthrift091.protocol.TField SUCCESSFUL_FIELD_DESC = new libthrift091.protocol.TField("successful", libthrift091.protocol.TType.LIST, (short)1);
  private static final libthrift091.protocol.TField FAILED_FIELD_DESC = new libthrift091.protocol.TField("failed", libthrift091.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DeletePeekMessageBatchResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DeletePeekMessageBatchResponseTupleSchemeFactory());
  }

  /**
   * The successful receipt handle;
   * 
   */
  public List<String> successful; // required
  /**
   * Failed results list;
   * Using receipt handle to index
   * 
   */
  public List<MessageBatchErrorEntry> failed; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The successful receipt handle;
     * 
     */
    SUCCESSFUL((short)1, "successful"),
    /**
     * Failed results list;
     * Using receipt handle to index
     * 
     */
    FAILED((short)2, "failed");

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
        case 1: // SUCCESSFUL
          return SUCCESSFUL;
        case 2: // FAILED
          return FAILED;
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
    tmpMap.put(_Fields.SUCCESSFUL, new libthrift091.meta_data.FieldMetaData("successful", libthrift091.TFieldRequirementType.DEFAULT, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING))));
    tmpMap.put(_Fields.FAILED, new libthrift091.meta_data.FieldMetaData("failed", libthrift091.TFieldRequirementType.DEFAULT, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, MessageBatchErrorEntry.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(DeletePeekMessageBatchResponse.class, metaDataMap);
  }

  public DeletePeekMessageBatchResponse() {
  }

  public DeletePeekMessageBatchResponse(
    List<String> successful,
    List<MessageBatchErrorEntry> failed)
  {
    this();
    this.successful = successful;
    this.failed = failed;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DeletePeekMessageBatchResponse(DeletePeekMessageBatchResponse other) {
    if (other.isSetSuccessful()) {
      List<String> __this__successful = new ArrayList<String>(other.successful);
      this.successful = __this__successful;
    }
    if (other.isSetFailed()) {
      List<MessageBatchErrorEntry> __this__failed = new ArrayList<MessageBatchErrorEntry>(other.failed.size());
      for (MessageBatchErrorEntry other_element : other.failed) {
        __this__failed.add(new MessageBatchErrorEntry(other_element));
      }
      this.failed = __this__failed;
    }
  }

  public DeletePeekMessageBatchResponse deepCopy() {
    return new DeletePeekMessageBatchResponse(this);
  }

  @Override
  public void clear() {
    this.successful = null;
    this.failed = null;
  }

  public int getSuccessfulSize() {
    return (this.successful == null) ? 0 : this.successful.size();
  }

  public java.util.Iterator<String> getSuccessfulIterator() {
    return (this.successful == null) ? null : this.successful.iterator();
  }

  public void addToSuccessful(String elem) {
    if (this.successful == null) {
      this.successful = new ArrayList<String>();
    }
    this.successful.add(elem);
  }

  /**
   * The successful receipt handle;
   * 
   */
  public List<String> getSuccessful() {
    return this.successful;
  }

  /**
   * The successful receipt handle;
   * 
   */
  public DeletePeekMessageBatchResponse setSuccessful(List<String> successful) {
    this.successful = successful;
    return this;
  }

  public void unsetSuccessful() {
    this.successful = null;
  }

  /** Returns true if field successful is set (has been assigned a value) and false otherwise */
  public boolean isSetSuccessful() {
    return this.successful != null;
  }

  public void setSuccessfulIsSet(boolean value) {
    if (!value) {
      this.successful = null;
    }
  }

  public int getFailedSize() {
    return (this.failed == null) ? 0 : this.failed.size();
  }

  public java.util.Iterator<MessageBatchErrorEntry> getFailedIterator() {
    return (this.failed == null) ? null : this.failed.iterator();
  }

  public void addToFailed(MessageBatchErrorEntry elem) {
    if (this.failed == null) {
      this.failed = new ArrayList<MessageBatchErrorEntry>();
    }
    this.failed.add(elem);
  }

  /**
   * Failed results list;
   * Using receipt handle to index
   * 
   */
  public List<MessageBatchErrorEntry> getFailed() {
    return this.failed;
  }

  /**
   * Failed results list;
   * Using receipt handle to index
   * 
   */
  public DeletePeekMessageBatchResponse setFailed(List<MessageBatchErrorEntry> failed) {
    this.failed = failed;
    return this;
  }

  public void unsetFailed() {
    this.failed = null;
  }

  /** Returns true if field failed is set (has been assigned a value) and false otherwise */
  public boolean isSetFailed() {
    return this.failed != null;
  }

  public void setFailedIsSet(boolean value) {
    if (!value) {
      this.failed = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SUCCESSFUL:
      if (value == null) {
        unsetSuccessful();
      } else {
        setSuccessful((List<String>)value);
      }
      break;

    case FAILED:
      if (value == null) {
        unsetFailed();
      } else {
        setFailed((List<MessageBatchErrorEntry>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SUCCESSFUL:
      return getSuccessful();

    case FAILED:
      return getFailed();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SUCCESSFUL:
      return isSetSuccessful();
    case FAILED:
      return isSetFailed();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DeletePeekMessageBatchResponse)
      return this.equals((DeletePeekMessageBatchResponse)that);
    return false;
  }

  public boolean equals(DeletePeekMessageBatchResponse that) {
    if (that == null)
      return false;

    boolean this_present_successful = true && this.isSetSuccessful();
    boolean that_present_successful = true && that.isSetSuccessful();
    if (this_present_successful || that_present_successful) {
      if (!(this_present_successful && that_present_successful))
        return false;
      if (!this.successful.equals(that.successful))
        return false;
    }

    boolean this_present_failed = true && this.isSetFailed();
    boolean that_present_failed = true && that.isSetFailed();
    if (this_present_failed || that_present_failed) {
      if (!(this_present_failed && that_present_failed))
        return false;
      if (!this.failed.equals(that.failed))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_successful = true && (isSetSuccessful());
    list.add(present_successful);
    if (present_successful)
      list.add(successful);

    boolean present_failed = true && (isSetFailed());
    list.add(present_failed);
    if (present_failed)
      list.add(failed);

    return list.hashCode();
  }

  @Override
  public int compareTo(DeletePeekMessageBatchResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSuccessful()).compareTo(other.isSetSuccessful());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSuccessful()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.successful, other.successful);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFailed()).compareTo(other.isSetFailed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFailed()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.failed, other.failed);
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
    StringBuilder sb = new StringBuilder("DeletePeekMessageBatchResponse(");
    boolean first = true;

    sb.append("successful:");
    if (this.successful == null) {
      sb.append("null");
    } else {
      sb.append(this.successful);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("failed:");
    if (this.failed == null) {
      sb.append("null");
    } else {
      sb.append(this.failed);
    }
    first = false;
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

  private static class DeletePeekMessageBatchResponseStandardSchemeFactory implements SchemeFactory {
    public DeletePeekMessageBatchResponseStandardScheme getScheme() {
      return new DeletePeekMessageBatchResponseStandardScheme();
    }
  }

  private static class DeletePeekMessageBatchResponseStandardScheme extends StandardScheme<DeletePeekMessageBatchResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, DeletePeekMessageBatchResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SUCCESSFUL
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list164 = iprot.readListBegin();
                struct.successful = new ArrayList<String>(_list164.size);
                String _elem165;
                for (int _i166 = 0; _i166 < _list164.size; ++_i166)
                {
                  _elem165 = iprot.readString();
                  struct.successful.add(_elem165);
                }
                iprot.readListEnd();
              }
              struct.setSuccessfulIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FAILED
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list167 = iprot.readListBegin();
                struct.failed = new ArrayList<MessageBatchErrorEntry>(_list167.size);
                MessageBatchErrorEntry _elem168;
                for (int _i169 = 0; _i169 < _list167.size; ++_i169)
                {
                  _elem168 = new MessageBatchErrorEntry();
                  _elem168.read(iprot);
                  struct.failed.add(_elem168);
                }
                iprot.readListEnd();
              }
              struct.setFailedIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, DeletePeekMessageBatchResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.successful != null) {
        oprot.writeFieldBegin(SUCCESSFUL_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRING, struct.successful.size()));
          for (String _iter170 : struct.successful)
          {
            oprot.writeString(_iter170);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.failed != null) {
        oprot.writeFieldBegin(FAILED_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.failed.size()));
          for (MessageBatchErrorEntry _iter171 : struct.failed)
          {
            _iter171.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DeletePeekMessageBatchResponseTupleSchemeFactory implements SchemeFactory {
    public DeletePeekMessageBatchResponseTupleScheme getScheme() {
      return new DeletePeekMessageBatchResponseTupleScheme();
    }
  }

  private static class DeletePeekMessageBatchResponseTupleScheme extends TupleScheme<DeletePeekMessageBatchResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, DeletePeekMessageBatchResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSuccessful()) {
        optionals.set(0);
      }
      if (struct.isSetFailed()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSuccessful()) {
        {
          oprot.writeI32(struct.successful.size());
          for (String _iter172 : struct.successful)
          {
            oprot.writeString(_iter172);
          }
        }
      }
      if (struct.isSetFailed()) {
        {
          oprot.writeI32(struct.failed.size());
          for (MessageBatchErrorEntry _iter173 : struct.failed)
          {
            _iter173.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, DeletePeekMessageBatchResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TList _list174 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRING, iprot.readI32());
          struct.successful = new ArrayList<String>(_list174.size);
          String _elem175;
          for (int _i176 = 0; _i176 < _list174.size; ++_i176)
          {
            _elem175 = iprot.readString();
            struct.successful.add(_elem175);
          }
        }
        struct.setSuccessfulIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TList _list177 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.failed = new ArrayList<MessageBatchErrorEntry>(_list177.size);
          MessageBatchErrorEntry _elem178;
          for (int _i179 = 0; _i179 < _list177.size; ++_i179)
          {
            _elem178 = new MessageBatchErrorEntry();
            _elem178.read(iprot);
            struct.failed.add(_elem178);
          }
        }
        struct.setFailedIsSet(true);
      }
    }
  }

}

