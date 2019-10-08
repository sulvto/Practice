package me.qinchao.example.token;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * Created by sulvto on 2/12/19.
 */
public class ApiToken implements AuthenticationToken {
    private String preKey;
    private String signature;

    public ApiToken(String preKey, String signature) {
        this.preKey = preKey;
        this.signature = signature;
    }

    public String getPreKey() {
        return preKey;
    }

    public void setPreKey(String preKey) {
        this.preKey = preKey;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public Object getPrincipal() {
        return preKey;
    }

    @Override
    public Object getCredentials() {
        return signature;
    }
}
