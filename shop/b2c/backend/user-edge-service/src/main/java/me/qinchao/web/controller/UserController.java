package me.qinchao.web.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import me.qinchao.web.domain.User;
import me.qinchao.web.exception.UserNotFoundException;
import me.qinchao.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static me.qinchao.web.util.Response.success;

/**
 * Created by sulvto on 9/20/18.
 */
@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "创建用户", notes = "")
    @ApiImplicitParam(name = "user", value = "用户详细实体", required = true, dataType = "User")
    @PostMapping()
    public @ResponseBody
    String addNewUser(@RequestBody User user) {
        userService.add(user);
        return success();
    }

    @ApiOperation(value = "获取用户详细信息", notes = "根据用户ID获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, paramType = "path", dataType = "Long")
    @GetMapping(path = "/{id}")
    public String getUser(@PathVariable Long id) throws UserNotFoundException {
        return success(userService.findById(id));
    }


    @ApiOperation(value = "更新用户详细信息", notes = "更新ID指定的用户详细信息")
    @ApiImplicitParam(name = "user", value = "用户详细实体", required = true, dataType = "User")
    @PutMapping()
    public String updateUser(@RequestBody User user) throws UserNotFoundException {
        return success(userService.update(user));
    }


    @ApiOperation(value = "删除用户", notes = "删除ID指定的用户")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @DeleteMapping(path = "/{id}")
    public String deleteUser(@PathVariable Long id) throws UserNotFoundException {
        return success(userService.deleteById(id));
    }

    @GetMapping()
    @ApiOperation(value = "获取用户列表", notes = "")
    public String getAllUsers() {
        return success(userService.findAll());
    }

}
