package com.changzhiqiang.sf.util;

import com.changzhiqiang.sf.request.BaseRequest;
import com.changzhiqiang.sf.response.Response;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

import java.io.IOException;

/**
 * @Author: changzhiqiang
 * @Date: 2019-05-22 10:23
 */
@Slf4j
public class HttpUtil {

    private static OkHttpClient okHttpClient = new OkHttpClient();
    public static final okhttp3.MediaType JSON
            = okhttp3.MediaType.parse("application/json; charset=utf-8");

    public static Response post(Long appId, String appSecret, String url, BaseRequest baseRequest) {
        String content = JsonUtil.toJsonString(baseRequest);
        String sign = SignUtil.sign(appId.toString(), appSecret, content);

        url = url + "?sign=" + sign;

        RequestBody body = RequestBody.create(JSON, content);

        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();

        log.info("sf request -> {}", content);
        String result = null;
        try {
            okhttp3.Response response = okHttpClient.newCall(request).execute();
            result = response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.info("sf response -> {}", result);
        Response responseData = JsonUtil.toObject(result, Response.class);


        if (responseData.getErrorCode() != 0) {
            throw new RuntimeException("code:" + responseData.getErrorCode() + ",msg:" + responseData.getErrorMsg());
        }
        return responseData;
    }

}
