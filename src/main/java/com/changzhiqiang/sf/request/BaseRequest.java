package com.changzhiqiang.sf.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @Author: changzhiqiang
 * @Date: 2019-05-22 10:27
 */
@Data
public class BaseRequest {
    /**
     * api开发者ID
     */
    @JsonProperty("dev_id")
    private Long devId;

    /**
     * 店铺ID
     * order_type=2时必传shop_id与shop_type
     */
    @JsonProperty("shop_id")
    private String shopId;

    /**
     * 1、顺丰店铺ID 2、接入方店铺ID
     */
    @JsonProperty("shop_type")
    private Integer shopType;

    /**
     * 推单时间	秒级时间戳
     */
    @JsonProperty("push_time")
    private Integer pushTime;
}
