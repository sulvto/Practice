package me.qinchao.service;

import me.qinchao.domain.User;

/**
 * Created by sulvto on 16-6-28.
 */
public interface OAuthService {

    void addAuthCode(String authCode, User user);

    void addAccessToken(String accessToken, User user);

    boolean checkAuthCode(String authCode);

    boolean checkAccessToken(String accessToken);

    User getUserByAuthCode(String authCode);

    User getUserByAccessToken(String accessToken);

    long getExpireIn();

    boolean checkClient(String clientId, String clientSecret);

    boolean checkClientId(String clientId);
}
