package me.qinchao.service.impl;

import com.google.common.collect.Lists;
import me.qinchao.domain.Oauth2Client;
import me.qinchao.domain.User;
import me.qinchao.service.Oauth2ClientService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Created by sulvto on 16-6-30.
 */
@Service
public class Oauth2ClientServiceImpl implements Oauth2ClientService {
    private List<Oauth2Client> oauth2ClientList;

    {
        oauth2ClientList = new ArrayList<>();
        Oauth2Client oauth2Client = new Oauth2Client();
        oauth2Client.setId(1);
        oauth2Client.setClientId("aaaa");
        oauth2Client.setClientName("pss");
        oauth2Client.setClientSecret("1234567890");
        oauth2ClientList.add(oauth2Client);
    }

    @Override
    public Oauth2Client find(String clientId) {
        Optional<Oauth2Client> first = oauth2ClientList.stream().filter(oauth2Client -> oauth2Client.getClientId().equals(clientId)).findFirst();
        if (first.isPresent()) {
            return first.get();
        } else {
            return null;
        }
    }

    @Override
    public List<Oauth2Client> findAll() {
        List<Oauth2Client> clientList = new ArrayList<>();
        Collections.copy(clientList, oauth2ClientList);
        return clientList;
    }

    @Override
    public boolean checkClient(String clientId, String clientSecret) {
        return oauth2ClientList.stream().filter(oauth2Client -> oauth2Client.getClientId().equals(clientId) && oauth2Client.getClientSecret().equals(clientSecret)).findFirst().isPresent();
    }
}
