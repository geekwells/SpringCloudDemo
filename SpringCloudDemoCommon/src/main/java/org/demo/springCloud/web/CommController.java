package org.demo.springCloud.web;


import cn.hutool.core.date.DateUtil;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comm")
public class CommController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/test/{inputData}")
    public Object test(@PathVariable("inputData") String inputData) {
        System.out.println("=====控制台输出 = " + inputData);
        logger.info("=======> 日志打印 = [{}]", inputData);

        return inputData + "<br/>" + DateUtil.now();
    }
}
