package org.demo.springCloud.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comm")
public class CommController {


    @GetMapping("/test/{inputData}")
    public Object test(@PathVariable("inputData") String inputData) {


        return inputData;
    }
}
