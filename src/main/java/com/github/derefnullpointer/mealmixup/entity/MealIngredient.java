package com.github.derefnullpointer.mealmixup.entity;

import jakarta.persistence.*;

@Entity
@IdClass(MealIngredientId.class)
@Table(name = "meal_ingredient")
public class MealIngredient {

    @Id
    @ManyToOne
    @JoinColumn(name = "meal_id", nullable = false)
    private Meal meal;

    @Id
    @ManyToOne
    @JoinColumn(name = "ingredient_id", nullable = false)
    private Ingredient ingredient;

    public MealIngredient() {}

    public MealIngredient(Meal meal, Ingredient ingredient) {
        this.meal = meal;
        this. ingredient = ingredient;
    }

    public Meal getMeal() {
        return meal;
    }
    public void setMeal(Meal meal) {
        this.meal = meal;
    }
    public Ingredient getIngredient() {
        return ingredient;
    }
    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
