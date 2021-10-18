package cn.lml.service;

import cn.lml.entity.Product;

import java.util.List;

/**
 * @author mlNothing
 * @date 2021/10/14 10:20
 */
public interface ProductService {
    //根据id查询
    Product findById(Long id);

    //查询全部
    List  findAll();
    //删除
    void deleteById(Long id);

    void update(Product product);
}
