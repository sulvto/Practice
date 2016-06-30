package me.qinchao.service.impl;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import me.qinchao.domain.User;
import me.qinchao.service.OAuthService;
import me.qinchao.service.Oauth2ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Created by sulvto on 16-6-29.
 */
@Service
public class OAuthServiceImpl implements OAuthService {
   private Cache<String, User> accessTokenCache = CacheBuilder.newBuilder().expireAfterAccess(7, TimeUnit.DAYS).build();
   private Cache<String, User> authCodeCache = CacheBuilder.newBuilder().expireAfterAccess(1, TimeUnit.HOURS).build();

    @Autowired
    private Oauth2ClientService oauth2ClientService;

    @Override
    public void addAuthCode(String authCode, User user) {
        authCodeCache.put(authCode, user);
    }

    @Override
    public void addAccessToken(String accessToken, User user) {
        accessTokenCache.put(accessToken, user);
    }

    @Override
    public boolean checkAuthCode(String authCode) {
        return authCodeCache.getIfPresent(authCode) != null;
    }

    @Override
    public boolean checkAccessToken(String accessToken) {
        return accessTokenCache.getIfPresent(accessToken) != null;
    }

    @Override
    public User getUserByAuthCode(String authCode) {
        return authCodeCache.getIfPresent(authCode);
    }

    @Override
    public User getUserByAccessToken(String accessToken) {
        return accessTokenCache.getIfPresent(accessToken);
    }

    @Override
    public long getExpireIn() {
        return TimeUnit.DAYS.toMicros(7);
    }

    @Override
    public boolean checkClient(String clientId, String clientSecret) {
        return oauth2ClientService.checkClient(clientId, clientSecret);
    }

    @Override
    public boolean checkClientId(String clientId) {
        return oauth2ClientService.find(clientId) != null;
    }

}
