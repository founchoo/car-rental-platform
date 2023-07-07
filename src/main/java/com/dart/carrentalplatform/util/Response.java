package com.dart.carrentalplatform.util;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;

import static com.dart.carrentalplatform.util.Constant.FAIL_MSG;
import static com.dart.carrentalplatform.util.Constant.SUCCESS_MSG;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/25/2023 3:52 PM
 */
@Data
@Accessors(chain = true)
public class Response {
    private String message;
    private Integer code;
    private Boolean isSuccess;
    private Map<String, Object> data;

    public static Response success() {
        return new Response()
                .setMessage(SUCCESS_MSG)
                .setIsSuccess(true)
                .setCode(Constant.SUCCESS_CODE)
                .setData(new HashMap<>());
    }

    public static Response fail() {
        return new Response()
                .setMessage(FAIL_MSG)
                .setIsSuccess(false)
                .setCode(Constant.FAIL_CODE)
                .setData(new HashMap<>());
    }

    public Response setData(HashMap<String, Object> data) {
        this.data = data;
        return this;
    }

    public Response setData(String key, Object value) {
        this.data.put(key, value);
        return this;
    }
}
