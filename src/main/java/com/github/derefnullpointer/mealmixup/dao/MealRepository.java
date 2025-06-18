package com.github.derefnullpointer.mealmixup.dao;

import com.github.derefnullpointer.mealmixup.entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
}
