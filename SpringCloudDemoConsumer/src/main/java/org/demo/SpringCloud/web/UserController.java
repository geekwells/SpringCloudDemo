package org.demo.SpringCloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/userConsumer")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getUser/{inputData}")
    public Object getUser(@PathVariable String inputData) {

        String eurekaServiceUrl = "http://127.0.0.1:9000";
        String eurekaProviderAppName = "/SpringCloudDemoProvider";
        String providerPathName = "/userProvider/getUse/";

        eurekaServiceUrl = eurekaServiceUrl + eurekaProviderAppName + providerPathName + inputData;

//		return  restTemplate.getForObject("http://127.0.0.1:8081/user/getUser/"+userId, Object.class);
        return restTemplate.getForObject(eurekaServiceUrl, Object.class);
    }


}
