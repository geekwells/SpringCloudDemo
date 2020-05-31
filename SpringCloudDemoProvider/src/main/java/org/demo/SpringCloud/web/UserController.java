package org.demo.SpringCloud.web;


import cn.hutool.core.date.DateUtil;
import org.demo.SpringCloud.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
