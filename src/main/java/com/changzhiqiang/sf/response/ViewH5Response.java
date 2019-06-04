package com.changzhiqiang.sf.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @Author: changzhiqiang
 * @Date: 2019-05-26 22:53
 */
@Data
public class ViewH5Response {

    /**
     * 配送员电话
     */
    @JsonProperty("url")
    private String url;

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
