package me.qinchao.example.controller;

import me.qinchao.example.domain.in.UserDTO;
import me.qinchao.example.domain.in.UserVO;
import me.qinchao.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by sulvto on 02/09/2020.
 *
 * @author sulvto
 * @version $Id: UserController.java, v0.1 02/09/2020 11:47 sulvto Exp$$
 */
@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    List<UserVO> list() {
        return userMapper.selectAll();
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    String index(@RequestBody UserDTO user) {
        userMapper.insert(user);
        return "ok";
    }
}
