package org.geek.SpringCloudDemo.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("SpringCloudDemoProvider")
public interface DemoFeign {

    @GetMapping("/userProvider/getUser/{userId}")
    public Object getUser(@PathVariable("userId") String inputData);

}
