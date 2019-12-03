package com.citic.bank.controller;

import com.citic.bank.model.Product;

import com.citic.bank.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
        List<Product> productList= productService.queryProduct(product);
        model.addAttribute("productList", productList);
        return "index.jsp";
    }
}
