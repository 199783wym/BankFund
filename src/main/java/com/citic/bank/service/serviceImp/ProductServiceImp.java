package com.citic.bank.service.serviceImp;

import com.citic.bank.dao.CompyMapper;
import com.citic.bank.dao.ProductMapper;
import com.citic.bank.dao.TradeMapper;
import com.citic.bank.dto.ProductDTO;
import com.citic.bank.model.*;
import com.citic.bank.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    @Autowired
    private TradeMapper tradeMapper;



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
    public List<ProductDTO> queryProductAll() {
        ProductExample productExample=new ProductExample();
        List<Product> products =productMapper.selectByExample(productExample);
        List<ProductDTO> productDTOS=new ArrayList<>();
        for (Product product :
                products) {
            ProductDTO productDTO = new ProductDTO();
            BeanUtils.copyProperties(product,productDTO);
            double min = 0.01;//最小值
            double max = 1.00;//总和
            int scl =  2;//小数最大位数
            int pow = (int) Math.pow(10, scl);//指定小数位
            double unit =Math.floor((Math.random() * (max - min) + min) * pow) / pow;
            double one = Math.floor((Math.random() * (max - min) + min) * pow) / pow;
            double two = Math.floor((Math.random() * (max - min) + min) * pow) / pow;
            double three = Math.floor((Math.random() * (max - min) + min) * pow) / pow;
            productDTO.setDay(one);
            productDTO.setMonth(two);
            productDTO.setYear(three);
            productDTO.setUnit(unit);
            productDTOS.add(productDTO);
        }
        return productDTOS;
    }

    @Override
    public List<ProductDTO> queryProduct1() {
        ProductExample productExample=new ProductExample();
        productExample.createCriteria().andFundTypeEqualTo("货币型");
        List<Product> products =productMapper.selectByExample(productExample);
        List<ProductDTO> productDTOS=new ArrayList<>();
        for (Product product :
                products) {
            ProductDTO productDTO = new ProductDTO();
            BeanUtils.copyProperties(product,productDTO);
            double min = 0.01;//最小值
            double max = 1.00;//总和
            int scl =  2;//小数最大位数
            int pow = (int) Math.pow(10, scl);//指定小数位
            double unit =Math.floor((Math.random() * (max - min) + min) * pow) / pow;
            double one = Math.floor((Math.random() * (max - min) + min) * pow) / pow;
            double two = Math.floor((Math.random() * (max - min) + min) * pow) / pow;
            double three = Math.floor((Math.random() * (max - min) + min) * pow) / pow;
            productDTO.setDay(one);
            productDTO.setMonth(two);
            productDTO.setYear(three);
            productDTO.setUnit(unit);
            productDTOS.add(productDTO);
        }
        return productDTOS;
    }

    @Override
    public List<ProductDTO> queryProduct2() {
        ProductExample productExample=new ProductExample();
        productExample.createCriteria().andFundTypeEqualTo("股票型");
        List<Product> products =productMapper.selectByExample(productExample);
        List<ProductDTO> productDTOS=new ArrayList<>();
        for (Product product :
                products) {
            ProductDTO productDTO = new ProductDTO();
            BeanUtils.copyProperties(product,productDTO);
            double min = 0.01;//最小值
            double max = 1.00;//总和
            int scl =  2;//小数最大位数
            int pow = (int) Math.pow(10, scl);//指定小数位
            double unit =Math.floor((Math.random() * (max - min) + min) * pow) / pow;
            double one = Math.floor((Math.random() * (max - min) + min) * pow) / pow;
            double two = Math.floor((Math.random() * (max - min) + min) * pow) / pow;
            double three = Math.floor((Math.random() * (max - min) + min) * pow) / pow;
            productDTO.setDay(one);
            productDTO.setMonth(two);
            productDTO.setYear(three);
            productDTO.setUnit(unit);
            productDTOS.add(productDTO);
        }
        return productDTOS;
    }

    @Override
    public List<ProductDTO> queryProduct3() {
        ProductExample productExample=new ProductExample();
        productExample.createCriteria().andFundTypeEqualTo("债券型");
        List<Product> products =productMapper.selectByExample(productExample);
        List<ProductDTO> productDTOS=new ArrayList<>();
        for (Product product :
                products) {
            ProductDTO productDTO = new ProductDTO();
            BeanUtils.copyProperties(product,productDTO);
            double min = 0.01;//最小值
            double max = 1.00;//总和
            int scl =  2;//小数最大位数
            int pow = (int) Math.pow(10, scl);//指定小数位
            double unit =Math.floor((Math.random() * (max - min) + min) * pow) / pow;
            double one = Math.floor((Math.random() * (max - min) + min) * pow) / pow;
            double two = Math.floor((Math.random() * (max - min) + min) * pow) / pow;
            double three = Math.floor((Math.random() * (max - min) + min) * pow) / pow;
            productDTO.setDay(one);
            productDTO.setMonth(two);
            productDTO.setYear(three);
            productDTO.setUnit(unit);
            productDTOS.add(productDTO);
        }
        return productDTOS;
    }

    @Override
    public List<ProductDTO> queryProduct4() {
        ProductExample productExample=new ProductExample();
        productExample.createCriteria().andFundTypeEqualTo("保本型");
        List<Product> products =productMapper.selectByExample(productExample);
        List<ProductDTO> productDTOS=new ArrayList<>();
        for (Product product :
                products) {
            ProductDTO productDTO = new ProductDTO();
            BeanUtils.copyProperties(product,productDTO);
            double min = 0.01;//最小值
            double max = 1.00;//总和
            int scl =  2;//小数最大位数
            int pow = (int) Math.pow(10, scl);//指定小数位
            double unit =Math.floor((Math.random() * (max - min) + min) * pow) / pow;
            double one = Math.floor((Math.random() * (max - min) + min) * pow) / pow;
            double two = Math.floor((Math.random() * (max - min) + min) * pow) / pow;
            double three = Math.floor((Math.random() * (max - min) + min) * pow) / pow;
            productDTO.setDay(one);
            productDTO.setMonth(two);
            productDTO.setYear(three);
            productDTO.setUnit(unit);
            productDTOS.add(productDTO);
        }
        return productDTOS;
    }

    @Override
    public int insert(Trade trade) {
        tradeMapper.insert(trade);
        return 1;
    }
}
