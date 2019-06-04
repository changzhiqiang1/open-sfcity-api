package com.changzhiqiang.sf.request;

import lombok.Builder;
import lombok.Data;

/**
 * @Author: changzhiqiang
 * @Date: 2019-05-22 10:23
 */
@Data
@Builder
public class Shop {
    /**
     * string（64）	空	是	店铺名称
     */
    private String shopName;

    /**
     * string（64）	空	是	店铺电话
     */
    private String shopPhone;

    /**
     * string（255）	空	是	店铺地址
     */
    private String shopAddress;

    /**
     * string（32）	空	否	店铺经度
     */
    private String shopLng;

    /**
     * string（32）	空	否	店铺纬度
     */
    private String shopLat;
}
