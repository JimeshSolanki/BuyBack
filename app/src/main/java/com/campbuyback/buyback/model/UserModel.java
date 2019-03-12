package com.campbuyback.buyback.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserModel implements Parcelable {

    public static final Parcelable.Creator<UserModel> CREATOR = new Parcelable.Creator<UserModel>() {
        @Override
        public UserModel createFromParcel(Parcel source) {
            return new UserModel(source);
        }

        @Override
        public UserModel[] newArray(int size) {
            return new UserModel[size];
        }
    };
    @SerializedName("Id")
    @Expose
    private int Id;
    @SerializedName("Username")
    @Expose
    private String Username;
    @SerializedName("Password")
    @Expose
    private String Password;
    @SerializedName("Firstname")
    @Expose
    private String Firstname;
    @SerializedName("Middlename")
    @Expose
    private String Middlename;
    @SerializedName("Lastname")
    @Expose
    private String Lastname;
    @SerializedName("DateOfBirth")
    @Expose
    private String DateOfBirth;
    @SerializedName("Age")
    @Expose
    private int Age;
    @SerializedName("Gender")
    @Expose
    private String Gender;
    @SerializedName("Mobileno")
    @Expose
    private String Mobileno;
    @SerializedName("Emailaddress")
    @Expose
    private String Emailaddress;
    @SerializedName("Bio")
    @Expose
    private String Bio;
    @SerializedName("Roleid")
    @Expose
    private int Roleid;
    @SerializedName("Rolename")
    @Expose
    private String Rolename;
    @SerializedName("IsLocked")
    @Expose
    private int IsLocked;
    @SerializedName("ProfileImage")
    @Expose
    private String ProfileImage;

    public UserModel() {
    }

    private UserModel(Parcel in) {
        this.Id = in.readInt();
        this.Username = in.readString();
        this.Password = in.readString();
        this.Firstname = in.readString();
        this.Middlename = in.readString();
        this.Lastname = in.readString();
        this.DateOfBirth = in.readString();
        this.Age = in.readInt();
        this.Gender = in.readString();
        this.Mobileno = in.readString();
        this.Emailaddress = in.readString();
        this.Bio = in.readString();
        this.Roleid = in.readInt();
        this.Rolename = in.readString();
        this.IsLocked = in.readInt();
        this.ProfileImage = in.readString();
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getFirstName() {
        return Firstname;
    }

    public void setFirstName(String firstname) {
        Firstname = firstname;
    }

    public String getMiddleName() {
        return Middlename;
    }

    public void setMiddleName(String middlename) {
        Middlename = middlename;
    }

    public String getLastName() {
        return Lastname;
    }

    public void setLastName(String lastname) {
        Lastname = lastname;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getMobileNo() {
        return Mobileno;
    }

    public void setMobileNo(String mobileno) {
        Mobileno = mobileno;
    }

    public String getEmailaddress() {
        return Emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        Emailaddress = emailaddress;
    }

    public String getBio() {
        return Bio;
    }

    public void setBio(String bio) {
        Bio = bio;
    }

    public int getRoleid() {
        return Roleid;
    }

    public void setRoleid(int roleid) {
        Roleid = roleid;
    }

    public String getRolename() {
        return Rolename;
    }

    public void setRolename(String rolename) {
        Rolename = rolename;
    }

    public int getIsLocked() {
        return IsLocked;
    }

    public void setIsLocked(int isLocked) {
        IsLocked = isLocked;
    }

    public String getProfileImage() {
        return ProfileImage;
    }

    public void setProfileImage(String profileImage) {
        ProfileImage = profileImage;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.Id);
        dest.writeString(this.Username);
        dest.writeString(this.Password);
        dest.writeString(this.Firstname);
        dest.writeString(this.Middlename);
        dest.writeString(this.Lastname);
        dest.writeString(this.DateOfBirth);
        dest.writeInt(this.Age);
        dest.writeString(this.Gender);
        dest.writeString(this.Mobileno);
        dest.writeString(this.Emailaddress);
        dest.writeString(this.Bio);
        dest.writeInt(this.Roleid);
        dest.writeString(this.Rolename);
        dest.writeInt(this.IsLocked);
        dest.writeString(this.ProfileImage);
    }
}
