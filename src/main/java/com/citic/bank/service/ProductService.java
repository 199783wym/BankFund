package com.citic.bank.service;

import com.citic.bank.dto.ProductDTO;
import com.citic.bank.model.Compy;
import com.citic.bank.model.Product;
import com.citic.bank.model.Trade;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ym
 * @Date: 2019/12/3 11:55
 * @Version 1.0
 */

public interface ProductService {
    //首页根据 基金风险类型查基金
    List<ProductDTO> queryProductAll();
    List<ProductDTO> queryProduct1();
    List<ProductDTO> queryProduct2();
    List<ProductDTO> queryProduct3();
    List<ProductDTO> queryProduct4();
    //点击基金后的展示页面
    Product showProduct(Long id);
    //查找基金公司信息
    Compy queryComy(String name);

    int insert(Trade trade);

    List<ProductDTO> query(String name);
}
