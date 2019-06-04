package com.changzhiqiang.sf.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: changzhiqiang
 * @Date: 2019-05-26 22:49
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ViewH5Request extends BaseRequest {

    /**
     * 订单ID
     */
    @JsonProperty("order_id")
    private String orderId;

    /**
     * 订单类型 1、顺丰订单号 2、商家订单号
     */
    @JsonProperty("order_type")
    private Integer orderType;

}
