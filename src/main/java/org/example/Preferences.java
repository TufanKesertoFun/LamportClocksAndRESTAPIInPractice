package org.example;

import java.util.List;

public class Preferences {

    private List<String> diet;
    private List<String> allergies;
    private List<String> dislikes;
    public Preferences() {};
    public Preferences(List<String> diet, List<String> allergies, List<String> dislikes) {
        this.diet = diet; this.allergies = allergies; this.dislikes = dislikes;
    }

    public List<String> getDiet() {
        return diet;
    }
    public void setDiet(List<String>diet){
        this.diet = diet;
    }

    public List<String> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<String> allergies) {
        this.allergies = allergies;
    }

    public List<String> getDislikes() {
        return dislikes;
    }

    public void setDislikes(List<String> dislikes){
        this.dislikes = dislikes;
    }

    @Override
    public String toString() {
        return "Preferences{'"+ allergies + "', dislikes=" + dislikes + ", diet=" + diet + "}";
    }

}
