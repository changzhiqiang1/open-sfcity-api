package com.changzhiqiang.sf.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @Author: changzhiqiang
 * @Date: 2019-05-24 19:08
 */
@Data
public class ChangeOrderResponse extends BaseResponse {

    /**
     * 配送员电话
     */
    @JsonProperty("operator_phone")
    private String operatorPhone;

    /**
     * 配送员位置经度
     */
    @JsonProperty("rider_lng")
    private String riderLng;

    /**
     * 配送员位置经度
     */
    @JsonProperty("rider_lat")
    private String riderLat;

}
