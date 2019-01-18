package me.qinchao.example.utils;

import io.vertx.core.json.JsonObject;

/**
 * Created by sulvto on 1/17/19.
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
        JsonObject result = new JsonObject();
        result.put("status", status);
        result.put("message", message);
        result.put("data", data);

        return result.encode();
    }
}
