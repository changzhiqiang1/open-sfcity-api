package com.changzhiqiang.sf.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @Author: changzhiqiang
 * @Date: 2019-05-22 10:23
 */
@Data
public class BaseResponse {

    /**
     * 顺丰订单号（标准默认为int，可以设置为string）
     */
    @JsonProperty("sf_order_id")
    private String sfOrderId;

    /**
     * 商家订单号
     */
    @JsonProperty("shop_order_id")
    private String shopOrderId;

    /**
     * 回调url前缀
     */
    @JsonProperty("url_index")
    private String urlIndex;

    /**
     * 配送员姓名 / 操作人
     */
    @JsonProperty("operator_name")
    private String operatorName;

    /**
     * 配送员位置经度
     */
    @JsonProperty("order_status")
    private Integer orderStatus;

    /**
     * 状态描述
     */
    @JsonProperty("status_desc")
    private String statusDesc;
    
    /**
     * 推送时间
     */
    @JsonProperty("push_time")
    private Integer pushTime;
}
