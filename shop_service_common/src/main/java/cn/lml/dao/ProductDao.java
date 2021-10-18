package cn.lml.dao;

import cn.lml.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author mlNothing
 * @date 2021/10/14 10:16
 */
public interface ProductDao extends JpaRepository<Product,Long>, JpaSpecificationExecutor<Product> {
}
