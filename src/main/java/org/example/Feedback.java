package org.example;

import java.util.List;

public class Feedback {
    private String recipe_id;
    private List<String> tweaks;
    private int rating;
    private String comments;
    public Feedback() {}
    public Feedback(String recipeId, List<String> tweaks, int rating, String comments){
        this.recipe_id = recipeId; this.tweaks = tweaks; this.rating = rating; this.comments = comments;
    }

    public String getRecipe_id() {
        return recipe_id;
    }

    public void setRecipe_id(String recipe_id) {
        this.recipe_id = recipe_id;
    }

    public List<String> getTweaks() {
        return tweaks;
    }

    public void setTweaks(List<String> tweaks) {
        this.tweaks = tweaks;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Feedback{'"+ recipe_id + "', tweaks=" + tweaks + ", rating=" + rating + ", comments=" + comments + "}";
    }


}
