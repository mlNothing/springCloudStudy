package cn.lml.service.impl;

import cn.lml.dao.ProductDao;
import cn.lml.entity.Product;
import cn.lml.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mlNothing
 * @date 2021/10/14 10:23
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public Product findById(Long id) {
        return productDao.findById(id).get();
    }

    @Override
    public List findAll() {
        return productDao.findAll();
    }


    @Override
    public void deleteById(Long id) {
        productDao.deleteById(id);
    }

    @Override
    public void update(Product product) {
        productDao.save(product);
    }


}
