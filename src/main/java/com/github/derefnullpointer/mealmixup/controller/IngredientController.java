package com.github.derefnullpointer.mealmixup.controller;

import com.github.derefnullpointer.mealmixup.service.IngredientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IngredientController {

    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/ingredients")
    public String listIngredients(Model model) {
        model.addAttribute("ingredients", ingredientService.getAllIngredients());
        return "ingredients/list";
    }
}
