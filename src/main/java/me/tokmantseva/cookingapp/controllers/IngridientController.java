package me.tokmantseva.cookingapp.controllers;

import me.tokmantseva.cookingapp.model.Ingridients;
import me.tokmantseva.cookingapp.services.IngridientsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ingridient")

public class IngridientController {

        private final IngridientsService ingridientsService;

        public IngridientController(IngridientsService ingridientsService) {
            this.ingridientsService = ingridientsService;
        }

        @GetMapping("/addnewingridient")
        public Ingridients addNewIngridient(@RequestParam Ingridients ingridient) {
            ingridientsService.addNewIngridient(ingridient);
            return ingridient;
        }

        @GetMapping("/getingridient")
        public Ingridients getIngridient(@RequestParam Long idIngridient) {
            return ingridientsService.getIngridient(idIngridient);
        }
}
