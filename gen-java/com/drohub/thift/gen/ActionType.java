/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.drohub.thift.gen;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-01-14")
public enum ActionType implements org.apache.thrift.TEnum {
  START(0),
  STOP(1);

  private final int value;

  private ActionType(int value) {
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
  @org.apache.thrift.annotation.Nullable
  public static ActionType findByValue(int value) { 
    switch (value) {
      case 0:
        return START;
      case 1:
        return STOP;
      default:
        return null;
    }
  }
}
