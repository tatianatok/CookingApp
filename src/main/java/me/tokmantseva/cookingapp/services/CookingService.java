package me.tokmantseva.cookingapp.services;

import me.tokmantseva.cookingapp.model.Recipe;

import java.util.Map;

public interface CookingService {

    Recipe addNewRecipe(Recipe recipe);

    Recipe getRecipe(Long recipeId);

    Map<Long, Recipe> getAllRecipe();

    Recipe putRecipe(Long idRec, Recipe recipe);

    boolean deleteRecipe(Long recipeId);
}
