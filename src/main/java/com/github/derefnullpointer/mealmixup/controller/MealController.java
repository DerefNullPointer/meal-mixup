package com.github.derefnullpointer.mealmixup.controller;

import com.github.derefnullpointer.mealmixup.service.MealService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/meals")
public class MealController {

    private final MealService mealService;

    public MealController(MealService mealService) {
        this.mealService = mealService;
    }

    @GetMapping
    public String showMeal(Model model) {
        model.addAttribute("meals", mealService.getAllMeals());

        return "meals";
    }
}
