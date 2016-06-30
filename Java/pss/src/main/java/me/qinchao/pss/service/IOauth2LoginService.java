package me.qinchao.pss.service;

import me.qinchao.pss.domain.Employee;
import org.apache.struts2.json.JSONException;

import java.io.IOException;

/**
 * created by sulvto on 16-6-30.
 */
public interface IOauth2LoginService {
    public final static String CLIENT_ID = "aaaa";
    public final static String CLIENT_SECRET= "1234567890";
    public final static String GRANT_TYPE= "authorization_code";
    public final static String ACCESSTOKEN_URL= "http://127.0.0.1:8443/oauth2/accessToken";


    String getAccessToken(String code) throws IOException;

    Employee accessEmployee(String code) throws IOException, JSONException;
}
