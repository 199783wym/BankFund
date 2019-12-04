package com.citic.bank.service.serviceImp;

import com.citic.bank.dao.CompyMapper;
import com.citic.bank.dao.ProductMapper;
import com.citic.bank.model.Compy;
import com.citic.bank.model.CompyExample;
import com.citic.bank.model.Product;
import com.citic.bank.model.ProductExample;
import com.citic.bank.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ym
 * @Date: 2019/12/3 13:04
 * @Version 1.0
 */
@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private CompyMapper compyMapper;



    @Override
    public Product showProduct(Long id) {
        Product product=productMapper.selectByPrimaryKey(id);
        return product;
    }

    @Override
    public Compy queryComy(String name) {
        CompyExample compyExample =new CompyExample();
        if(name!=null){
            compyExample.createCriteria().andCompyNameEqualTo(name);
        }
        List<Compy> compys = compyMapper.selectByExample(compyExample);
        Compy compy = compys.get(0);
        return compy;
    }

    @Override
    public List<Product> queryProductAll() {
        ProductExample productExample=new ProductExample();
        return productMapper.selectByExample(productExample);
    }

    @Override
    public List<Product> queryProduct1() {
        ProductExample productExample=new ProductExample();

        productExample.createCriteria().andFundTypeEqualTo("货币型");

        return productMapper.selectByExample(productExample);
    }

    @Override
    public List<Product> queryProduct2() {
        ProductExample productExample=new ProductExample();

        productExample.createCriteria().andFundTypeEqualTo("股票型");

        return productMapper.selectByExample(productExample);
    }

    @Override
    public List<Product> queryProduct3() {
        ProductExample productExample=new ProductExample();

        productExample.createCriteria().andFundTypeEqualTo("债券型");

        return productMapper.selectByExample(productExample);
    }

    @Override
    public List<Product> queryProduct4() {
        ProductExample productExample=new ProductExample();

        productExample.createCriteria().andFundTypeEqualTo("保本型");

        return productMapper.selectByExample(productExample);
    }
}
