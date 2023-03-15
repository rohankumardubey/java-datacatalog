// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

public interface ModifyEntryContactsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.ModifyEntryContactsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The full resource name of the entry.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The full resource name of the entry.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The new value for the Contacts.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Contacts contacts = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the contacts field is set.
   */
  boolean hasContacts();
  /**
   * <pre>
   * Required. The new value for the Contacts.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Contacts contacts = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The contacts.
   */
  com.google.cloud.datacatalog.v1.Contacts getContacts();
  /**
   * <pre>
   * Required. The new value for the Contacts.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Contacts contacts = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.datacatalog.v1.ContactsOrBuilder getContactsOrBuilder();
}
