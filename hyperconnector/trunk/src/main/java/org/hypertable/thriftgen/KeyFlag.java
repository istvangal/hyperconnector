/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.hypertable.thriftgen;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * State flags for a key
 * 
 * Note for maintainers: the definition must be sync'ed with FLAG_* constants
 * in src/cc/Hypertable/Lib/Key.h
 * 
 * DELETE_ROW: row is pending delete
 * 
 * DELETE_CF: column family is pending delete
 * 
 * DELETE_CELL: key is pending delete
 * 
 * DELETE_CELL_VERSION: delete specific timestamped version of key
 * 
 * INSERT: key is an insert/update (default state)
 */
public enum KeyFlag implements org.apache.thrift.TEnum {
  DELETE_ROW(0),
  DELETE_CF(1),
  DELETE_CELL(2),
  DELETE_CELL_VERSION(3),
  INSERT(255);

  private final int value;

  private KeyFlag(int value) {
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
  public static KeyFlag findByValue(int value) { 
    switch (value) {
      case 0:
        return DELETE_ROW;
      case 1:
        return DELETE_CF;
      case 2:
        return DELETE_CELL;
      case 3:
        return DELETE_CELL_VERSION;
      case 255:
        return INSERT;
      default:
        return null;
    }
  }
}