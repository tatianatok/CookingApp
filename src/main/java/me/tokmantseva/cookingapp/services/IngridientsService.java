package me.tokmantseva.cookingapp.services;

import me.tokmantseva.cookingapp.model.Ingridients;

public interface IngridientsService {
    Ingridients addNewIngridient(Ingridients ingridients);

    Ingridients getIngridient(Long idIngridient);
}
