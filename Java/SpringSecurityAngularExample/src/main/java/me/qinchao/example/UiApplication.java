package me.qinchao.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@SpringBootApplication
@Controller
public class UiApplication {

  @GetMapping(value = "/{path:[^\\.]*}")
  public String redirect() {
    return "forward:/";
  }

  @RequestMapping("/resource")
  public Map<String,Object> home() {
    Map<String,Object> model = new HashMap<String,Object>();
    model.put("id", UUID.randomUUID().toString());
    model.put("content", "Hello World");
    return model;
  }

  @RequestMapping("/user")
  @ResponseBody
  public Principal user(Principal user) {
    return user;
  }

  @Configuration
  protected static class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    @Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
    protected void configure(HttpSecurity http) throws Exception {
      // @formatter:off
      http
          .formLogin().loginPage("/login").successForwardUrl("/user").and()
          .logout().and()
          .authorizeRequests()
            .antMatchers("/index.html", "/", "/home", "/*.js", "/*.js.map", "/favicon.ico").permitAll()
            .anyRequest().authenticated()
            .and()
          .csrf()
            .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
      // @formatter:on
    }

     @Autowired
     public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
         auth.userDetailsService(userDetailsService).passwordEncoder(new PasswordEncoder() {
             @Override
             public String encode(CharSequence charSequence) {
                 return charSequence.toString();
             }

             @Override
             public boolean matches(CharSequence charSequence, String s) {
                 return charSequence.toString().equals(s);
             }
         });
     }
  }

  public static void main(String[] args) {
    SpringApplication.run(UiApplication.class, args);
  }

}

