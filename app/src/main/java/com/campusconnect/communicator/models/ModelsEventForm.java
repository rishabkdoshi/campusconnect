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

import com.google.gson.annotations.SerializedName;

/**
 * Model definition for ModelsEventForm.
 * <p/>
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the clubs. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class ModelsEventForm implements Parcelable {

    /**
     * The value may be {@code null}.
     */
    @SerializedName("attendess")
    private java.lang.String attendees;

    /**
     * The value may be {@code null}.
     */
    @SerializedName("clubId")
    private java.lang.String clubId;

    /**
     * The value may be {@code null}.
     */
    @SerializedName("clubName")
    private java.lang.String clubName;

    /**
     * The value may be {@code null}.
     */
    @SerializedName("clubphotoUrl")
    private java.lang.String clubphotoUrl;

    /**
     * The value may be {@code null}.
     */
    @SerializedName("collegeId")
    private java.lang.String collegeId;

    /**
     * The value may be {@code null}.
     */
    @SerializedName("completed")
    private java.lang.String completed;

    /**
     * The value may be {@code null}.
     */
    @SerializedName("description")
    private java.lang.String description;

    /**
     * The value may be {@code null}.
     */
    @SerializedName("endDate")
    private java.lang.String endDate;

    /**
     * The value may be {@code null}.
     */
    @SerializedName("endTime")
    private java.lang.String endTime;

    /**
     * The value may be {@code null}.
     */
    @SerializedName("eventId")
    private java.lang.String eventId;

    /**
     * The value may be {@code null}.
     */
    @SerializedName("eventCreator")
    private java.lang.String eventCreator;

    /**
     * The value may be {@code null}.
     */
    @SerializedName("isAlumni")
    private java.lang.String isAlumni;

    /**
     * The value may be {@code null}.
     */
    @SerializedName("photoUrl")
    private java.lang.String photoUrl;

    /**
     * The value may be {@code null}.
     */
    @SerializedName("startDate")
    private java.lang.String startDate;

    /**
     * The value may be {@code null}.
     */
    @SerializedName("startTime")
    private java.lang.String startTime;

    /**
     * The value may be {@code null}.
     */
    @SerializedName("tags")
    private java.lang.String tags;

    /**
     * The value may be {@code null}.
     */
    @SerializedName("timestamp")
    private java.lang.String timestamp;

    /**
     * The value may be {@code null}.
     */
    @SerializedName("title")
    private java.lang.String title;

    /**
     * The value may be {@code null}.
     */
    @SerializedName("venue")
    private java.lang.String venue;

    /**
     * The value may be {@code null}.
     */
    @SerializedName("views")
    private java.lang.String views;


    @SerializedName("isAttending")
    private String isAttending;
    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getAttendees() {
        return attendees;
    }

    /**
     * @param attendees attendees or {@code null} for none
     */
    public ModelsEventForm setAttendees(java.lang.String attendees) {
        this.attendees = attendees;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getClubId() {
        return clubId;
    }

    /**
     * @param clubId clubId or {@code null} for none
     */
    public ModelsEventForm setClubId(java.lang.String clubId) {
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
    public ModelsEventForm setClubName(java.lang.String clubName) {
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
    public ModelsEventForm setClubphotoUrl(java.lang.String clubphotoUrl) {
        this.clubphotoUrl = clubphotoUrl;
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
    public ModelsEventForm setCollegeId(java.lang.String collegeId) {
        this.collegeId = collegeId;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getCompleted() {
        return completed;
    }

    /**
     * @param completed completed or {@code null} for none
     */
    public ModelsEventForm setCompleted(java.lang.String completed) {
        this.completed = completed;
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
    public ModelsEventForm setDescription(java.lang.String description) {
        this.description = description;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate endDate or {@code null} for none
     */
    public ModelsEventForm setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getEndTime() {
        return endTime;
    }

    /**
     * @param endTime endTime or {@code null} for none
     */
    public ModelsEventForm setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
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
    public ModelsEventForm setEventId(java.lang.String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getEventCreator() {
        return eventCreator;
    }

    /**
     * @param eventCreator eventCreator or {@code null} for none
     */
    public ModelsEventForm setEventCreator(java.lang.String eventCreator) {
        this.eventCreator = eventCreator;
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
    public ModelsEventForm setIsAlumni(java.lang.String isAlumni) {
        this.isAlumni = isAlumni;
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
    public ModelsEventForm setPhotoUrl(java.lang.String photoUrl) {
        this.photoUrl = photoUrl;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate startDate or {@code null} for none
     */
    public ModelsEventForm setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime startTime or {@code null} for none
     */
    public ModelsEventForm setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getTags() {
        return tags;
    }

    /**
     * @param tags tags or {@code null} for none
     */
    public ModelsEventForm setTags(java.lang.String tags) {
        this.tags = tags;
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
    public ModelsEventForm setTimestamp(java.lang.String timestamp) {
        this.timestamp = timestamp;
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
    public ModelsEventForm setTitle(java.lang.String title) {
        this.title = title;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getVenue() {
        return venue;
    }

    /**
     * @param venue venue or {@code null} for none
     */
    public ModelsEventForm setVenue(java.lang.String venue) {
        this.venue = venue;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getViews() {
        return views;
    }

    /**
     * @param views views or {@code null} for none
     */
    public ModelsEventForm setViews(java.lang.String views) {
        this.views = views;
        return this;
    }


    /**
     *
     * @return
     * The isAttending
     */
    public String getIsAttending() {
        return isAttending;
    }

    /**
     *
     * @param isAttending
     * The isAttending
     */
    public void setIsAttending(String isAttending) {
        this.isAttending = isAttending;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(getStartDate());
        dest.writeString(getEndDate());
        dest.writeString(getPhotoUrl());
        dest.writeString(getEventCreator());
        dest.writeString(getEventId());
        dest.writeString(getAttendees());
        dest.writeString(getClubId());
        dest.writeString(getTitle());
        dest.writeString(getTags());
        dest.writeString(getClubName());
        dest.writeString(getDescription());
        dest.writeString(getViews());
        dest.writeString(getTimestamp());
        dest.writeString(getCompleted());
        dest.writeString(getIsAttending());
        dest.writeString(getStartTime());
        dest.writeString(getIsAlumni());
        dest.writeString(getClubphotoUrl());
        dest.writeString(getVenue());
        dest.writeString(getEndTime());
    }

    public static final Parcelable.Creator<ModelsEventForm> CREATOR = new Parcelable.Creator<ModelsEventForm>() {

        @Override
        public ModelsEventForm createFromParcel(Parcel source) {
            ModelsEventForm event = new ModelsEventForm();
            event.setStartDate(source.readString());
            event.setEndDate(source.readString());
            event.setPhotoUrl(source.readString());
            event.setEventCreator(source.readString());
            event.setEventId(source.readString());
            event.setAttendees(source.readString());
            event.setClubId(source.readString());
            event.setTitle(source.readString());
            event.setTags(source.readString());
            event.setClubName(source.readString());
            event.setDescription(source.readString());
            event.setViews(source.readString());
            event.setTimestamp(source.readString());
            event.setCompleted(source.readString());
            event.setIsAttending(source.readString());
            event.setStartTime(source.readString());
            event.setIsAlumni(source.readString());
            event.setClubphotoUrl(source.readString());
            event.setVenue(source.readString());
            event.setEndTime(source.readString());
            return event;
        }

        @Override
        public ModelsEventForm[] newArray(int size) {
            return new ModelsEventForm[size];
        }
    };
}
