package com.changzhiqiang.sf;

import com.changzhiqiang.sf.constant.ApiUrlConstant;
import com.changzhiqiang.sf.request.CancelOrderRequest;
import com.changzhiqiang.sf.request.CreateOrderRequest;
import com.changzhiqiang.sf.request.ViewH5Request;
import com.changzhiqiang.sf.response.*;
import com.changzhiqiang.sf.util.DateUtil;
import com.changzhiqiang.sf.util.HttpUtil;
import com.changzhiqiang.sf.util.JsonUtil;

/**
 * @Author: changzhiqiang
 * @Date: 2019-05-22 10:23
 */
public class SfClient {
    private Long developerId;

    private String developerKey;

    private String shopId;


    public SfClient(Long developerId, String developerKey, String shopId) {
        this.developerId = developerId;
        this.developerKey = developerKey;
        this.shopId = shopId;
    }

    public CreateOrderResponse createOrder(CreateOrderRequest createOrderRequest) {
        createOrderRequest.setDevId(developerId);
        createOrderRequest.setShopType(1);
        createOrderRequest.setPushTime(DateUtil.currentSecond().intValue());
        createOrderRequest.setShopId(shopId);
        Response response = HttpUtil.post(
                developerId,
                developerKey,
                ApiUrlConstant.getCreateOrderUrl(),
                createOrderRequest
        );
        return JsonUtil.toObject(response.getResult(), CreateOrderResponse.class);
    }

    public ViewH5Response getViewH5Url(ViewH5Request viewH5Request) {
        viewH5Request.setDevId(developerId);
        viewH5Request.setShopType(1);
        viewH5Request.setPushTime(DateUtil.currentSecond().intValue());
        viewH5Request.setShopId(shopId);
        Response response = HttpUtil.post(
                developerId,
                developerKey,
                ApiUrlConstant.getViewH5(),
                viewH5Request
        );
        return JsonUtil.toObject(response.getResult(), ViewH5Response.class);
    }

    public CancelOrderResponse cancelOrder(CancelOrderRequest cancelOrderRequest) {
        cancelOrderRequest.setDevId(developerId);
        cancelOrderRequest.setShopType(1);
        cancelOrderRequest.setPushTime(DateUtil.currentSecond().intValue());
        cancelOrderRequest.setShopId(shopId);
        Response response = HttpUtil.post(
                developerId,
                developerKey,
                ApiUrlConstant.getCancleOrderUrl(),
                cancelOrderRequest
        );
        return JsonUtil.toObject(response.getResult(), CancelOrderResponse.class);
    }


}
