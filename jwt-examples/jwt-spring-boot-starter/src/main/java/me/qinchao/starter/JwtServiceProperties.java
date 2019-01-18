package me.qinchao.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by sulvto on 1/18/19.
 */
@ConfigurationProperties(prefix = "jwt")
public class JwtServiceProperties {

    // 密钥
    private String base64Security;
    private String issuer;

    public String getBase64Security() {
        return base64Security;
    }

    public void setBase64Security(String base64Security) {
        this.base64Security = base64Security;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }
}
