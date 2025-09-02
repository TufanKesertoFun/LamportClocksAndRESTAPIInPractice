package org.example;

public class Ingredient {
    private String ingredient_name;
    private Integer ingredient_qty;

    public Ingredient() {}

    public Ingredient(String name, Integer qty){
        this.ingredient_name = name;
        this.ingredient_qty = qty;
    }

    public String getIngredient_name(){
        return ingredient_name;
    }

    public void setIngredient_name(String ingredient_name){
        this.ingredient_name = ingredient_name;
    }

    public  Integer getIngredient_qty(){
        return ingredient_qty;
    }

    public void setIngredient_qty(Integer ingredient_qty) {
        this.ingredient_qty = ingredient_qty;
    }

    @Override
    public String toString() {
        return "Ingredient{name='" + ingredient_name + "', qty=" + ingredient_qty + "}";
    }

}
