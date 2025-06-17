package com.github.derefnullpointer.mealmixup.dao;

import com.github.derefnullpointer.mealmixup.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
