// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/policy/config.proto

package com.v2ray.core.app.policy;

public interface PolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.app.policy.Policy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.v2ray.core.app.policy.Policy.Timeout timeout = 1;</code>
   */
  boolean hasTimeout();
  /**
   * <code>.v2ray.core.app.policy.Policy.Timeout timeout = 1;</code>
   */
  Policy.Timeout getTimeout();
  /**
   * <code>.v2ray.core.app.policy.Policy.Timeout timeout = 1;</code>
   */
  Policy.TimeoutOrBuilder getTimeoutOrBuilder();

  /**
   * <code>.v2ray.core.app.policy.Policy.Stats stats = 2;</code>
   */
  boolean hasStats();
  /**
   * <code>.v2ray.core.app.policy.Policy.Stats stats = 2;</code>
   */
  Policy.Stats getStats();
  /**
   * <code>.v2ray.core.app.policy.Policy.Stats stats = 2;</code>
   */
  Policy.StatsOrBuilder getStatsOrBuilder();

  /**
   * <code>.v2ray.core.app.policy.Policy.Buffer buffer = 3;</code>
   */
  boolean hasBuffer();
  /**
   * <code>.v2ray.core.app.policy.Policy.Buffer buffer = 3;</code>
   */
  Policy.Buffer getBuffer();
  /**
   * <code>.v2ray.core.app.policy.Policy.Buffer buffer = 3;</code>
   */
  Policy.BufferOrBuilder getBufferOrBuilder();
}
