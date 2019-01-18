package me.qinchao.example.controller;

import com.alibaba.fastjson.JSONObject;
import me.qinchao.example.config.Constant;
import me.qinchao.example.model.User;
import me.qinchao.example.utils.Response;
import me.qinchao.example.utils.TokenUtil;
import me.qinchao.example.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api")
public class LoginController {
    private final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String login(@RequestBody User loginUser, HttpServletResponse response) {
        User user = userRepository.findByUsernameAndPassword(loginUser.getUsername(), loginUser.getPassword());

        if (user != null) {
            user.setPassword(null);

            String token = TokenUtil.createJWT(Constant.JWT_ID, TokenUtil.generalSubject(user), Constant.JWT_TTL);

            JSONObject responseData = new JSONObject();
            responseData.put("token", token);
            responseData.put("type", "bearer");
            responseData.put("userinfo", user);
            response.addCookie(new Cookie("token", token));
            return Response.success("登录成功", responseData);
        } else {
            response.addCookie(new Cookie("token", ""));
            return Response.error(-1, "用户名或密码错误");
        }
    }

    @PostMapping("/logout")
    public String logout(HttpServletResponse response) {
        response.addCookie(new Cookie("token", ""));

        return Response.success();
    }

    @GetMapping("/me")
    public String me(HttpServletRequest request, HttpServletResponse response) {
        User user = (User) request.getAttribute(Constant.ATTR_USER);

        logger.info("/me {}", user);
        if (user != null) {
            return Response.success("", user);
        } else {
            logger.error("/me user is null");
            return Response.error(-1, "用户未登录");
        }
    }
}

