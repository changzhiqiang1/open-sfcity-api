package com.changzhiqiang.sf;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: changzhiqiang
 * @Date: 2019-05-22 10:23
 */
@ConfigurationProperties(prefix = "sf.city")
@Data
public class Properties {

    private Long developerId;

    private String developerKey;

    private String shopId;

    private String apiUrl;

}