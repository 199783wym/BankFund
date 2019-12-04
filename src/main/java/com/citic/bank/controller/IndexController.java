package com.citic.bank.controller;

import com.citic.bank.dto.ProductDTO;
import com.citic.bank.model.Product;

import com.citic.bank.service.ProductService;
import com.citic.bank.util.Layui;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

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
    public String searchName(String name,
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
        model.addAttribute("key",name);
        if(name!=null || !name.equals("")){
            return "index.jsp";
        }else{
            return "search.jsp";
        }

    }

    @RequestMapping("/index")
    @ResponseBody
    public Layui list1(@RequestParam Map<String, Object> params){
        //查询列表数据
        List<ProductDTO> productList1= productService.queryProductAll();
        int total = 10;
        return Layui.data(total, productList1);
    }
    @RequestMapping("/tabtwo")
    @ResponseBody
    public Layui list2(@RequestParam Map<String, Object> params){
        //查询列表数据
        List<ProductDTO> productList2= productService.queryProduct1();
        int total = 10;
        return Layui.data(total, productList2);
    }

    @RequestMapping("/tabthree")
    @ResponseBody
    public Layui list3(@RequestParam Map<String, Object> params){
        //查询列表数据
        List<ProductDTO> productList2= productService.queryProduct2();
        int total = 10;
        return Layui.data(total, productList2);
    }

    @RequestMapping("/tabfour")
    @ResponseBody
    public Layui list4(@RequestParam Map<String, Object> params){
        //查询列表数据
        List<ProductDTO> productList2= productService.queryProduct3();
        int total = 10;
        return Layui.data(total, productList2);
    }

    @RequestMapping("/tabfive")
    @ResponseBody
    public Layui list5(@RequestParam Map<String, Object> params){
        //查询列表数据
        List<ProductDTO> productList2= productService.queryProduct4();
        int total = 10;
        return Layui.data(total, productList2);
    }
    @RequestMapping("/searchList")
    @ResponseBody
    public Layui searchList(String key){
        //查询列表数据
        List<ProductDTO> productDTOS=productService.query(key);
        int total = 10;
        return Layui.data(total, productDTOS);
    }
}
