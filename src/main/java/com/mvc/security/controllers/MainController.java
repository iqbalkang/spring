package com.mvc.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/")
    public String homePage() {
        List<String> names = Arrays.asList("John", "Jane", "Adam", "Eve");
//        names.sort((s1, s2) -> s1.compareTo(s2));
//        names.sort(String::compareTo);
//        names.sort(new comp());
//        names.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
        System.out.println(names);

        return "homepage";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/leaders")
    public String leaders() {
        return "leaders";
    }

    @GetMapping("/bosses")
    public String bosses() {
        return "bosses";
    }

    @GetMapping("/unauthorized")
    public String unauthorized() {
        return "unauthorized";
    }
}

class comp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
