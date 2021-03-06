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

import com.google.gson.annotations.SerializedName;

/**
 * Model definition for ModelsCommentsForm.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the clubs. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class ModelsCommentsForm  {

  /**
   * The value may be {@code null}.
   */
  @SerializedName("commentBody")
  private java.lang.String commentBody;

  /**
   * The value may be {@code null}.
   */
  @SerializedName("pid")
  private java.lang.String pid;

  /**
   * The value may be {@code null}.
   */
  @SerializedName("postId")
  private java.lang.String postId;

  /**
   * The value may be {@code null}.
   */
  @SerializedName("timestamp")
  private java.lang.String timestamp;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCommentBody() {
    return commentBody;
  }

  /**
   * @param commentBody commentBody or {@code null} for none
   */
  public ModelsCommentsForm setCommentBody(java.lang.String commentBody) {
    this.commentBody = commentBody;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPid() {
    return pid;
  }

  /**
   * @param pid pid or {@code null} for none
   */
  public ModelsCommentsForm setPid(java.lang.String pid) {
    this.pid = pid;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPostId() {
    return postId;
  }

  /**
   * @param postId postId or {@code null} for none
   */
  public ModelsCommentsForm setPostId(java.lang.String postId) {
    this.postId = postId;
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
  public ModelsCommentsForm setTimestamp(java.lang.String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

}
