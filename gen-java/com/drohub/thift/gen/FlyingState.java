/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.drohub.thift.gen;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)")
public enum FlyingState implements org.apache.thrift.TEnum {
  LANDED(0),
  TAKING_OFF(1),
  HOVERING(2),
  FLYING(3),
  LANDING(4),
  EMERGENCY(5),
  USER_TAKEOFF(6),
  MOTOR_RAMPING(7),
  EMERGENCY_LANDING(8);

  private final int value;

  private FlyingState(int value) {
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
  public static FlyingState findByValue(int value) { 
    switch (value) {
      case 0:
        return LANDED;
      case 1:
        return TAKING_OFF;
      case 2:
        return HOVERING;
      case 3:
        return FLYING;
      case 4:
        return LANDING;
      case 5:
        return EMERGENCY;
      case 6:
        return USER_TAKEOFF;
      case 7:
        return MOTOR_RAMPING;
      case 8:
        return EMERGENCY_LANDING;
      default:
        return null;
    }
  }
}
