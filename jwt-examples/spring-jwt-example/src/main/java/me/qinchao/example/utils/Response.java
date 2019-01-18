package me.qinchao.example.utils;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;

/**
 * Created by sulvto on 12/28/18.
 */
public class Response {
    public static String success() {
        return success("");
    }

    public static String success(String message) {
        return success(message, null);
    }

    public static String success(String message, Object data) {
        return body(0, message, data);
    }

    public static String error(int status, String message) {
        return body(status, message, null);
    }

    public static String body(int status, String message, Object data) {
        HashMap<String, Object> result = new HashMap<String, Object>();
        result.put("status", status);
        result.put("message", message);
        result.put("data", data);

        return JSON.toJSONString(result);
    }
}
