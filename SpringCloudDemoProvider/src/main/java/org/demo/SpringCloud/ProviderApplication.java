package org.demo.SpringCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient  //启用eureka 注册服务客户端
@EnableSwagger2

//com.pflm.**：  是需要监控的项目包名
//com.github.qinxuewu.cor   ：是暴露给外部访问的监控端点包（actuator-service-1.0.jar中的controller）
@ComponentScan("org.demo.SpringCloud.**,com.github.qinxuewu.core")
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
