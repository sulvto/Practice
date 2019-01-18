package me.qinchao.starter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;
import java.util.Map;

/**
 * Created by sulvto on 1/18/19.
 */
public class JwtUtils {

    /**
     *
     * @param subject
     * @param audience
     * @param issuer
     * @param ttlMillis
     * @param base64Security
     * @return json web token
     */
    public String createJWT(Map subject, String audience, String issuer, long ttlMillis, String base64Security) {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        byte[] secretBytes = DatatypeConverter.parseBase64Binary(base64Security);
        long nowMillis = System.currentTimeMillis();
        Date now = new Date();

        Key signingKey = new SecretKeySpec(secretBytes, signatureAlgorithm.getJcaName());

        // build
        JwtBuilder jwtBuilder = Jwts.builder()
                .setHeaderParam("typ", "JWT")
                .setIssuedAt(now)
                .setIssuer(issuer)
                // json
                .setSubject(subject.toString())
                .setAudience(audience)
                .signWith(signatureAlgorithm, signingKey);

        if (ttlMillis >= 0) {
            long expMillis = nowMillis + ttlMillis;

            Date exp = new Date(expMillis);
            jwtBuilder.setExpiration(exp).setNotBefore(now);
        }

        return jwtBuilder.compact();
    }

    /**
     *
     * @param jsonWebToken
     * @param base64Security
     * @return
     */
    public Claims parseJWT(String jsonWebToken, String base64Security) {
        return Jwts.parser()
                .setSigningKey(DatatypeConverter.parseBase64Binary(base64Security))
                .parseClaimsJws(jsonWebToken).getBody();
    }
}
