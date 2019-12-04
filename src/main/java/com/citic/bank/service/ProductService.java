package com.citic.bank.service;

import com.citic.bank.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ym
 * @Date: 2019/12/3 11:55
 * @Version 1.0
 */

public interface ProductService {
    //首页根据 基金风险类型查基金
    List<Product> queryProduct(Product product);
}
