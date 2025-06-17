package com.github.derefnullpointer.mealmixup.service;

import com.github.derefnullpointer.mealmixup.dao.IngredientRepository;
import com.github.derefnullpointer.mealmixup.entity.Ingredient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService {

    private final IngredientRepository ingredientRepository;

    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }
}
