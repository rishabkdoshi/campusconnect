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

import android.os.Parcel;
import android.os.Parcelable;

//import com.activeandroid.Model;
//import com.activeandroid.annotation.Column;
//import com.activeandroid.annotation.Table;
import com.google.gson.annotations.SerializedName;

/**
 * Model definition for ModelsNotificationResponseForm.
 * <p/>
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the clubs. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
//@Table(name = "Notifications")
public class ModelsNotificationResponseForm implements Parcelable {

    /**
     * The value may be {@code null}.
     */
    //@Column(name = "clubId")
    @SerializedName("clubId")
    private java.lang.String clubId;

    /**
     * The value may be {@code null}.
     */

    //@Column(name = "clubName")
    @SerializedName("clubName")
    private java.lang.String clubName;

    /**
     * The value may be {@code null}.
     */

    //@Column(name = "clubphotoUrl")
    @SerializedName("clubphotoUrl")
    private java.lang.String clubphotoUrl;

    /**
     * The value may be {@code null}.
     */

    //@Column(name = "eventId", index = true)
    @SerializedName("eventId")
    private java.lang.String eventId;

    /**
     * The value may be {@code null}.
     */
    //@Column(name = "eventName")
    @SerializedName("eventName")
    private java.lang.String eventName;

    /**
     * The value may be {@code null}.
     */
    //@Column(name = "postId", index = true)
    @SerializedName("postId")
    private java.lang.String postId;

    /**
     * The value may be {@code null}.
     */
    //@Column(name = "postName")
    @SerializedName("postName")
    private java.lang.String postName;

    /**
     * The value may be {@code null}.
     */
    //@Column(name = "timestamp")
    @SerializedName("timestamp")
    private java.lang.String timestamp;

    /**
     * The value may be {@code null}.
     */
    //@Column(name = "type")
    @SerializedName("type")
    private java.lang.String type;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getClubId() {
        return clubId;
    }

    /**
     * @param clubId clubId or {@code null} for none
     */
    public ModelsNotificationResponseForm setClubId(java.lang.String clubId) {
        this.clubId = clubId;
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
    public ModelsNotificationResponseForm setClubName(java.lang.String clubName) {
        this.clubName = clubName;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getClubphotoUrl() {
        return clubphotoUrl;
    }

    /**
     * @param clubphotoUrl clubphotoUrl or {@code null} for none
     */
    public ModelsNotificationResponseForm setClubphotoUrl(java.lang.String clubphotoUrl) {
        this.clubphotoUrl = clubphotoUrl;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getEventId() {
        return eventId;
    }

    /**
     * @param eventId eventId or {@code null} for none
     */
    public ModelsNotificationResponseForm setEventId(java.lang.String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getEventName() {
        return eventName;
    }

    /**
     * @param eventName eventName or {@code null} for none
     */
    public ModelsNotificationResponseForm setEventName(java.lang.String eventName) {
        this.eventName = eventName;
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
    public ModelsNotificationResponseForm setPostId(java.lang.String postId) {
        this.postId = postId;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getPostName() {
        return postName;
    }

    /**
     * @param postName postName or {@code null} for none
     */
    public ModelsNotificationResponseForm setPostName(java.lang.String postName) {
        this.postName = postName;
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
    public ModelsNotificationResponseForm setTimestamp(java.lang.String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getType() {
        return type;
    }

    /**
     * @param type type or {@code null} for none
     */
    public ModelsNotificationResponseForm setType(java.lang.String type) {
        this.type = type;
        return this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(getType());
        dest.writeString(getPostId());
        dest.writeString(getEventId());
    }


    public static final Parcelable.Creator<ModelsNotificationResponseForm> CREATOR = new Parcelable.Creator<ModelsNotificationResponseForm>() {

        @Override
        public ModelsNotificationResponseForm createFromParcel(Parcel source) {
            ModelsNotificationResponseForm modelsNotificationResponseForm = new ModelsNotificationResponseForm();
            modelsNotificationResponseForm.setType(source.readString());
            modelsNotificationResponseForm.setPostId(source.readString());
            modelsNotificationResponseForm.setEventId(source.readString());

            return modelsNotificationResponseForm;
        }

        @Override
        public ModelsNotificationResponseForm[] newArray(int size) {
            return new ModelsNotificationResponseForm[size];
        }
    };

}
