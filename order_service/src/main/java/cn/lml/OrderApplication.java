package cn.lml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author mlNothing
 * @date 2021/10/14 14:10
 * 访问地址: http://localhost:9003/order/buy/1,需要先启动shop_service_common
 */
@SpringBootApplication
@EntityScan("cn.lml.entity")
public class OrderApplication {
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
}
