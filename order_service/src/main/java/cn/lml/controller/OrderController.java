package cn.lml.controller;


import cn.lml.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author mlNothing
 * @date 2021/10/14 14:10
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    /**
     * DIScOVERTY
     * springCloud 提供的获取元数据信息
     * @param id
     * @return
     */
    @Autowired
    private DiscoveryClient discoveryClient;


    @RequestMapping(value = "/buy/{id}",method = RequestMethod.GET)
    public Product discoveryClientTest(@PathVariable Long id) {
        Product product =null;
       product = restTemplate.getForObject("http://shop-service-product/product/1", Product.class);
        return product;
    }

//    @RequestMapping(value = "/buy/{id}",method = RequestMethod.GET)
//    public Product findById(@PathVariable Long id) {
//        Product product = restTemplate.getForObject("http://localhost:9002/product/1", Product.class);
//        return product;
//    }
///**
//     * create by: mlNothing
//     * description:  springCloud 提供的获取元数据信息
//     * create time: 2021/10/17 11:32
//     *  * @Param: null
//     * @return
//     */
//    @RequestMapping(value = "/buy/{id}",method = RequestMethod.GET)
//    public Product discoveryClientTest(@PathVariable Long id) {
//        List<ServiceInstance> instances = discoveryClient.getInstances("SHOP-SERVICE-PRODUCT");
////        for (ServiceInstance instance : instances) {
////            System.out.println(instance);
////        }
////        根据元数据中的主机地址和端口号
//        ServiceInstance serviceInstance = instances.get(0);
//        Product product = restTemplate.getForObject("http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/product/1", Product.class);
//        //org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient$EurekaServiceInstance@72f5b174
//        return product;
//    }

}


