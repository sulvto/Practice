package me.qinchao.example;

import me.qinchao.example.domain.UserVO;
import me.qinchao.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sulvto on 03/11/2020.
 *
 * @author sulvto
 * @version $Id: Application.java, v0.1 03/11/2020 15:53 sulvto Exp$$
 */
@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    List<UserVO> list() {
        return userMapper.selectAll();
    }
}
