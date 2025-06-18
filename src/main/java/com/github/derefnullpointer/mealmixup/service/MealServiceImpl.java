package com.github.derefnullpointer.mealmixup.service;

import com.github.derefnullpointer.mealmixup.dao.MealRepository;
import com.github.derefnullpointer.mealmixup.entity.Meal;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealServiceImpl implements MealService {

    private final MealRepository mealRepository;

    public MealServiceImpl(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    @Override
    public List<Meal> getAllMeals() {
        return mealRepository.findAll();
    }
}
