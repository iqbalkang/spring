package com.mvc.basics.controllers;

//import com.rest.hibernate.entities.Student;
import com.mvc.basics.entities.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

//@Controller
public class StudentRestController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${languages}")
    public List<String> languages;

    @Value("${systems}")
    private List<String> systems;

    @GetMapping("/show-student-form")
    public String ShowStudentForm(Model model) {
        Student student = new Student("prince", "trivedi");
        model.addAttribute("student", student);
        model.addAttribute("countries", countries);
        model.addAttribute("languages", languages);
        model.addAttribute("systems", systems);
        return "show-student-form";
    }

    @PostMapping("/process-student-form")
    public String processStudentForm(Model model, @ModelAttribute Student student) {
//        Student student = new Student();
//        student.setFirstName(firstName);
//        model.addAttribute("student", student);
        return "process-student-form";
    }
}
