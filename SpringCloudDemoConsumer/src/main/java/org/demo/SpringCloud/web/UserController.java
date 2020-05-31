package org.demo.SpringCloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/userConsumer")
public class UserController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/getUser/{inputData}")
    public Object getUser(@PathVariable String inputData) {

        String eurekaServiceUrl = "http://";  //http://127.0.0.1:9000
        String eurekaProviderAppName = "/SpringCloudDemoProvider";
        eurekaProviderAppName = "SpringCloudDemoProvider";
        String providerPathName = "/userProvider/getUser/";

        eurekaServiceUrl = eurekaServiceUrl + eurekaProviderAppName + providerPathName + inputData;

//		return  restTemplate.getForObject("http://127.0.0.1:8081/user/getUser/"+userId, Object.class);
        return restTemplate.getForObject(eurekaServiceUrl, String.class);
    }


}
