package me.qinchao.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sulvto on 1/18/19.
 */
@Configuration
@ConditionalOnClass(JwtService.class)
@EnableConfigurationProperties(JwtServiceProperties.class)
public class JwtAutoConfiguration {
    @Autowired
    private JwtServiceProperties jwtServiceProperties;

    @Bean
    public JwtService jwtService() {
        return new JwtService(jwtServiceProperties.getBase64Security(), jwtServiceProperties.getIssuer());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "jwt", value = "enable", havingValue = "true")
    public JwtUtils jwtUtils() {
        return new JwtUtils();
    }
}
