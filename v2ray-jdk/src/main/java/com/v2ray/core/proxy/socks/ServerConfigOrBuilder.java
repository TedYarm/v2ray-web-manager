// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/proxy/socks/config.proto

package com.v2ray.core.proxy.socks;

public interface ServerConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.proxy.socks.ServerConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.v2ray.core.proxy.socks.AuthType auth_type = 1;</code>
   */
  int getAuthTypeValue();
  /**
   * <code>.v2ray.core.proxy.socks.AuthType auth_type = 1;</code>
   */
  AuthType getAuthType();

  /**
   * <code>map&lt;string, string&gt; accounts = 2;</code>
   */
  int getAccountsCount();
  /**
   * <code>map&lt;string, string&gt; accounts = 2;</code>
   */
  boolean containsAccounts(
          String key);
  /**
   * Use {@link #getAccountsMap()} instead.
   */
  @Deprecated
  java.util.Map<String, String>
  getAccounts();
  /**
   * <code>map&lt;string, string&gt; accounts = 2;</code>
   */
  java.util.Map<String, String>
  getAccountsMap();
  /**
   * <code>map&lt;string, string&gt; accounts = 2;</code>
   */

  String getAccountsOrDefault(
          String key,
          String defaultValue);
  /**
   * <code>map&lt;string, string&gt; accounts = 2;</code>
   */

  String getAccountsOrThrow(
          String key);

  /**
   * <code>.v2ray.core.common.net.IPOrDomain address = 3;</code>
   */
  boolean hasAddress();
  /**
   * <code>.v2ray.core.common.net.IPOrDomain address = 3;</code>
   */
  com.v2ray.core.common.net.IPOrDomain getAddress();
  /**
   * <code>.v2ray.core.common.net.IPOrDomain address = 3;</code>
   */
  com.v2ray.core.common.net.IPOrDomainOrBuilder getAddressOrBuilder();

  /**
   * <code>bool udp_enabled = 4;</code>
   */
  boolean getUdpEnabled();

  /**
   * <code>uint32 timeout = 5 [deprecated = true];</code>
   */
  @Deprecated int getTimeout();

  /**
   * <code>uint32 user_level = 6;</code>
   */
  int getUserLevel();
}
