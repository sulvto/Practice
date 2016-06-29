package me.qinchao.service;

import me.qinchao.domain.Oauth2Client;

import java.util.List;

/**
 * Created by sulvto on 16-6-30.
 */
public interface Oauth2ClientService {
    Oauth2Client find(String clientId);

    List<Oauth2Client> findAll();

    boolean checkClient(String clientId, String clientSecret);
}
