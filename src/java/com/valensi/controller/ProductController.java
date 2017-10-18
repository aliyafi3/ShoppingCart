/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.controller;

import com.valensi.model.Product;
import com.valensi.service.ProductService;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/products")
public class ProductController {
    
    @Autowired
    ProductService ps;
    
    @RequestMapping (value="/list")
    public String showAllProducts (Model model) {
        List<Product> products = ps.findAllProduct();
        model.addAttribute("products", products);
        return "product";
    }
    
    @RequestMapping (value="/{id}")
    public String showOneProduct (@PathVariable Integer id, Model model) {
        Product product = ps.findByProductId(id);
        model.addAttribute("product", product);
        return "productdetail";
    }
}
