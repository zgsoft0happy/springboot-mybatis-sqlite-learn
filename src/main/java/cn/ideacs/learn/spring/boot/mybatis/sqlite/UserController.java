package cn.ideacs.learn.spring.boot.mybatis.sqlite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * name:
 * date: 2021/6/13            time:  10:57 AM
 * author: Tomas Yang       email: zgsoft_happy@126.com
 * <p>
 * description:
 * <p>
 * version: 1.0.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("getUser/{id}")
    @ResponseBody
    public UserEntity getUser(@PathVariable int id) {
        UserEntity user = userService.findUserById(id);
        return user;

    }

    @RequestMapping("getUsers")
    @ResponseBody
    public List<UserEntity> getUsers() {
        List<UserEntity> users = userService.findUserAll();

        return users;
    }
}
