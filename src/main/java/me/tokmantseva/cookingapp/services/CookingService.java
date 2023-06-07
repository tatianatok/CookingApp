package me.tokmantseva.cookingapp.services;

import me.tokmantseva.cookingapp.model.Recipe;

public interface CookingService {

    Recipe addNewRecipe(Recipe recipe);

    Recipe getRecipe(Long recipeNumber);


}
