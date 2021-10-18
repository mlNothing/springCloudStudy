package cn.lml.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @author mlNothing
 * @date 2021/10/14 10:10
 */
@Data
@Entity
@Table(name="tb_product")
public class Product {
    @Id
    private long id;
    private String productName;
    private Integer status;
    private BigDecimal price;
    private String productDesc;
    private String caption;


}
