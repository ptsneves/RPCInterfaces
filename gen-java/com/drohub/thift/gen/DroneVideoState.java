/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.drohub.thift.gen;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2020-01-14")
public enum DroneVideoState implements org.apache.thrift.TEnum {
  LIVE(0),
  STOPPED(1),
  DIED(2),
  INVALID_CONDITION(3);

  private final int value;

  private DroneVideoState(int value) {
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
  public static DroneVideoState findByValue(int value) { 
    switch (value) {
      case 0:
        return LIVE;
      case 1:
        return STOPPED;
      case 2:
        return DIED;
      case 3:
        return INVALID_CONDITION;
      default:
        return null;
    }
  }
}
