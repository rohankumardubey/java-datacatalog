/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/policytagmanagerserialization.proto

package com.google.cloud.datacatalog.v1;

public interface ImportTaxonomiesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.ImportTaxonomiesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Taxonomies that were imported.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Taxonomy taxonomies = 1;</code>
   */
  java.util.List<com.google.cloud.datacatalog.v1.Taxonomy> getTaxonomiesList();
  /**
   *
   *
   * <pre>
   * Taxonomies that were imported.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Taxonomy taxonomies = 1;</code>
   */
  com.google.cloud.datacatalog.v1.Taxonomy getTaxonomies(int index);
  /**
   *
   *
   * <pre>
   * Taxonomies that were imported.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Taxonomy taxonomies = 1;</code>
   */
  int getTaxonomiesCount();
  /**
   *
   *
   * <pre>
   * Taxonomies that were imported.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Taxonomy taxonomies = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.v1.TaxonomyOrBuilder>
      getTaxonomiesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Taxonomies that were imported.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Taxonomy taxonomies = 1;</code>
   */
  com.google.cloud.datacatalog.v1.TaxonomyOrBuilder getTaxonomiesOrBuilder(int index);
}
