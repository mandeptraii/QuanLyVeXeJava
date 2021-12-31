/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qldatve.controllers;

//import com.qldatve.service.TuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 *
 * @author Admin
 */
@Controller
@ControllerAdvice
public class HomeController {
//    @Autowired
//    private TuyenService tuyenService;
//    
//    @ModelAttribute
//    public void commonAttrs(Model model){
//        model.addAttribute("Tuyen", this.tuyenService.getTuyen());
//    }
        
    @GetMapping("/")
    public String index(){
        return "baseLayout";
    }
}
