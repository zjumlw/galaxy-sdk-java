/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.io.thrift;


import java.util.Map;
import java.util.HashMap;
import libthrift091.TEnum;

/**
 * 压缩算法类型
 */
public enum Compression implements libthrift091.TEnum {
  NONE(0),
  SNAPPY(1);

  private final int value;

  private Compression(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static Compression findByValue(int value) { 
    switch (value) {
      case 0:
        return NONE;
      case 1:
        return SNAPPY;
      default:
        return null;
    }
  }
}
