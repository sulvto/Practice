package me.qinchao.example.controller;

import com.alibaba.fastjson.JSONObject;
import me.qinchao.example.config.Constant;
import me.qinchao.example.utils.Response;
import me.qinchao.example.utils.TokenUtil;
import me.qinchao.example.model.User;
import me.qinchao.example.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by sulvto on 1/17/19.
 */
@Controller
@RequestMapping("/api")
public class LoginController {
    private final static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    String login(@RequestBody User loginUser, HttpServletResponse response) {
        logger.info("login: {}", loginUser.getUsername());
        User user = userService.findByUsername(loginUser.getUsername());
        if (user != null && user.getPassword().equals(loginUser.getPassword())) {
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

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    @ResponseBody
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        User user = (User) request.getAttribute(Constant.ATTR_USER);
        logger.info("logout: {}", user.getUsername());
        response.addCookie(new Cookie("token", ""));

        return Response.success("登录");
    }

    @RequestMapping(value = "/me", method = RequestMethod.GET)
    @ResponseBody
    String userinfo(HttpServletRequest request) {
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
