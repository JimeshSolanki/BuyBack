package com.campbuyback.buyback.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductModel implements Parcelable {

    public static final Parcelable.Creator<ProductModel> CREATOR = new Parcelable.Creator<ProductModel>() {
        @Override
        public ProductModel createFromParcel(Parcel source) {
            return new ProductModel(source);
        }

        @Override
        public ProductModel[] newArray(int size) {
            return new ProductModel[size];
        }
    };
    @SerializedName("Id")
    @Expose
    private int Id;
    @SerializedName("ProductName")
    @Expose
    private String ProductName;
    @SerializedName("Description")
    @Expose
    private String Description;
    @SerializedName("ImageName")
    @Expose
    private String ImageName;
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;
    @SerializedName("SubCategoryName")
    @Expose
    private String SubCategoryName;
    @SerializedName("Price")
    @Expose
    private double Price;
    @SerializedName("SubCatId")
    @Expose
    private int SubCatId;

    public ProductModel() {
    }

    private ProductModel(Parcel in) {
        this.Id = in.readInt();
        this.ProductName = in.readString();
        this.Description = in.readString();
        this.ImageName = in.readString();
        this.CategoryName = in.readString();
        this.SubCategoryName = in.readString();
        this.Price = in.readDouble();
        this.SubCatId = in.readInt();
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImageName() {
        return ImageName;
    }

    public void setImageName(String imageName) {
        ImageName = imageName;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getSubCategoryName() {
        return SubCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        SubCategoryName = subCategoryName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getSubCatId() {
        return SubCatId;
    }

    public void setSubCatId(int subCatId) {
        SubCatId = subCatId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.Id);
        dest.writeString(this.ProductName);
        dest.writeString(this.Description);
        dest.writeString(this.ImageName);
        dest.writeString(this.CategoryName);
        dest.writeString(this.SubCategoryName);
        dest.writeDouble(this.Price);
        dest.writeInt(this.SubCatId);
    }
}
