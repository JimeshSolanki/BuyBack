package com.campbuyback.buyback.network;

import com.campbuyback.buyback.model.BaseResponse;
import com.campbuyback.buyback.model.ProductModel;
import com.campbuyback.buyback.model.UserModel;
import com.google.gson.JsonObject;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.POST;

import static com.campbuyback.buyback.util.AppConstant.PRODUCT_BY_ID;
import static com.campbuyback.buyback.util.AppConstant.PRODUCT_CRUD;
import static com.campbuyback.buyback.util.AppConstant.PRODUCT_LIST;
import static com.campbuyback.buyback.util.AppConstant.USER_BY_ID;
import static com.campbuyback.buyback.util.AppConstant.USER_CRUD;
import static com.campbuyback.buyback.util.AppConstant.USER_LIST;

public interface ApiService {

    //region USER Requests
    @POST(USER_LIST)
    Single<BaseResponse> getAllUsers();

    @POST(USER_BY_ID)
    Single<BaseResponse> getUserDetailsById(@Body JsonObject jsonObject);

    @POST(USER_CRUD)
    Single<BaseResponse> manageUserDetails(@Body UserModel userModel);
    //endregion

    //region PRODUCT Requests
    @POST(PRODUCT_LIST)
    Single<BaseResponse> getAllProducts();

    @POST(PRODUCT_BY_ID)
    Single<BaseResponse> getProductDetailsById(@Body JsonObject jsonObject);

    @POST(PRODUCT_CRUD)
    Single<BaseResponse> manageProductDetails(@Body ProductModel productModel);
    //endregion

}
