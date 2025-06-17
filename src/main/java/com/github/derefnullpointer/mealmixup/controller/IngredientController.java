package com.github.derefnullpointer.mealmixup.controller;

import com.github.derefnullpointer.mealmixup.entity.Ingredient;
import com.github.derefnullpointer.mealmixup.service.IngredientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ingredients")
public class IngredientController {

    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping
    public String showIngredientForm(Model model) {
        model.addAttribute("ingredient", new Ingredient());
        model.addAttribute("ingredients", ingredientService.getAllIngredients());
        return "ingredients";
    }
}
