package me.qinchao.user.response;

/**
 * Created by sulvto on 18-8-2.
 */
public class LoginResponse extends Response {
    private String token;

    public LoginResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
