package me.qinchao.user.response;

import java.io.Serializable;

/**
 * Created by sulvto on 18-8-2.
 */
public class Response implements Serializable {
    public static final Response SUCCESS = new Response();
    public static final Response USERNAME_PASSWORD_INVALID = new Response("1001", "username or password invalid");
    public static final Response MOBILE_OR_EMAIL_REQUIRED = new Response("1002", "mobile or email required");
    public static final Response SEND_VERIFYCODE_FAILED = new Response("1003", "send verify code failed");
    public static final Response VERIFYCODE_INVALID = new Response("1004", "verify code invalid");

    private String code;
    private String message;

    public Response() {
        this.code = "0";
        this.message = "";
    }

    public Response(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static Response exception(Exception e) {
        return new Response("9999", e.getMessage());
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
