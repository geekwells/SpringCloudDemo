package org.demo.springcloud.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * springCloud 测试 controller
 */
@RestController
@RequestMapping("/springCloud")
public class TestAppController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${user.name}")
    private String userName;
    @Value("${user.email}")
    private String userEmail;

    /**
     * hello 测试 controller
     *
     * @return String 返回字符串
     */
    @GetMapping("/hello")
    public String hello() {
        StringBuilder tempStr = new StringBuilder();
        tempStr.append("Wellcomem SpringBoot , SpringCloud Test Demo");
        tempStr.append("<br/> name is " + userName);
        tempStr.append("<br/> email is " + userEmail);
        tempStr.append("<br/> email is ssss");
        tempStr.append("<br/> email is ssss");
        tempStr.append("<br/> email is ssss");

        return tempStr.toString();
    }

}
