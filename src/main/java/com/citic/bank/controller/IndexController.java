package com.citic.bank.controller;

import com.citic.bank.dto.ProductDTO;
import com.citic.bank.model.Product;

import com.citic.bank.service.ProductService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: ym
 * @Date: 2019/12/2 15:20
 * @Version 1.0
 */
@Controller
public class IndexController {

    @Autowired
    private ProductService productService;
    @RequestMapping("/")
    public String index(Product product, Model model){
        List<ProductDTO> productList1= productService.queryProductAll();
        List<ProductDTO> productList2= productService.queryProduct1();
        List<ProductDTO> productList3= productService.queryProduct2();
        List<ProductDTO> productList4= productService.queryProduct3();
        List<ProductDTO> productList5= productService.queryProduct4();
        model.addAttribute("productList1", productList1);
        model.addAttribute("productList2", productList2);
        model.addAttribute("productList3", productList3);
        model.addAttribute("productList4", productList4);
        model.addAttribute("productList5", productList5);
        Collections.sort(productList1,new Comparator<ProductDTO>() {
            @Override
            public int compare(ProductDTO p1, ProductDTO p2) {
                if(p1.getDay()< p2.getDay()){
                    return 1;
                }
                if(p1.getDay() == p2.getDay()){
                    return 0;
                }
                return -1;
            }
        });
        model.addAttribute("productList6", productList1);
        return "index.jsp";
    }

    @RequestMapping("/search")
    public String searchName(@Param(value="searchName")String name,
                             Model model){
        List<ProductDTO> productList1= productService.queryProductAll();
        List<ProductDTO> productDTOS=productService.query(name);
        Collections.sort(productList1,new Comparator<ProductDTO>() {
            @Override
            public int compare(ProductDTO p1, ProductDTO p2) {
                if(p1.getDay()< p2.getDay()){
                    return 1;
                }
                if(p1.getDay() == p2.getDay()){
                    return 0;
                }
                return -1;
            }
        });
        model.addAttribute("productList6", productList1);
        model.addAttribute("productList1",productDTOS);
        return "index";
    }
}
