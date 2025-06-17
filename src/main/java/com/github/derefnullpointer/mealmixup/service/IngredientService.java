package com.github.derefnullpointer.mealmixup.service;

import com.github.derefnullpointer.mealmixup.entity.Ingredient;

import java.util.List;

public interface IngredientService {

    List<Ingredient> getAllIngredients();

    void addIngredient(Ingredient ingredient);

    void deleteIngredient(Long id);
}
