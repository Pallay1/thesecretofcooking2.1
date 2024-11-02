package com.example.thesecretofcooking20;

public class Recipe {
    private int id;
    private String nombre;
    private String ingredients;
    private int rating;

    public Recipe(int id, String name, String ingredients, int rating) {
        this.id = id;
        this.nombre = name;
        this.ingredients = ingredients;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return nombre;
    }

    public String getIngredients() {
        return ingredients;
    }

    public int getRating() {
        return rating;
    }
}
