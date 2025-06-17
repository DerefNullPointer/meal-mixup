package com.github.derefnullpointer.mealmixup.controller;

import com.github.derefnullpointer.mealmixup.entity.Ingredient;
import com.github.derefnullpointer.mealmixup.service.IngredientService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public String addIngredient(@Valid @ModelAttribute Ingredient ingredient,
                                BindingResult result,
                                Model model) {
        if (result.hasErrors()) {
            model.addAttribute("ingredients", ingredientService.getAllIngredients());
            return "ingredients";
        }

        ingredientService.addIngredient(ingredient);
        return "redirect:/ingredients";
    }

    @PostMapping("/delete/{id}")
    public String deleteIngredient(@PathVariable Long id) {
        ingredientService.deleteIngredientById(id);
        return "redirect:/ingredients";
    }
}
