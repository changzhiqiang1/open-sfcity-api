package com.changzhiqiang.sf.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @Author: changzhiqiang
 * @Date: 2019-05-24 20:35
 */
@Data
public class CancelOrderResponse {

    /**
     * 取消原因
     */
    @JsonProperty("cancel_reason")
    private String cancelReason;

    /**
     * 顺丰订单号
     */
    @JsonProperty("sf_order_id")
    private String sfOrderId;

    /**
     * 商家订单号
     */
    @JsonProperty("shop_order_id")
    private String shopOrderId;
}
