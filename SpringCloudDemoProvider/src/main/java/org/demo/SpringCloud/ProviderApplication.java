package org.demo.SpringCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //启用eureka 组车服务客户端
public class ProviderApplication {

    public static void main(String[] args) {
        // TODO Auto-generated method stub dd
        SpringApplication.run(ProviderApplication.class, args);
    }

}
