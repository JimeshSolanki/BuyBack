package com.campbuyback.buyback.util;

public class AppConstant {

    public final static String BASE_URL = "http://192.168.0.110:3030/api/";

    public final static int TOAST_SUCCESS = 1;
    public final static int TOAST_INFO = 2;
    public final static int TOAST_WARNING = 3;
    public final static int TOAST_ERROR = 4;

    //region API Binding URL

    //region USER API Constants
    private final static String USER_MAIN = BASE_URL + "user/";
    public final static String USER_LIST = USER_MAIN + "list";
    public final static String USER_BY_ID = USER_MAIN + "getbyid";
    public final static String USER_CRUD = USER_MAIN + "manage";
    //endregion

    //region PRODUCT API Constants
    private final static String PRODUCT_MAIN = BASE_URL + "product/";
    public final static String PRODUCT_LIST = PRODUCT_MAIN + "list";
    public final static String PRODUCT_BY_ID = PRODUCT_MAIN + "getbyid";
    public final static String PRODUCT_CRUD = PRODUCT_MAIN + "manage";
    //endregion

    //endregion
}
