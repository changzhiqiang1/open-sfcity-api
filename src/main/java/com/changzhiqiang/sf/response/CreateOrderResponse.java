package com.changzhiqiang.sf.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @Author: changzhiqiang
 * @Date: 2019-05-22 10:23
 */
@Data
public class CreateOrderResponse {
    /**
     * 顺丰订单号（标准默认为int，可以设置为string）
     */
    @JsonProperty("sf_order_id")
    private String sfOrderId;

    /**
     * 顺丰运单号（需要设置）
     */
    @JsonProperty("sf_bill_id")
    private String sfBillId;

    /**
     * 商家订单号
     */
    @JsonProperty("shop_order_id")
    private String shopOrderId;

    /**
     * 推送时间
     */
    @JsonProperty("push_time")
    private Integer pushTime;

    /**
     * 以下字段受请求参数中 return_flag 控制：return_flag中未包含的，此字段将不存在，请注意！
     * 1300, //配送费价格，当return_flag中包含1时返回，单位分（值为计算出来此单总价）
     */
    @JsonProperty("total_price")
    private Integer totalPrice;

    /**
     * 配送距离，当return_flag中包含2时返回，单位米（值为计算出来实际配送距离）
     */
    @JsonProperty("delivery_distance_meter")
    private Integer deliveryDistanceMeter;

    /**
     * 商品重量，当return_flag中包含4时返回，单位克（值为下单传入参数回传）
     */
    @JsonProperty("weight_gram")
    private Integer weightGram;


    /**
     *
     */
    @JsonProperty("coupons_total_fee")
    private String couponsTotalFee;

    /**
     *
     */
    @JsonProperty("real_pay_money")
    private String realPayMoney;

    /**
     *
     */
    @JsonProperty("coupons_detail")
    private Object couponsDetail;

}
