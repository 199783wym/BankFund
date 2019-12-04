package com.citic.bank.controller;

import com.citic.bank.model.Compy;
import com.citic.bank.model.Product;
import com.citic.bank.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: ym
 * @Date: 2019/12/3 16:52
 * @Version 1.0
 */
@Controller
public class ProductShowController {

    @Autowired
    private ProductService productService;


    @RequestMapping("/product/{id}")
    public String showProduct(@PathVariable(name="id")Long id,Model model) {
        Product product= new Product();
        product = productService.showProduct(id);
        Compy compy=new Compy();
        compy = productService.queryComy(product.getCompyName());
        model.addAttribute("product", product);
        model.addAttribute("compy", compy);
        return "/product.jsp";
    }
}
