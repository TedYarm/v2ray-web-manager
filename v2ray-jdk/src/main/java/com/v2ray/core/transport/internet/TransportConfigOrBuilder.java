// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/transport/internet/config.proto

package com.v2ray.core.transport.internet;

public interface TransportConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.transport.internet.TransportConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of network that this settings supports.
   * </pre>
   *
   * <code>.v2ray.core.transport.internet.TransportProtocol protocol = 1;</code>
   */
  int getProtocolValue();
  /**
   * <pre>
   * Type of network that this settings supports.
   * </pre>
   *
   * <code>.v2ray.core.transport.internet.TransportProtocol protocol = 1;</code>
   */
  TransportProtocol getProtocol();

  /**
   * <pre>
   * Specific settings. Must be of the transports.
   * </pre>
   *
   * <code>.v2ray.core.common.serial.TypedMessage settings = 2;</code>
   */
  boolean hasSettings();
  /**
   * <pre>
   * Specific settings. Must be of the transports.
   * </pre>
   *
   * <code>.v2ray.core.common.serial.TypedMessage settings = 2;</code>
   */
  com.v2ray.core.common.serial.TypedMessage getSettings();
  /**
   * <pre>
   * Specific settings. Must be of the transports.
   * </pre>
   *
   * <code>.v2ray.core.common.serial.TypedMessage settings = 2;</code>
   */
  com.v2ray.core.common.serial.TypedMessageOrBuilder getSettingsOrBuilder();
}
