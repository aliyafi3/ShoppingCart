/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/welcome")
@SessionAttributes("p")
public class WelcomeController {
    @RequestMapping ()
    public String welcome (Model model) {
        model.addAttribute("msg", "Selamat Datang");
        return "welcome";
    }
    @RequestMapping ("/drink")
    public String drink (Model model) {
        model.addAttribute("msg", "Mari bersulang");
        //session.setAttribute(,,...//)
        return "welcome";
    }
}
