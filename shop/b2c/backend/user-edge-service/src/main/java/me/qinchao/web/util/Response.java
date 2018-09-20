package me.qinchao.web.util;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by sulvto on 9/20/18.
 */
public class Response {

    public static String success() {
        return body(0);
    }

    public static String success(Object data) {
        return success("", data);
    }

    public static String success(String message) {
        return success(message, null);
    }

    public static String success(String message, Object data) {
        return body(0, message, data);
    }

    public static String body(int error) {
        return body(error, "");
    }

    public static String body(int error, String message) {
        return body(error, message, null);
    }

    public static String body(int error, String message, Object data) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("error", error);
        jsonObject.put("message", message);
        jsonObject.put("data", data);
        return jsonObject.toJSONString();
    }

    public static String notFound(HttpServletResponse httpServletResponse) {
        httpServletResponse.setStatus(404, "指定的用户不存在");
        return null;
    }
}
