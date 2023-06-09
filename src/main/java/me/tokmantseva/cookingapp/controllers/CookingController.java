package me.tokmantseva.cookingapp.controllers;

import me.tokmantseva.cookingapp.model.Recipe;
import me.tokmantseva.cookingapp.services.CookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/recipe/")


public class CookingController {

    private final CookingService cookingService;

    public CookingController(CookingService cookingService) {
        this.cookingService = cookingService;
    }

    @GetMapping("/addnewrecipe")//Добавить новый рецепт
    public Recipe addNewRecipe(@RequestParam Recipe recipe) {
        cookingService.addNewRecipe(recipe);
        return recipe;
    }

    @GetMapping("/getrecipe")//Получить рецепт по ID
    public Recipe getRecipe(@RequestParam Long recipeId) {
        return cookingService.getRecipe(recipeId);
    }

    @GetMapping//Получить все рецепты
    public ResponseEntity<Map<Long, Recipe>> getAllRecipe()  {
        Map<Long, Recipe> recipe = cookingService.getAllRecipe();
        if (recipe == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(recipe);
    }

    @PutMapping("/{recipeId}")//Изменить рецепт
    public ResponseEntity<Recipe> putRecipe(@PathVariable Long recipeId, @RequestBody Recipe recipe) {
        Recipe recipe1 = cookingService.putRecipe(recipeId, recipe);
        if (recipe1 == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(recipe);
    }

    @DeleteMapping("/{recipeId}")//Удалить рецепт
    public ResponseEntity<Void> deleteRecipe(@PathVariable Long recipeId) {
        if (cookingService.deleteRecipe(recipeId)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
