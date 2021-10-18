package cn.lml.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author mlNothing
 * @date 2021/10/14 14:54
 * 访问地址：http://localhost:9000/    http://localhost:8000/  开两个端口 进行注册机之间的通信 先运行cLIENT    http://localhost:9002/product/1
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaServer
//@EnableDiscoveryServer
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
