package org.example;

import java.nio.DoubleBuffer;
import java.util.List;

public class Recipe {
    private String recipe_id;
    private String title;
    private List<String> instructions;
    private Integer estimated_time_min;
    private Double avg_rating;
    public Recipe() {}
    public Recipe(String  recipe_id, String title, List<String> instructions, Integer estimated_time_min, Double avg_rating){

        this.recipe_id = recipe_id;
        this.title = title;
        this.instructions = instructions;
        this.estimated_time_min = estimated_time_min;
        this.avg_rating = avg_rating;
    }

    public String getRecipe_id() {
        return  recipe_id;
    }
    public void setRecipe_id(String recipe_id){
        this.recipe_id = recipe_id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public List<String> getInstructions(){
        return instructions;
    }

    public void setInstructions(List<String> instructions) {
        this.instructions = instructions;
    }

    public Integer getEstimated_time_min(){
        return estimated_time_min;
    }

    public void setEstimated_time_min(Integer estimated_time_min){
        this.estimated_time_min = estimated_time_min;
    }

    public Double getAvg_rating(){
        return  avg_rating;
    }

    public void setAvg_rating(Double avg_rating){
        this.avg_rating = avg_rating;
    }
    @Override
    public String toString() {
        return "Recipe{" +
                "recipe_id='" + recipe_id + '\'' +
                ", title='" + title + '\'' +
                ", instructions=" + instructions +
                ", estimated_time_min=" + estimated_time_min +
                ", avg_rating=" + avg_rating +
                '}';
    }
}
