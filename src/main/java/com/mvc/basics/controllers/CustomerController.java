//package com.mvc.basics.controllers;
//
//import com.mvc.basics.entities.Customer;
//import jakarta.validation.Valid;
//import org.springframework.beans.propertyeditors.StringTrimmerEditor;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.InitBinder;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class CustomerController {
//
//    @InitBinder
//    public void trimSpaces(WebDataBinder webDataBinder) {
//        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
//        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
//    }
//
//    @GetMapping("/")
//    public String showCustomerForm(Model model) {
//        Customer customer = new Customer();
//        model.addAttribute("customer", customer);
//        return "show-customer-form";
//    }
//
//    @PostMapping("/process-customer-form")
//    public String processCustomerForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
//        System.out.println(bindingResult.hasErrors());
//        if(bindingResult.hasErrors()) return "show-customer-form";
//        else return "process-customer-form";
//
//    }
//}
