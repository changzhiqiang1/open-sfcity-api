package com.changzhiqiang.sf.constant;

/**
 * @Author: changzhiqiang
 * @Date: 2019-05-22 10:23
 */
public class ApiUrlConstant {

    private static String sfCityHost;

    private static final String CREATE_ORDER_URL = "/open/api/external/createorder";

    private static final String PRE_CREATE_ORDER_URL = "/open/api/external/precreateorder";

    private static final String VIEW_H5 = "/open/api/external/riderh5view";

    private static final String CANCEL_ORDER_URL = "/open/api/external/cancelorder";

    public static String getCreateOrderUrl() {
        return sfCityHost.concat(CREATE_ORDER_URL);
    }

    public static String getPreCreateOrderUrl() {
        return sfCityHost.concat(PRE_CREATE_ORDER_URL);
    }

    public static String getViewH5() {
        return sfCityHost.concat(VIEW_H5);
    }

    public static String getCancleOrderUrl() {
        return sfCityHost.concat(CANCEL_ORDER_URL);
    }

    public static void setSfCityHost(String sfCityHost) {
        ApiUrlConstant.sfCityHost = sfCityHost;
    }
}
