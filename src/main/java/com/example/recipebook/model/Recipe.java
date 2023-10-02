package com.example.recipebook.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Recipe {

    private String recipeTitle;

    private List<String> ingredients;

    private String description;

    private int cookingTime;




}
