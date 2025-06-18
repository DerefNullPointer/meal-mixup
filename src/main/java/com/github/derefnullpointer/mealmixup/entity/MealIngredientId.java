package com.github.derefnullpointer.mealmixup.entity;

import java.io.Serializable;
import java.util.Objects;

public class MealIngredientId implements Serializable {
    private Long meal;
    private Long ingredient;

    public MealIngredientId() {}

    public MealIngredientId(Long meal, Long ingredient) {
        this.meal = meal;
        this.ingredient = ingredient;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MealIngredientId that = (MealIngredientId) o;
        return Objects.equals(meal, that.meal) && Objects.equals(ingredient, that.ingredient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meal, ingredient);
    }
}
