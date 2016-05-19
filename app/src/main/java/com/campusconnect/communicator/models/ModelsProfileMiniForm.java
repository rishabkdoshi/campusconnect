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

import java.util.ArrayList;
import java.util.List;

/**
 * ProfileMiniForm -- What's shown on the UI
 * <p/>
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the clubs. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class ModelsProfileMiniForm implements Parcelable {
    @SerializedName("batch")
    private String batch;
    @SerializedName("branch")
    private String branch;
    @SerializedName("collegeId")
    private String collegeId;
    @SerializedName("email")
    private String email;
    @SerializedName("gcmId")
    private String gcmId;
    @SerializedName("isAlumni")
    private String isAlumni;
    @SerializedName("name")
    private String name;
    @SerializedName("phone")
    private String phone;
    @SerializedName("photoUrl")
    private String photoUrl;
    @SerializedName("tags")
    private List<String> tags = new ArrayList<String>();
    @SerializedName("location")
    private String location;
    @SerializedName("followsNames")
    private List<String> followsNames;
    @SerializedName("follows")
    private List<String> follows;
    @SerializedName("pid")
    private String pid;

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @SerializedName("company")
    private String company;


    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The photoUrl
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * @param photoUrl The photoUrl
     */
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    /**
     * @return The follows
     */
    public List<String> getFollows() {
        return follows;
    }

    /**
     * @param follows The follows
     */
    public void setFollows(List<String> follows) {
        this.follows = follows;
    }

    /**
     * @return The pid
     */
    public String getPid() {
        return pid;
    }

    /**
     * @param pid The pid
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * @return The gcmId
     */
    public String getGcmId() {
        return gcmId;
    }

    /**
     * @param gcmId The gcmId
     */
    public void setGcmId(String gcmId) {
        this.gcmId = gcmId;
    }

    /**
     * @return The followsNames
     */
    public List<String> getFollowsNames() {
        return followsNames;
    }

    /**
     * @param followsNames The followsNames
     */
    public void setFollowsNames(List<String> followsNames) {
        this.followsNames = followsNames;
    }

    /**
     * @return The batch
     */
    public String getBatch() {
        return batch;
    }

    /**
     * @param batch The batch
     */
    public void setBatch(String batch) {
        this.batch = batch;
    }

    /**
     * @return The phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone The phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return The collegeId
     */
    public String getCollegeId() {
        return collegeId;
    }

    /**
     * @param collegeId The collegeId
     */
    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }

    /**
     * @return The branch
     */
    public String getBranch() {
        return branch;
    }

    /**
     * @param branch The branch
     */
    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * @return The isAlumni
     */
    public String getIsAlumni() {
        return isAlumni;
    }

    /**
     * @param isAlumni The isAlumni
     */
    public void setIsAlumni(String isAlumni) {
        this.isAlumni = isAlumni;
    }

    /**
     * @return The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(getBatch());
        dest.writeString(getBranch());
        dest.writeString(getEmail());
        dest.writeString(getPhotoUrl());
        dest.writeString(getPid());
        dest.writeString(getName());
        dest.writeStringList(getFollows());
        dest.writeStringList(getTags());
    }


    public static final Parcelable.Creator<ModelsProfileMiniForm> CREATOR = new Parcelable.Creator<ModelsProfileMiniForm>() {

        @Override
        public ModelsProfileMiniForm createFromParcel(Parcel source) {
            ModelsProfileMiniForm modelsProfileMiniForm = new ModelsProfileMiniForm();

            modelsProfileMiniForm.setBatch(source.readString());
            modelsProfileMiniForm.setBranch(source.readString());
            modelsProfileMiniForm.setEmail(source.readString());
            modelsProfileMiniForm.setPhotoUrl(source.readString());
            modelsProfileMiniForm.setPid(source.readString());
            modelsProfileMiniForm.setName(source.readString());
            List<String> follows = new ArrayList<>();
            source.readStringList(follows);
            modelsProfileMiniForm.setFollows(follows);
            List<String> tags = new ArrayList<>();
            source.readStringList(tags);
            modelsProfileMiniForm.setTags(tags);
            return modelsProfileMiniForm;
        }

        @Override
        public ModelsProfileMiniForm[] newArray(int size) {
            return new ModelsProfileMiniForm[size];
        }
    };
}