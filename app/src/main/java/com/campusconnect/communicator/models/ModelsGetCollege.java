/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-01-08 17:48:37 UTC)
 * on 2016-01-16 at 14:32:37 UTC 
 * Modify at your own risk.
 */

package com.campusconnect.communicator.models;
/**
 * Model definition for ModelsGetCollege.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the clubs. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ModelsGetCollege extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String abbreviation;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String collegeId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAbbreviation() {
    return abbreviation;
  }

  /**
   * @param abbreviation abbreviation or {@code null} for none
   */
  public ModelsGetCollege setAbbreviation(java.lang.String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCollegeId() {
    return collegeId;
  }

  /**
   * @param collegeId collegeId or {@code null} for none
   */
  public ModelsGetCollege setCollegeId(java.lang.String collegeId) {
    this.collegeId = collegeId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * @param location location or {@code null} for none
   */
  public ModelsGetCollege setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public ModelsGetCollege setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public ModelsGetCollege set(String fieldName, Object value) {
    return (ModelsGetCollege) super.set(fieldName, value);
  }

  @Override
  public ModelsGetCollege clone() {
    return (ModelsGetCollege) super.clone();
  }

}
