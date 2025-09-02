package org.example;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Preferences prefs = new Preferences(
                Arrays.asList("low-carb", "halal"),
                Arrays.asList("peanut", "shellfish"),
                Arrays.asList("brocoli")
        );

        // NOTE: use Integer for amount if you pass null in last item
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient("chicken breast", 400),
                new Ingredient("garlic", 10),
                new Ingredient("olive oil", null)
        );

        Recipe recipe = new Recipe(
                "r_001",
                "Garlic Lemon Chicken",
                Arrays.asList("Season chicken", "Sear until browned", "Add lemon and simmer 8-10 min"),
                25,
                8.7
        );

        Feedback feedback = new Feedback(
                "r_001",
                Arrays.asList("Used 300g chicken", "Added parsley"),
                9,
                "Turned out juicy: lemon was perfect."
        );

        // --- Serialize individual objects ---
        String prefsJson = Json.writePreferences(prefs);
        String ingredientsJson = Json.writeObject(ingredients);
        String recipeJson = Json.writeObject(recipe);
        String feedbackJson = Json.writeObject(feedback);

        System.out.println("Preferences JSON:\n" + prefsJson);
        System.out.println("Ingredients JSON:\n" + ingredientsJson);
        System.out.println("Recipe JSON:\n" + recipeJson);
        System.out.println("Feedback JSON:\n" + feedbackJson);

        // --- Compose request payloads as Maps and serialize ---
        Map<String, Object> recipeReq = new LinkedHashMap<>();
        recipeReq.put("username", "tufan");
        recipeReq.put("email", "tufan@example.com");
        recipeReq.put("preferences", prefs);
        recipeReq.put("ingredients", ingredients);
        System.out.println(Json.writeObject(recipeReq));

        Map<String, Object> feedbackReq = new LinkedHashMap<>();
        feedbackReq.put("username", "tufan");
        feedbackReq.put("email", "tufan@example.com");
        feedbackReq.put("recipe_feedback", feedback);
        System.out.println(Json.writeObject(feedbackReq));
    }
}
