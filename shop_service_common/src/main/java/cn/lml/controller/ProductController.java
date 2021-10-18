package cn.lml.controller;

import cn.lml.entity.Product;
import cn.lml.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author mlNothing
 * @date 2021/10/14 10:30
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Value("${server.port}")
    private  String port;
    @Value("${spring.cloud.client.ip-address}")
    private  String ip;
    @GetMapping("/findAll")
    public List findAll() {
        return productService.findAll();
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Product findById(@PathVariable Long id) {
        Product byId = productService.findById(id);
        byId.setProductName("访问的地址"+ip+","+port);
        return productService.findById(id);
    }
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String save(@RequestBody Product product) {
        productService.update(product);
        return "修改成功";
    }
    @RequestMapping("/del/{id}")
    public String deleteById(Long id) {
        productService.deleteById(id);
        return "删除成功";
    }

}
