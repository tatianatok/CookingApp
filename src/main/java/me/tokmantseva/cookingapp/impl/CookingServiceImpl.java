package me.tokmantseva.cookingapp.impl;

import me.tokmantseva.cookingapp.model.Recipe;
import me.tokmantseva.cookingapp.services.CookingService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CookingServiceImpl implements CookingService {

    private final Map<Long, Recipe> recipes = new HashMap<>();
    private Long generatedRecipeNumber = 1L;

    @Override
    public Recipe addNewRecipe(Recipe recipe) {
        recipes.put(generatedRecipeNumber, recipe);
        generatedRecipeNumber++;
        return recipe;
    }
    @Override
    public Recipe getRecipe(Long recipeNumber) {
        return recipes.get(recipeNumber);
    }
}
