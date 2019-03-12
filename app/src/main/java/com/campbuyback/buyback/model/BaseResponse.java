package com.campbuyback.buyback.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BaseResponse implements Parcelable {

    public static final Parcelable.Creator<BaseResponse> CREATOR = new Parcelable.Creator<BaseResponse>() {
        @Override
        public BaseResponse createFromParcel(Parcel source) {
            return new BaseResponse(source);
        }

        @Override
        public BaseResponse[] newArray(int size) {
            return new BaseResponse[size];
        }
    };
    @SerializedName("Status")
    @Expose
    private int Status;
    @SerializedName("Count")
    @Expose
    private int Count;
    @SerializedName("Message")
    @Expose
    private String Message;
    @SerializedName("Data")
    @Expose
    private String Data;

    public BaseResponse() {
    }

    private BaseResponse(Parcel in) {
        this.Status = in.readInt();
        this.Count = in.readInt();
        this.Message = in.readString();
        this.Data = in.readString();
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.Status);
        dest.writeInt(this.Count);
        dest.writeString(this.Message);
        dest.writeString(this.Data);
    }
}
