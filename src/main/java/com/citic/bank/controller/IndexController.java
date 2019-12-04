package com.citic.bank.controller;

import com.citic.bank.dto.ProductDTO;
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
        return "index.jsp";
    }
}
