package com.citic.bank.service;

import com.citic.bank.model.Compy;
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
    List<Product> queryProductAll();
    List<Product> queryProduct1();
    List<Product> queryProduct2();
    List<Product> queryProduct3();
    List<Product> queryProduct4();
    //点击基金后的展示页面
    Product showProduct(Long id);
    //查找基金公司信息
    Compy queryComy(String name);
}
