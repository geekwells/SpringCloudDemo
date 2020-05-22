package org.demo.SpringCloud.web;


import org.demo.springCloud.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userProvider")
public class UserController {
    @Value("${user.name}")
    private String userName;
    @Value("${user.age}")
    private int userAge;

    @Value("${user.defaultName}")
    private String defualtName;

    // {入参} @PathVariable 参数绑定
    @GetMapping(value = "/getUser/{userId}")
    public User getUser(@PathVariable String userId) {
        User user = new User();
        user.setUserId(userId);
        user.setName(userName);
        user.setSex("");
        user.setAge(userAge);

        return user;
    }

    @GetMapping("/getUserName")
    public String getUserName() {

        return defualtName;

    }

}
