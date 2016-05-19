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
 * Model definition for ModelsSuperAdminFeed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the clubs. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ModelsSuperAdminFeed extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String abbreviation;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("club_name")
  private java.lang.String clubName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("from_name")
  private java.lang.String fromName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("from_photoUrl")
  private java.lang.String fromPhotoUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("from_pid")
  private java.lang.String fromPid;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String isAlumni;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timestamp;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAbbreviation() {
    return abbreviation;
  }

  /**
   * @param abbreviation abbreviation or {@code null} for none
   */
  public ModelsSuperAdminFeed setAbbreviation(java.lang.String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getClubName() {
    return clubName;
  }

  /**
   * @param clubName clubName or {@code null} for none
   */
  public ModelsSuperAdminFeed setClubName(java.lang.String clubName) {
    this.clubName = clubName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * @param description description or {@code null} for none
   */
  public ModelsSuperAdminFeed setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFromName() {
    return fromName;
  }

  /**
   * @param fromName fromName or {@code null} for none
   */
  public ModelsSuperAdminFeed setFromName(java.lang.String fromName) {
    this.fromName = fromName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFromPhotoUrl() {
    return fromPhotoUrl;
  }

  /**
   * @param fromPhotoUrl fromPhotoUrl or {@code null} for none
   */
  public ModelsSuperAdminFeed setFromPhotoUrl(java.lang.String fromPhotoUrl) {
    this.fromPhotoUrl = fromPhotoUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFromPid() {
    return fromPid;
  }

  /**
   * @param fromPid fromPid or {@code null} for none
   */
  public ModelsSuperAdminFeed setFromPid(java.lang.String fromPid) {
    this.fromPid = fromPid;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIsAlumni() {
    return isAlumni;
  }

  /**
   * @param isAlumni isAlumni or {@code null} for none
   */
  public ModelsSuperAdminFeed setIsAlumni(java.lang.String isAlumni) {
    this.isAlumni = isAlumni;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * @param requestId requestId or {@code null} for none
   */
  public ModelsSuperAdminFeed setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTimestamp() {
    return timestamp;
  }

  /**
   * @param timestamp timestamp or {@code null} for none
   */
  public ModelsSuperAdminFeed setTimestamp(java.lang.String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  @Override
  public ModelsSuperAdminFeed set(String fieldName, Object value) {
    return (ModelsSuperAdminFeed) super.set(fieldName, value);
  }

  @Override
  public ModelsSuperAdminFeed clone() {
    return (ModelsSuperAdminFeed) super.clone();
  }

}