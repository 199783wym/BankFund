package com.citic.bank;

import com.citic.bank.dao.ProductMapper;
import com.citic.bank.dto.ProductDTO;
import com.citic.bank.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BankApplicationTests {

    @Autowired
    ProductService productService;

    @Autowired
    ProductMapper productMapper;

    @Test
    void contextLoads() {
        List<ProductDTO> query = productService.query("富");
        for (ProductDTO productDTO : query) {
            System.out.printf(productDTO.getFundName());
        }
//        List<ProductDTO> productDTOS = productMapper.selectProductByName("富");
//        System.out.println(productDTOS);

    }

}
