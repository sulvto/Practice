package me.qinchao.pss.service.impl;

import me.qinchao.pss.domain.Employee;
import me.qinchao.pss.domain.Role;
import me.qinchao.pss.service.IEmployeeService;
import me.qinchao.pss.service.IOauth2LoginService;
import org.apache.commons.codec.Charsets;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.struts2.json.JSONException;
import org.apache.struts2.json.JSONUtil;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * Created by sulvto on 16-6-30.
 */
public class Oauth2LoginServiceImpl implements IOauth2LoginService {
    CloseableHttpClient httpClient = HttpClients.createDefault();

    private IEmployeeService employeeService;

    public void setEmployeeService(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public String getAccessToken(String code) throws IOException {
        String redirect_uri = null;
        try {
            redirect_uri = URLEncoder.encode("http://127.0.0.1:8080/main.action", Charsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        HttpPost httpPost = new HttpPost(ACCESSTOKEN_URL);

        List<NameValuePair> paramList = new ArrayList<>();
        paramList.add(new BasicNameValuePair("client_id", CLIENT_ID));
        paramList.add(new BasicNameValuePair("client_secret", CLIENT_SECRET));
        paramList.add(new BasicNameValuePair("grant_type", GRANT_TYPE));
        paramList.add(new BasicNameValuePair("code", code));
        paramList.add(new BasicNameValuePair("redirect_uri", redirect_uri));

        httpPost.setEntity(new UrlEncodedFormEntity(paramList, Charsets.UTF_8));

        HttpResponse response = httpClient.execute(httpPost);
        HttpEntity entity = response.getEntity();

        return EntityUtils.toString(entity);
    }

    @Override
    public Employee accessEmployee(String code) throws IOException, JSONException {
        String objectJSONString = getAccessToken(code);
        Map map = (Map) JSONUtil.deserialize(objectJSONString);
        String username = (String) map.get("username");
        Long uid = Long.valueOf((String) map.get("uid"));

        Employee employee = employeeService.findByUid(uid);
        if (employee == null) {
            employee = new Employee();
            employee.setName(username);
            employee.setUid(uid);
            HashSet<Role> roles = new HashSet<>();

            // TODO 将无法获取菜单树
//            Role role = new Role();
//            role.setId();
//            roles.add(role);
//            employee.setRoles(roles);
            //
            employeeService.save(employee);
        }
        return employee;
    }
}
