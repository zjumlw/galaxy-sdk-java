/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.rpc.thrift;


import java.util.Map;
import java.util.HashMap;
import libthrift091.TEnum;

public enum RetryType implements libthrift091.TEnum {
  /**
   * 安全重试，比如建立链接超时，时钟偏移太大等错误，可以安全的进行自动重试
   */
  SAFE(0),
  /**
   * 非安全重试，比如操作超时，系统错误等，需要开发者显式指定，系统不应自动重试
   */
  UNSAFE(1);

  private final int value;

  private RetryType(int value) {
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
  public static RetryType findByValue(int value) { 
    switch (value) {
      case 0:
        return SAFE;
      case 1:
        return UNSAFE;
      default:
        return null;
    }
  }
}
