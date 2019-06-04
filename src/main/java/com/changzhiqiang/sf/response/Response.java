package com.changzhiqiang.sf.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @Author: changzhiqiang
 * @Date: 2019-05-22 10:23
 */
@Data
public class Response {
    @JsonProperty("error_code")
    private Integer errorCode;

    @JsonProperty("error_msg")
    private String errorMsg;

    /**
     * 详细报错信息（报错的时候非空）
     */
    @JsonProperty("error_data")
    private Object errorData;

    @JsonProperty("result")
    private Object result;
}
