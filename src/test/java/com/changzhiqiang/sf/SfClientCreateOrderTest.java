package com.changzhiqiang.sf;

import com.changzhiqiang.sf.constant.ApiUrlConstant;
import com.changzhiqiang.sf.request.*;
import com.changzhiqiang.sf.response.CreateOrderResponse;
import com.changzhiqiang.sf.util.DateUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.ProfileValueSourceConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: changzhiqiang
 * @Date: 2019-05-22 10:23
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {AutoConfiguration.class, ApiUrlConstant.class})
@TestPropertySource("classpath:application.properties")
@ProfileValueSourceConfiguration
public class SfClientCreateOrderTest {

    @Autowired
    SfClient sfClient;

    @Test
    public void createOrder() {
        CreateOrderResponse createOrderResponse = sfClient.createOrder(createOrderRequest());

        Assert.assertNotNull(createOrderResponse.getSfOrderId());
    }

    private CreateOrderRequest createOrderRequest() {
        CreateOrderRequest createOrderRequest = new CreateOrderRequest();
        createOrderRequest.setShopOrderId(System.currentTimeMillis() + "");
        createOrderRequest.setOrderSource("测试");
        createOrderRequest.setPayType(1);
        createOrderRequest.setOrderTime(DateUtil.currentSecond().intValue());
        createOrderRequest.setIsAppoint(0);
        createOrderRequest.setIsInsured(0);
        createOrderRequest.setRiderPickMethod(1);
        createOrderRequest.setPushTime(DateUtil.currentSecond().intValue());
        createOrderRequest.setVersion(17);
        createOrderRequest.setShop(
                Shop.builder()
                        .shopName("店铺名")
                        .shopPhone("13266666666")
                        .shopAddress("朝阳区高碑店镇四惠大厦F1-008")
                        .shopLng("116.514236")
                        .shopLat("39.905328")
                        .build()
        );
        createOrderRequest.setReceive(
                Receive.builder()
                        .userName("顺丰同城")
                        .userPhone("18888888888")
                        .userAddress("北京市海淀区学清嘉创大厦A座15层")
                        .userLng("116.3534196")
                        .userLat("40.0159778")
                        .cityName("北京市")
                        .build()
        );
        createOrderRequest.setOrderDetail(
                OrderDetail.builder()
                        .totalPrice(100)
                        .productType(1)
                        .weightGram(500)
                        .productNum(1)
                        .productTypeNum(1)
                        .productDetail(
                                Stream.of(
                                        ProductDetail.builder()
                                                .productName("小炒肉")
                                                .productNum(1)
                                                .build()
                                ).collect(Collectors.toList())
                        )
                        .build()
        );
        return createOrderRequest;
    }
}