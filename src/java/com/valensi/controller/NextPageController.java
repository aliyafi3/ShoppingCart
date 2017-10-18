/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nextpage")
public class NextPageController {
    
    @RequestMapping()
    public String welcome(HttpSession session,Model model) {
        //User user = (User) session.getAttribute("user");
        //user.getCarts().add("Supra");
        return "nextpage";
    }
    
}
