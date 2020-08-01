package org.demo.springcloud;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableEurekaClient  //启用eureka 注册服务客户端
//@EnableSwagger2
@MapperScan({"org.demo.springcloud"})
public class ProviderApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(ProviderApplication.class, args);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
