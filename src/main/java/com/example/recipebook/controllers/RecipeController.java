package com.example.recipebook.controllers;


import com.example.recipebook.model.Recipe;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class RecipeController {

    private List<Recipe> recipeList = new ArrayList<>();

    @GetMapping("/recipes")
    public String displayRecipes(Model model){
        model.addAttribute("recipeList", recipeList);
        return "recipes";
    }

    @GetMapping("/recipe/add")
    public String recipeForm(Model model){
        model.addAttribute("recipe",new Recipe());
        return "addRecipe";
    }

    @PostMapping("/recipe/add")
    public Object recipeSubmit(@ModelAttribute Recipe form){
        recipeList.add(form);
        return "redirect:/recipes";
    }
}
