package me.qinchao.example.config;

import me.qinchao.example.config.ApiAuthFilter;
import me.qinchao.example.realm.NotingToDoRealm;
import me.qinchao.example.realm.TokenRealm;
import org.apache.shiro.authc.Authenticator;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by sulvto on 2/12/19.
 */
@Configuration
public class ShiroConfig {
    @Bean
    public ShiroFilterFactoryBean filterFactoryBean(DefaultWebSecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        HashMap<String, Filter> filters = new HashMap<>();
        filters.put("apiAuthFilter", apiAuthFilter());
        shiroFilterFactoryBean.setFilters(filters);

        shiroFilterFactoryBean.setLoginUrl("/api/login");
        shiroFilterFactoryBean.setSuccessUrl("/api/userinfo");
        shiroFilterFactoryBean.setUnauthorizedUrl("/api/error");

        HashMap<String, String> filterChainDefinitionMap = new HashMap<>();
        filterChainDefinitionMap.put("/api/login", "anon");
        filterChainDefinitionMap.put("/api/logout", "logout");
        filterChainDefinitionMap.put("/api/*", "apiAuthFilter");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);

        return shiroFilterFactoryBean;
    }

    @Bean
    public DefaultWebSecurityManager webSecurityManager() {
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        defaultWebSecurityManager.setAuthenticator(modularRealAuthenticator());
        ArrayList<Realm> realmList = new ArrayList<>();
        realmList.add(tokenRealm());
        realmList.add(nothingToDoRealm());
        defaultWebSecurityManager.setRealms(realmList);
        return defaultWebSecurityManager;
    }

    @Bean
    private Realm nothingToDoRealm() {
        return new NotingToDoRealm();
    }

    private Realm tokenRealm() {
        return new TokenRealm();
    }

    public Authenticator modularRealAuthenticator() {

    }

    @Bean
    public ApiAuthFilter apiAuthFilter() {
        return new ApiAuthFilter();
    }
}
