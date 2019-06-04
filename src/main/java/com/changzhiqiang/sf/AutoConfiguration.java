package com.changzhiqiang.sf;

import com.changzhiqiang.sf.constant.ApiUrlConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: changzhiqiang
 * @Date: 2019-05-22 10:23
 */
@Configuration
@EnableConfigurationProperties(Properties.class)
@Slf4j
public class AutoConfiguration {

    private Properties sfCityProperties;

    @Autowired
    public AutoConfiguration(Properties sfCityProperties) {
        this.sfCityProperties = sfCityProperties;
        ApiUrlConstant.setSfCityHost(sfCityProperties.getApiUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    public SfClient sfClient() {
        SfClient sfClient = new SfClient(
                sfCityProperties.getDeveloperId(),
                sfCityProperties.getDeveloperKey(),
                sfCityProperties.getShopId()
        );
        return sfClient;
    }
}
