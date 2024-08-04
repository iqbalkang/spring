//package com.mvc.basics.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
////@Controller
//public class HelloWorldThymeController {
//
//    @GetMapping("/")
//    public String showForm() {
//        return "show-form";
//    }
//
//    @RequestMapping("/process-form")
//    public String processForm(@RequestParam("name") String name, Model model) {
//        model.addAttribute("name", name);
//        return "process-form";
//    }
//}
