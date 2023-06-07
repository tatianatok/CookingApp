package me.tokmantseva.cookingapp.controllers;

import me.tokmantseva.cookingapp.model.Recipe;
import me.tokmantseva.cookingapp.services.CookingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipe")

public class CookingController {

    private final CookingService cookingService;

    public CookingController(CookingService cookingService) {
        this.cookingService = cookingService;
    }

    @GetMapping("/addnewrecipe")
    public Recipe addNewRecipe(@RequestParam Recipe recipe) {
        cookingService.addNewRecipe(recipe);
        return recipe;
    }

    @GetMapping("/getrecipe")
    public Recipe getRecipe(@RequestParam Long generatedRecipeNumber) {
        return cookingService.getRecipe(generatedRecipeNumber);
    }
}
