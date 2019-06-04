package com.changzhiqiang.sf.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @Author: changzhiqiang
 * @Date: 2019-05-27 10:27
 */
@Data
public class SfCancelOrderResponse extends BaseResponse {

    /**
     * 顺丰取消订单原因
     */
    @JsonProperty("cancel_reason")
    private String cancelReason;


}
