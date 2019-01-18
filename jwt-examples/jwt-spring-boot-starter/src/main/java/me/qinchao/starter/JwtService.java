package me.qinchao.starter;

import com.auth0.jwt.interfaces.Claim;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by sulvto on 1/18/19.
 */
public class JwtService {
    @Autowired
    JwtUtils jwtUtils;


    private String base64Security;
    private String issuer;

    public JwtService(String base64Security, String issuer) {
        this.base64Security = base64Security;
        this.issuer = issuer;
    }

    public String createToken(Map map, String audience, long TTLMillis) {
        return jwtUtils.createJWT(map, audience, this.issuer, TTLMillis, this.base64Security);
    }

    public Claims parseToken(String token) {
        return jwtUtils.parseJWT(token, this.base64Security);
    }
}
