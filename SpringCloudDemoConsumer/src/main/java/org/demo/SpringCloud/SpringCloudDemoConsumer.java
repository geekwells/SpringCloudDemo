package org.demo.SpringCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class SpringCloudDemoConsumer {

    @Bean
    @LoadBalanced //切记一定要有这个 ，负载均衡注解 ，否则无法服务到 eureka服务
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemoConsumer.class, args);
    }

}
