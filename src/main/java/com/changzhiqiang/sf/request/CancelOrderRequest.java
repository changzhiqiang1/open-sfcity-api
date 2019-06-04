package com.changzhiqiang.sf.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: changzhiqiang
 * @Date: 2019-05-22 10:23
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CancelOrderRequest extends BaseRequest {

    /**
     * 取消原因
     */
    @JsonProperty("cancel_reason")
    private String cancelReason;
    /**
     * 订单ID
     */
    @JsonProperty("order_id")
    private String orderId;

    /**
     * 查询订单ID类型
     * 1、顺丰订单号 2、商家订单号
     */
    @JsonProperty("order_type")
    private Integer orderType;

}
