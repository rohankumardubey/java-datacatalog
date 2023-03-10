// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/policytagmanagerserialization.proto

package com.google.cloud.datacatalog.v1beta1;

public final class PolicyTagManagerSerializationProto {
  private PolicyTagManagerSerializationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1beta1_SerializedTaxonomy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_SerializedTaxonomy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1beta1_SerializedPolicyTag_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_SerializedPolicyTag_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1beta1_ImportTaxonomiesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_ImportTaxonomiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1beta1_InlineSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_InlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1beta1_ImportTaxonomiesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_ImportTaxonomiesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1beta1_ExportTaxonomiesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_ExportTaxonomiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1beta1_ExportTaxonomiesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_ExportTaxonomiesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/cloud/datacatalog/v1beta1/polic" +
      "ytagmanagerserialization.proto\022 google.c" +
      "loud.datacatalog.v1beta1\032\034google/api/ann" +
      "otations.proto\032\037google/api/field_behavio" +
      "r.proto\032\031google/api/resource.proto\0327goog" +
      "le/cloud/datacatalog/v1beta1/policytagma" +
      "nager.proto\032\032google/iam/v1/policy.proto\032" +
      "\027google/api/client.proto\"\220\001\n\022SerializedT" +
      "axonomy\022\031\n\014display_name\030\001 \001(\tB\003\340A\002\022\023\n\013de" +
      "scription\030\002 \001(\t\022J\n\013policy_tags\030\003 \003(\01325.g" +
      "oogle.cloud.datacatalog.v1beta1.Serializ" +
      "edPolicyTag\"\227\001\n\023SerializedPolicyTag\022\031\n\014d" +
      "isplay_name\030\002 \001(\tB\003\340A\002\022\023\n\013description\030\003 " +
      "\001(\t\022P\n\021child_policy_tags\030\004 \003(\01325.google." +
      "cloud.datacatalog.v1beta1.SerializedPoli" +
      "cyTag\"\251\001\n\027ImportTaxonomiesRequest\022;\n\006par" +
      "ent\030\001 \001(\tB+\340A\002\372A%\022#datacatalog.googleapi" +
      "s.com/Taxonomy\022G\n\rinline_source\030\002 \001(\0132.." +
      "google.cloud.datacatalog.v1beta1.InlineS" +
      "ourceH\000B\010\n\006source\"]\n\014InlineSource\022M\n\ntax" +
      "onomies\030\001 \003(\01324.google.cloud.datacatalog" +
      ".v1beta1.SerializedTaxonomyB\003\340A\002\"Z\n\030Impo" +
      "rtTaxonomiesResponse\022>\n\ntaxonomies\030\001 \003(\013" +
      "2*.google.cloud.datacatalog.v1beta1.Taxo" +
      "nomy\"\307\001\n\027ExportTaxonomiesRequest\022;\n\006pare" +
      "nt\030\001 \001(\tB+\340A\002\372A%\022#datacatalog.googleapis" +
      ".com/Taxonomy\022?\n\ntaxonomies\030\002 \003(\tB+\340A\002\372A" +
      "%\n#datacatalog.googleapis.com/Taxonomy\022\037" +
      "\n\025serialized_taxonomies\030\003 \001(\010H\000B\r\n\013desti" +
      "nation\"d\n\030ExportTaxonomiesResponse\022H\n\nta" +
      "xonomies\030\001 \003(\01324.google.cloud.datacatalo" +
      "g.v1beta1.SerializedTaxonomy2\222\004\n\035PolicyT" +
      "agManagerSerialization\022\320\001\n\020ImportTaxonom" +
      "ies\0229.google.cloud.datacatalog.v1beta1.I" +
      "mportTaxonomiesRequest\032:.google.cloud.da" +
      "tacatalog.v1beta1.ImportTaxonomiesRespon" +
      "se\"E\202\323\344\223\002?\":/v1beta1/{parent=projects/*/" +
      "locations/*}/taxonomies:import:\001*\022\315\001\n\020Ex" +
      "portTaxonomies\0229.google.cloud.datacatalo" +
      "g.v1beta1.ExportTaxonomiesRequest\032:.goog" +
      "le.cloud.datacatalog.v1beta1.ExportTaxon" +
      "omiesResponse\"B\202\323\344\223\002<\022:/v1beta1/{parent=" +
      "projects/*/locations/*}/taxonomies:expor" +
      "t\032N\312A\032datacatalog.googleapis.com\322A.https" +
      "://www.googleapis.com/auth/cloud-platfor" +
      "mB\203\002\n$com.google.cloud.datacatalog.v1bet" +
      "a1B\"PolicyTagManagerSerializationProtoP\001" +
      "ZFcloud.google.com/go/datacatalog/apiv1b" +
      "eta1/datacatalogpb;datacatalogpb\370\001\001\252\002 Go" +
      "ogle.Cloud.DataCatalog.V1Beta1\312\002 Google\\" +
      "Cloud\\DataCatalog\\V1beta1\352\002#Google::Clou" +
      "d::DataCatalog::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto.getDescriptor(),
          com.google.iam.v1.PolicyProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        });
    internal_static_google_cloud_datacatalog_v1beta1_SerializedTaxonomy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1beta1_SerializedTaxonomy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1beta1_SerializedTaxonomy_descriptor,
        new java.lang.String[] { "DisplayName", "Description", "PolicyTags", });
    internal_static_google_cloud_datacatalog_v1beta1_SerializedPolicyTag_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datacatalog_v1beta1_SerializedPolicyTag_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1beta1_SerializedPolicyTag_descriptor,
        new java.lang.String[] { "DisplayName", "Description", "ChildPolicyTags", });
    internal_static_google_cloud_datacatalog_v1beta1_ImportTaxonomiesRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datacatalog_v1beta1_ImportTaxonomiesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1beta1_ImportTaxonomiesRequest_descriptor,
        new java.lang.String[] { "Parent", "InlineSource", "Source", });
    internal_static_google_cloud_datacatalog_v1beta1_InlineSource_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_datacatalog_v1beta1_InlineSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1beta1_InlineSource_descriptor,
        new java.lang.String[] { "Taxonomies", });
    internal_static_google_cloud_datacatalog_v1beta1_ImportTaxonomiesResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_datacatalog_v1beta1_ImportTaxonomiesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1beta1_ImportTaxonomiesResponse_descriptor,
        new java.lang.String[] { "Taxonomies", });
    internal_static_google_cloud_datacatalog_v1beta1_ExportTaxonomiesRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_datacatalog_v1beta1_ExportTaxonomiesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1beta1_ExportTaxonomiesRequest_descriptor,
        new java.lang.String[] { "Parent", "Taxonomies", "SerializedTaxonomies", "Destination", });
    internal_static_google_cloud_datacatalog_v1beta1_ExportTaxonomiesResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_datacatalog_v1beta1_ExportTaxonomiesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1beta1_ExportTaxonomiesResponse_descriptor,
        new java.lang.String[] { "Taxonomies", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
