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
 * 统计指标查询请求
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-7-20")
public class MetricQueryRequest implements libthrift091.TBase<MetricQueryRequest, MetricQueryRequest._Fields>, java.io.Serializable, Cloneable, Comparable<MetricQueryRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("MetricQueryRequest");

  private static final libthrift091.protocol.TField TABLE_NAME_FIELD_DESC = new libthrift091.protocol.TField("tableName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField START_TIME_FIELD_DESC = new libthrift091.protocol.TField("startTime", libthrift091.protocol.TType.I64, (short)2);
  private static final libthrift091.protocol.TField STOP_TIME_FIELD_DESC = new libthrift091.protocol.TField("stopTime", libthrift091.protocol.TType.I64, (short)3);
  private static final libthrift091.protocol.TField METRIC_KEY_FIELD_DESC = new libthrift091.protocol.TField("metricKey", libthrift091.protocol.TType.I32, (short)4);
  private static final libthrift091.protocol.TField METRIC_TYPE_FIELD_DESC = new libthrift091.protocol.TField("metricType", libthrift091.protocol.TType.I32, (short)5);
  private static final libthrift091.protocol.TField DOWNSAMPLE_INTERVAL_FIELD_DESC = new libthrift091.protocol.TField("downsampleInterval", libthrift091.protocol.TType.I32, (short)6);
  private static final libthrift091.protocol.TField DOWNSAMPLE_TIME_UNIT_FIELD_DESC = new libthrift091.protocol.TField("downsampleTimeUnit", libthrift091.protocol.TType.I32, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MetricQueryRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MetricQueryRequestTupleSchemeFactory());
  }

  /**
   * 需要查询的表名
   */
  public String tableName; // optional
  /**
   * 起始时间，值为1970/0/0开始的秒数
   */
  public long startTime; // optional
  /**
   * 结束时间，值为1970/0/0开始的秒数
   */
  public long stopTime; // optional
  /**
   * 统计指标主类型
   * 
   * @see MetricKey
   */
  public MetricKey metricKey; // optional
  /**
   * 统计指标子类型
   * 
   * @see MetricType
   */
  public MetricType metricType; // optional
  /**
   * 下采样时间间隔, 0或者负数表示读取原始数据不进行下采样
   */
  public int downsampleInterval; // optional
  /**
   * 下采样时间间隔单位
   * 
   * @see TimeSpanUnit
   */
  public TimeSpanUnit downsampleTimeUnit; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 需要查询的表名
     */
    TABLE_NAME((short)1, "tableName"),
    /**
     * 起始时间，值为1970/0/0开始的秒数
     */
    START_TIME((short)2, "startTime"),
    /**
     * 结束时间，值为1970/0/0开始的秒数
     */
    STOP_TIME((short)3, "stopTime"),
    /**
     * 统计指标主类型
     * 
     * @see MetricKey
     */
    METRIC_KEY((short)4, "metricKey"),
    /**
     * 统计指标子类型
     * 
     * @see MetricType
     */
    METRIC_TYPE((short)5, "metricType"),
    /**
     * 下采样时间间隔, 0或者负数表示读取原始数据不进行下采样
     */
    DOWNSAMPLE_INTERVAL((short)6, "downsampleInterval"),
    /**
     * 下采样时间间隔单位
     * 
     * @see TimeSpanUnit
     */
    DOWNSAMPLE_TIME_UNIT((short)7, "downsampleTimeUnit");

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
        case 1: // TABLE_NAME
          return TABLE_NAME;
        case 2: // START_TIME
          return START_TIME;
        case 3: // STOP_TIME
          return STOP_TIME;
        case 4: // METRIC_KEY
          return METRIC_KEY;
        case 5: // METRIC_TYPE
          return METRIC_TYPE;
        case 6: // DOWNSAMPLE_INTERVAL
          return DOWNSAMPLE_INTERVAL;
        case 7: // DOWNSAMPLE_TIME_UNIT
          return DOWNSAMPLE_TIME_UNIT;
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
  private static final int __STARTTIME_ISSET_ID = 0;
  private static final int __STOPTIME_ISSET_ID = 1;
  private static final int __DOWNSAMPLEINTERVAL_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TABLE_NAME,_Fields.START_TIME,_Fields.STOP_TIME,_Fields.METRIC_KEY,_Fields.METRIC_TYPE,_Fields.DOWNSAMPLE_INTERVAL,_Fields.DOWNSAMPLE_TIME_UNIT};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_NAME, new libthrift091.meta_data.FieldMetaData("tableName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.START_TIME, new libthrift091.meta_data.FieldMetaData("startTime", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.STOP_TIME, new libthrift091.meta_data.FieldMetaData("stopTime", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.METRIC_KEY, new libthrift091.meta_data.FieldMetaData("metricKey", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, MetricKey.class)));
    tmpMap.put(_Fields.METRIC_TYPE, new libthrift091.meta_data.FieldMetaData("metricType", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, MetricType.class)));
    tmpMap.put(_Fields.DOWNSAMPLE_INTERVAL, new libthrift091.meta_data.FieldMetaData("downsampleInterval", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.DOWNSAMPLE_TIME_UNIT, new libthrift091.meta_data.FieldMetaData("downsampleTimeUnit", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, TimeSpanUnit.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(MetricQueryRequest.class, metaDataMap);
  }

  public MetricQueryRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MetricQueryRequest(MetricQueryRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
    this.startTime = other.startTime;
    this.stopTime = other.stopTime;
    if (other.isSetMetricKey()) {
      this.metricKey = other.metricKey;
    }
    if (other.isSetMetricType()) {
      this.metricType = other.metricType;
    }
    this.downsampleInterval = other.downsampleInterval;
    if (other.isSetDownsampleTimeUnit()) {
      this.downsampleTimeUnit = other.downsampleTimeUnit;
    }
  }

  public MetricQueryRequest deepCopy() {
    return new MetricQueryRequest(this);
  }

  @Override
  public void clear() {
    this.tableName = null;
    setStartTimeIsSet(false);
    this.startTime = 0;
    setStopTimeIsSet(false);
    this.stopTime = 0;
    this.metricKey = null;
    this.metricType = null;
    setDownsampleIntervalIsSet(false);
    this.downsampleInterval = 0;
    this.downsampleTimeUnit = null;
  }

  /**
   * 需要查询的表名
   */
  public String getTableName() {
    return this.tableName;
  }

  /**
   * 需要查询的表名
   */
  public MetricQueryRequest setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public void unsetTableName() {
    this.tableName = null;
  }

  /** Returns true if field tableName is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.tableName != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.tableName = null;
    }
  }

  /**
   * 起始时间，值为1970/0/0开始的秒数
   */
  public long getStartTime() {
    return this.startTime;
  }

  /**
   * 起始时间，值为1970/0/0开始的秒数
   */
  public MetricQueryRequest setStartTime(long startTime) {
    this.startTime = startTime;
    setStartTimeIsSet(true);
    return this;
  }

  public void unsetStartTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STARTTIME_ISSET_ID);
  }

  /** Returns true if field startTime is set (has been assigned a value) and false otherwise */
  public boolean isSetStartTime() {
    return EncodingUtils.testBit(__isset_bitfield, __STARTTIME_ISSET_ID);
  }

  public void setStartTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STARTTIME_ISSET_ID, value);
  }

  /**
   * 结束时间，值为1970/0/0开始的秒数
   */
  public long getStopTime() {
    return this.stopTime;
  }

  /**
   * 结束时间，值为1970/0/0开始的秒数
   */
  public MetricQueryRequest setStopTime(long stopTime) {
    this.stopTime = stopTime;
    setStopTimeIsSet(true);
    return this;
  }

  public void unsetStopTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STOPTIME_ISSET_ID);
  }

  /** Returns true if field stopTime is set (has been assigned a value) and false otherwise */
  public boolean isSetStopTime() {
    return EncodingUtils.testBit(__isset_bitfield, __STOPTIME_ISSET_ID);
  }

  public void setStopTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STOPTIME_ISSET_ID, value);
  }

  /**
   * 统计指标主类型
   * 
   * @see MetricKey
   */
  public MetricKey getMetricKey() {
    return this.metricKey;
  }

  /**
   * 统计指标主类型
   * 
   * @see MetricKey
   */
  public MetricQueryRequest setMetricKey(MetricKey metricKey) {
    this.metricKey = metricKey;
    return this;
  }

  public void unsetMetricKey() {
    this.metricKey = null;
  }

  /** Returns true if field metricKey is set (has been assigned a value) and false otherwise */
  public boolean isSetMetricKey() {
    return this.metricKey != null;
  }

  public void setMetricKeyIsSet(boolean value) {
    if (!value) {
      this.metricKey = null;
    }
  }

  /**
   * 统计指标子类型
   * 
   * @see MetricType
   */
  public MetricType getMetricType() {
    return this.metricType;
  }

  /**
   * 统计指标子类型
   * 
   * @see MetricType
   */
  public MetricQueryRequest setMetricType(MetricType metricType) {
    this.metricType = metricType;
    return this;
  }

  public void unsetMetricType() {
    this.metricType = null;
  }

  /** Returns true if field metricType is set (has been assigned a value) and false otherwise */
  public boolean isSetMetricType() {
    return this.metricType != null;
  }

  public void setMetricTypeIsSet(boolean value) {
    if (!value) {
      this.metricType = null;
    }
  }

  /**
   * 下采样时间间隔, 0或者负数表示读取原始数据不进行下采样
   */
  public int getDownsampleInterval() {
    return this.downsampleInterval;
  }

  /**
   * 下采样时间间隔, 0或者负数表示读取原始数据不进行下采样
   */
  public MetricQueryRequest setDownsampleInterval(int downsampleInterval) {
    this.downsampleInterval = downsampleInterval;
    setDownsampleIntervalIsSet(true);
    return this;
  }

  public void unsetDownsampleInterval() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DOWNSAMPLEINTERVAL_ISSET_ID);
  }

  /** Returns true if field downsampleInterval is set (has been assigned a value) and false otherwise */
  public boolean isSetDownsampleInterval() {
    return EncodingUtils.testBit(__isset_bitfield, __DOWNSAMPLEINTERVAL_ISSET_ID);
  }

  public void setDownsampleIntervalIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DOWNSAMPLEINTERVAL_ISSET_ID, value);
  }

  /**
   * 下采样时间间隔单位
   * 
   * @see TimeSpanUnit
   */
  public TimeSpanUnit getDownsampleTimeUnit() {
    return this.downsampleTimeUnit;
  }

  /**
   * 下采样时间间隔单位
   * 
   * @see TimeSpanUnit
   */
  public MetricQueryRequest setDownsampleTimeUnit(TimeSpanUnit downsampleTimeUnit) {
    this.downsampleTimeUnit = downsampleTimeUnit;
    return this;
  }

  public void unsetDownsampleTimeUnit() {
    this.downsampleTimeUnit = null;
  }

  /** Returns true if field downsampleTimeUnit is set (has been assigned a value) and false otherwise */
  public boolean isSetDownsampleTimeUnit() {
    return this.downsampleTimeUnit != null;
  }

  public void setDownsampleTimeUnitIsSet(boolean value) {
    if (!value) {
      this.downsampleTimeUnit = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((String)value);
      }
      break;

    case START_TIME:
      if (value == null) {
        unsetStartTime();
      } else {
        setStartTime((Long)value);
      }
      break;

    case STOP_TIME:
      if (value == null) {
        unsetStopTime();
      } else {
        setStopTime((Long)value);
      }
      break;

    case METRIC_KEY:
      if (value == null) {
        unsetMetricKey();
      } else {
        setMetricKey((MetricKey)value);
      }
      break;

    case METRIC_TYPE:
      if (value == null) {
        unsetMetricType();
      } else {
        setMetricType((MetricType)value);
      }
      break;

    case DOWNSAMPLE_INTERVAL:
      if (value == null) {
        unsetDownsampleInterval();
      } else {
        setDownsampleInterval((Integer)value);
      }
      break;

    case DOWNSAMPLE_TIME_UNIT:
      if (value == null) {
        unsetDownsampleTimeUnit();
      } else {
        setDownsampleTimeUnit((TimeSpanUnit)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE_NAME:
      return getTableName();

    case START_TIME:
      return Long.valueOf(getStartTime());

    case STOP_TIME:
      return Long.valueOf(getStopTime());

    case METRIC_KEY:
      return getMetricKey();

    case METRIC_TYPE:
      return getMetricType();

    case DOWNSAMPLE_INTERVAL:
      return Integer.valueOf(getDownsampleInterval());

    case DOWNSAMPLE_TIME_UNIT:
      return getDownsampleTimeUnit();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TABLE_NAME:
      return isSetTableName();
    case START_TIME:
      return isSetStartTime();
    case STOP_TIME:
      return isSetStopTime();
    case METRIC_KEY:
      return isSetMetricKey();
    case METRIC_TYPE:
      return isSetMetricType();
    case DOWNSAMPLE_INTERVAL:
      return isSetDownsampleInterval();
    case DOWNSAMPLE_TIME_UNIT:
      return isSetDownsampleTimeUnit();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MetricQueryRequest)
      return this.equals((MetricQueryRequest)that);
    return false;
  }

  public boolean equals(MetricQueryRequest that) {
    if (that == null)
      return false;

    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }

    boolean this_present_startTime = true && this.isSetStartTime();
    boolean that_present_startTime = true && that.isSetStartTime();
    if (this_present_startTime || that_present_startTime) {
      if (!(this_present_startTime && that_present_startTime))
        return false;
      if (this.startTime != that.startTime)
        return false;
    }

    boolean this_present_stopTime = true && this.isSetStopTime();
    boolean that_present_stopTime = true && that.isSetStopTime();
    if (this_present_stopTime || that_present_stopTime) {
      if (!(this_present_stopTime && that_present_stopTime))
        return false;
      if (this.stopTime != that.stopTime)
        return false;
    }

    boolean this_present_metricKey = true && this.isSetMetricKey();
    boolean that_present_metricKey = true && that.isSetMetricKey();
    if (this_present_metricKey || that_present_metricKey) {
      if (!(this_present_metricKey && that_present_metricKey))
        return false;
      if (!this.metricKey.equals(that.metricKey))
        return false;
    }

    boolean this_present_metricType = true && this.isSetMetricType();
    boolean that_present_metricType = true && that.isSetMetricType();
    if (this_present_metricType || that_present_metricType) {
      if (!(this_present_metricType && that_present_metricType))
        return false;
      if (!this.metricType.equals(that.metricType))
        return false;
    }

    boolean this_present_downsampleInterval = true && this.isSetDownsampleInterval();
    boolean that_present_downsampleInterval = true && that.isSetDownsampleInterval();
    if (this_present_downsampleInterval || that_present_downsampleInterval) {
      if (!(this_present_downsampleInterval && that_present_downsampleInterval))
        return false;
      if (this.downsampleInterval != that.downsampleInterval)
        return false;
    }

    boolean this_present_downsampleTimeUnit = true && this.isSetDownsampleTimeUnit();
    boolean that_present_downsampleTimeUnit = true && that.isSetDownsampleTimeUnit();
    if (this_present_downsampleTimeUnit || that_present_downsampleTimeUnit) {
      if (!(this_present_downsampleTimeUnit && that_present_downsampleTimeUnit))
        return false;
      if (!this.downsampleTimeUnit.equals(that.downsampleTimeUnit))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tableName = true && (isSetTableName());
    list.add(present_tableName);
    if (present_tableName)
      list.add(tableName);

    boolean present_startTime = true && (isSetStartTime());
    list.add(present_startTime);
    if (present_startTime)
      list.add(startTime);

    boolean present_stopTime = true && (isSetStopTime());
    list.add(present_stopTime);
    if (present_stopTime)
      list.add(stopTime);

    boolean present_metricKey = true && (isSetMetricKey());
    list.add(present_metricKey);
    if (present_metricKey)
      list.add(metricKey.getValue());

    boolean present_metricType = true && (isSetMetricType());
    list.add(present_metricType);
    if (present_metricType)
      list.add(metricType.getValue());

    boolean present_downsampleInterval = true && (isSetDownsampleInterval());
    list.add(present_downsampleInterval);
    if (present_downsampleInterval)
      list.add(downsampleInterval);

    boolean present_downsampleTimeUnit = true && (isSetDownsampleTimeUnit());
    list.add(present_downsampleTimeUnit);
    if (present_downsampleTimeUnit)
      list.add(downsampleTimeUnit.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(MetricQueryRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTableName()).compareTo(other.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.tableName, other.tableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStartTime()).compareTo(other.isSetStartTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartTime()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.startTime, other.startTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStopTime()).compareTo(other.isSetStopTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStopTime()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.stopTime, other.stopTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMetricKey()).compareTo(other.isSetMetricKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetricKey()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.metricKey, other.metricKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMetricType()).compareTo(other.isSetMetricType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetricType()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.metricType, other.metricType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDownsampleInterval()).compareTo(other.isSetDownsampleInterval());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDownsampleInterval()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.downsampleInterval, other.downsampleInterval);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDownsampleTimeUnit()).compareTo(other.isSetDownsampleTimeUnit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDownsampleTimeUnit()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.downsampleTimeUnit, other.downsampleTimeUnit);
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
    StringBuilder sb = new StringBuilder("MetricQueryRequest(");
    boolean first = true;

    if (isSetTableName()) {
      sb.append("tableName:");
      if (this.tableName == null) {
        sb.append("null");
      } else {
        sb.append(this.tableName);
      }
      first = false;
    }
    if (isSetStartTime()) {
      if (!first) sb.append(", ");
      sb.append("startTime:");
      sb.append(this.startTime);
      first = false;
    }
    if (isSetStopTime()) {
      if (!first) sb.append(", ");
      sb.append("stopTime:");
      sb.append(this.stopTime);
      first = false;
    }
    if (isSetMetricKey()) {
      if (!first) sb.append(", ");
      sb.append("metricKey:");
      if (this.metricKey == null) {
        sb.append("null");
      } else {
        sb.append(this.metricKey);
      }
      first = false;
    }
    if (isSetMetricType()) {
      if (!first) sb.append(", ");
      sb.append("metricType:");
      if (this.metricType == null) {
        sb.append("null");
      } else {
        sb.append(this.metricType);
      }
      first = false;
    }
    if (isSetDownsampleInterval()) {
      if (!first) sb.append(", ");
      sb.append("downsampleInterval:");
      sb.append(this.downsampleInterval);
      first = false;
    }
    if (isSetDownsampleTimeUnit()) {
      if (!first) sb.append(", ");
      sb.append("downsampleTimeUnit:");
      if (this.downsampleTimeUnit == null) {
        sb.append("null");
      } else {
        sb.append(this.downsampleTimeUnit);
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

  private static class MetricQueryRequestStandardSchemeFactory implements SchemeFactory {
    public MetricQueryRequestStandardScheme getScheme() {
      return new MetricQueryRequestStandardScheme();
    }
  }

  private static class MetricQueryRequestStandardScheme extends StandardScheme<MetricQueryRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, MetricQueryRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.tableName = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // START_TIME
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.startTime = iprot.readI64();
              struct.setStartTimeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STOP_TIME
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.stopTime = iprot.readI64();
              struct.setStopTimeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // METRIC_KEY
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.metricKey = com.xiaomi.infra.galaxy.sds.thrift.MetricKey.findByValue(iprot.readI32());
              struct.setMetricKeyIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // METRIC_TYPE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.metricType = com.xiaomi.infra.galaxy.sds.thrift.MetricType.findByValue(iprot.readI32());
              struct.setMetricTypeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DOWNSAMPLE_INTERVAL
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.downsampleInterval = iprot.readI32();
              struct.setDownsampleIntervalIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // DOWNSAMPLE_TIME_UNIT
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.downsampleTimeUnit = com.xiaomi.infra.galaxy.sds.thrift.TimeSpanUnit.findByValue(iprot.readI32());
              struct.setDownsampleTimeUnitIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, MetricQueryRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tableName != null) {
        if (struct.isSetTableName()) {
          oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
          oprot.writeString(struct.tableName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetStartTime()) {
        oprot.writeFieldBegin(START_TIME_FIELD_DESC);
        oprot.writeI64(struct.startTime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetStopTime()) {
        oprot.writeFieldBegin(STOP_TIME_FIELD_DESC);
        oprot.writeI64(struct.stopTime);
        oprot.writeFieldEnd();
      }
      if (struct.metricKey != null) {
        if (struct.isSetMetricKey()) {
          oprot.writeFieldBegin(METRIC_KEY_FIELD_DESC);
          oprot.writeI32(struct.metricKey.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.metricType != null) {
        if (struct.isSetMetricType()) {
          oprot.writeFieldBegin(METRIC_TYPE_FIELD_DESC);
          oprot.writeI32(struct.metricType.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetDownsampleInterval()) {
        oprot.writeFieldBegin(DOWNSAMPLE_INTERVAL_FIELD_DESC);
        oprot.writeI32(struct.downsampleInterval);
        oprot.writeFieldEnd();
      }
      if (struct.downsampleTimeUnit != null) {
        if (struct.isSetDownsampleTimeUnit()) {
          oprot.writeFieldBegin(DOWNSAMPLE_TIME_UNIT_FIELD_DESC);
          oprot.writeI32(struct.downsampleTimeUnit.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MetricQueryRequestTupleSchemeFactory implements SchemeFactory {
    public MetricQueryRequestTupleScheme getScheme() {
      return new MetricQueryRequestTupleScheme();
    }
  }

  private static class MetricQueryRequestTupleScheme extends TupleScheme<MetricQueryRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, MetricQueryRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTableName()) {
        optionals.set(0);
      }
      if (struct.isSetStartTime()) {
        optionals.set(1);
      }
      if (struct.isSetStopTime()) {
        optionals.set(2);
      }
      if (struct.isSetMetricKey()) {
        optionals.set(3);
      }
      if (struct.isSetMetricType()) {
        optionals.set(4);
      }
      if (struct.isSetDownsampleInterval()) {
        optionals.set(5);
      }
      if (struct.isSetDownsampleTimeUnit()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetTableName()) {
        oprot.writeString(struct.tableName);
      }
      if (struct.isSetStartTime()) {
        oprot.writeI64(struct.startTime);
      }
      if (struct.isSetStopTime()) {
        oprot.writeI64(struct.stopTime);
      }
      if (struct.isSetMetricKey()) {
        oprot.writeI32(struct.metricKey.getValue());
      }
      if (struct.isSetMetricType()) {
        oprot.writeI32(struct.metricType.getValue());
      }
      if (struct.isSetDownsampleInterval()) {
        oprot.writeI32(struct.downsampleInterval);
      }
      if (struct.isSetDownsampleTimeUnit()) {
        oprot.writeI32(struct.downsampleTimeUnit.getValue());
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, MetricQueryRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.tableName = iprot.readString();
        struct.setTableNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.startTime = iprot.readI64();
        struct.setStartTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.stopTime = iprot.readI64();
        struct.setStopTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.metricKey = com.xiaomi.infra.galaxy.sds.thrift.MetricKey.findByValue(iprot.readI32());
        struct.setMetricKeyIsSet(true);
      }
      if (incoming.get(4)) {
        struct.metricType = com.xiaomi.infra.galaxy.sds.thrift.MetricType.findByValue(iprot.readI32());
        struct.setMetricTypeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.downsampleInterval = iprot.readI32();
        struct.setDownsampleIntervalIsSet(true);
      }
      if (incoming.get(6)) {
        struct.downsampleTimeUnit = com.xiaomi.infra.galaxy.sds.thrift.TimeSpanUnit.findByValue(iprot.readI32());
        struct.setDownsampleTimeUnitIsSet(true);
      }
    }
  }

}

