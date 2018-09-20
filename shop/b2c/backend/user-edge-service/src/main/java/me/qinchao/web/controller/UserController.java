package me.qinchao.web.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import me.qinchao.web.domain.User;
import me.qinchao.web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

import static me.qinchao.web.Response.notFound;
import static me.qinchao.web.Response.success;

/**
 * Created by sulvto on 9/20/18.
 */
@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @ApiOperation(value = "创建用户", notes = "")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @PostMapping()
    public @ResponseBody
    String addNewUser(@RequestBody User user) {
        userRepository.save(user);
        return success();
    }

    @ApiOperation(value = "获取用户详细信息", notes = "根据用户ID获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @GetMapping("/{id}")
    public String getUser(@PathVariable Long id, HttpServletResponse httpServletResponse) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return success(user.get());
        } else {
            return notFound(httpServletResponse);
        }
    }


    @ApiOperation(value = "更新用户详细信息", notes = "更新ID指定的用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "user", value = "用户详细实体", required = true, dataType = "User")
    })
    @PutMapping("/{id}")
    public @ResponseBody
    String updateUser(@PathVariable Long id, @RequestBody User user, HttpServletResponse httpServletResponse) {
        Optional<User> updateUser = userRepository.findById(id);
        if (updateUser.isPresent()) {
            User saveUser = updateUser.get();
            saveUser.setAge(user.getAge());
            userRepository.save(saveUser);
            return success();
        } else {
            return notFound(httpServletResponse);
        }
    }


    @ApiOperation(value = "删除用户", notes = "删除ID指定的用户")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @DeleteMapping()
    public @ResponseBody
    String deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return success();
    }

    @GetMapping()
    @ApiOperation(value = "获取用户列表", notes = "")
    public String getAllUsers() {
        return success(userRepository.findAll());
    }

}
