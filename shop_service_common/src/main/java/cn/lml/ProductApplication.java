package cn.lml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author mlNothing
 * @date 2021/10/14 10:35
 * 访问地址:http：//localhost:9002/product/1
 */
@SpringBootApplication
@EntityScan("cn.lml.entity")
@EnableEurekaClient
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class,args);
    }
}
