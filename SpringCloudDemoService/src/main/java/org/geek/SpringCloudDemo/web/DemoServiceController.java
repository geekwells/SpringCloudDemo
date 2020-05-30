package org.geek.SpringCloudDemo.web;


import org.geek.SpringCloudDemo.feign.DemoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController()
@RequestMapping("/service")
public class DemoServiceController {

    @Resource
    private DemoFeign demoFeign;

    @GetMapping("/consumerService/{inputData}")
    public Object consumerService(@PathVariable("inputData") String inputData) {
        return demoFeign.getUser(inputData);

    }

}
