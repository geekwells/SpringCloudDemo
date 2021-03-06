package org.demo.springcloud.web;


import cn.hutool.core.date.DateUtil;
import org.demo.springcloud.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户信息查询
 */
@RestController
@RequestMapping("/userProvider")
public class UserController {

    final Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${user.name}")
    private String userName;
    @Value("${user.age}")
    private int userAge;

    @Value("${user.defaultName}")
    private String defualtName;

    // {入参} @PathVariable 参数绑定

    /**
     * 用户信息查询 ！
     *
     * @param userId 银行id
     * @return User 用户信息
     */
    @GetMapping(value = "/getUser/{userId}")
    public User getUser(@PathVariable String userId) {
        logger.info("======getUser param = [{}]", userId);
        User user = new User();
        user.setUserId(userId);
        user.setName(userName + "|" + DateUtil.today());
        user.setSex(DateUtil.now());
        user.setAge(userAge);

        logger.info("======getUser resp = [{}]", user.toString());
        return user;
    }

    @GetMapping("/getUserName")
    public String getUserName() {

        return defualtName;

    }

    /**
     * 查询用户数据
     *
     * @param user 用户 查询信息 条件
     * @return 用户信息列表
     */
    @PostMapping("queryUser")
    public List<User> queryUser(@RequestBody User user) {
        List<User> respUserList = new ArrayList<User>();
        //查询是数据库
//        respUserList = serveric.select(user);
        respUserList.add(user);

        return respUserList;
    }

}
