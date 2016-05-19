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
 * PostMiniForm -- What's shown on the UI for a post
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the clubs. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ModelsPostMiniForm extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("club_id")
  private java.lang.String clubId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String date;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("from_pid")
  private java.lang.String fromPid;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String likers;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String photoUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String time;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getClubId() {
    return clubId;
  }

  /**
   * @param clubId clubId or {@code null} for none
   */
  public ModelsPostMiniForm setClubId(java.lang.String clubId) {
    this.clubId = clubId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDate() {
    return date;
  }

  /**
   * @param date date or {@code null} for none
   */
  public ModelsPostMiniForm setDate(java.lang.String date) {
    this.date = date;
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
  public ModelsPostMiniForm setDescription(java.lang.String description) {
    this.description = description;
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
  public ModelsPostMiniForm setFromPid(java.lang.String fromPid) {
    this.fromPid = fromPid;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLikers() {
    return likers;
  }

  /**
   * @param likers likers or {@code null} for none
   */
  public ModelsPostMiniForm setLikers(java.lang.String likers) {
    this.likers = likers;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPhotoUrl() {
    return photoUrl;
  }

  /**
   * @param photoUrl photoUrl or {@code null} for none
   */
  public ModelsPostMiniForm setPhotoUrl(java.lang.String photoUrl) {
    this.photoUrl = photoUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTime() {
    return time;
  }

  /**
   * @param time time or {@code null} for none
   */
  public ModelsPostMiniForm setTime(java.lang.String time) {
    this.time = time;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * @param title title or {@code null} for none
   */
  public ModelsPostMiniForm setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public ModelsPostMiniForm set(String fieldName, Object value) {
    return (ModelsPostMiniForm) super.set(fieldName, value);
  }

  @Override
  public ModelsPostMiniForm clone() {
    return (ModelsPostMiniForm) super.clone();
  }

}
