// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/common/log/log.proto

package com.v2ray.core.common.log;

/**
 * Protobuf enum {@code v2ray.core.common.log.Severity}
 */
public enum Severity
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>Unknown = 0;</code>
   */
  Unknown(0),
  /**
   * <code>Error = 1;</code>
   */
  Error(1),
  /**
   * <code>Warning = 2;</code>
   */
  Warning(2),
  /**
   * <code>Info = 3;</code>
   */
  Info(3),
  /**
   * <code>Debug = 4;</code>
   */
  Debug(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>Unknown = 0;</code>
   */
  public static final int Unknown_VALUE = 0;
  /**
   * <code>Error = 1;</code>
   */
  public static final int Error_VALUE = 1;
  /**
   * <code>Warning = 2;</code>
   */
  public static final int Warning_VALUE = 2;
  /**
   * <code>Info = 3;</code>
   */
  public static final int Info_VALUE = 3;
  /**
   * <code>Debug = 4;</code>
   */
  public static final int Debug_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static Severity valueOf(int value) {
    return forNumber(value);
  }

  public static Severity forNumber(int value) {
    switch (value) {
      case 0: return Unknown;
      case 1: return Error;
      case 2: return Warning;
      case 3: return Info;
      case 4: return Debug;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Severity>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Severity> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Severity>() {
          public Severity findValueByNumber(int number) {
            return Severity.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return Log.getDescriptor().getEnumTypes().get(0);
  }

  private static final Severity[] VALUES = values();

  public static Severity valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Severity(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:v2ray.core.common.log.Severity)
}

