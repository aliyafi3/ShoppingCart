/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.controller;

import com.valensi.model.Cart;
import com.valensi.model.Product;
import com.valensi.service.ProductService;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping(value = "products/shoppingcart")
@SessionAttributes("p")
public class ShoppingCartController {

    @Autowired
    ProductService ps;

    @RequestMapping(value = "/{id}")
    public String orderNow(@PathVariable Integer id, Model model, HttpSession session) {

        Product product = ps.findByProductId(id);
        model.addAttribute("product", product);
        List<Product> products = new ArrayList<>();
        products.add(product);
        session.setAttribute("p", products);
        return "shoppingcart";
//        if (session.getAttribute("p") == null) {
//            List<Cart> cart = new ArrayList<Cart>();
//            cart.add(new Cart(this.ps.findByProductId(id), 1));
//            session.setAttribute("p", cart);
//        } else {
//            List<Cart> cart = (List<Cart>) session.getAttribute("p");
//            
//            int index = isExisting(id, session);
//            if (index == -1) {
//                cart.add(new Cart(this.ps.findByProductId(id), 1));
//            } else {
//                int quantity = cart.get(index).getQuantity() + 1;
//                cart.get(index).setQuantity(quantity);
//            }
//
//            session.setAttribute("p", cart);
//        }

//        return "shoppingcart"; // page name
    
}

private int isExisting(int id, HttpSession session) {
        List<Cart> cart = (List<Cart>)
        session.getAttribute("cart");
        for (int i = 0; i< cart.size(); i++) 
            if (cart.get(i).getProduct().getId() == id)
        return i;
        return -1;
        
            
        }
            
        
        
    
    
}
