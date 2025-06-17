package com.github.derefnullpointer.mealmixup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String redirectToIngredients() {
        return "redirect:/ingredients";
    }

}
