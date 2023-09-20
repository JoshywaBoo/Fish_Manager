package model;

public class Fish {
    private String type;
    private String name;
    private Double daysOwned;
    private Double foodPerMeal; // number of food in grams to feed fish per meal

    public Fish(String type, String name, Double daysOwned, Double foodPerMeal) {
        this.type = type;
        this.name = name;
        this.daysOwned = daysOwned;
        this.foodPerMeal = foodPerMeal;
    }

    public String getType() {
        // returns the fish's type
        return this.type;
    }

    public void setType(String type) {
        // changes type of fish
        this.type = type;
    }

    public String getName() {
        // returns the fish's type
        return this.name;
    }

    public void setName(String name) {
        // changes type of fish
        this.name = name;
    }

    public Double getDaysOwned() {
        // returns the fish's type
        return this.daysOwned;
    }

    public void setDaysOwned(Double daysOwned) {
        // changes type of fish
        this.daysOwned = daysOwned;
    }

    public Double getFoodPerMeal() {
        // returns the fish's type
        return this.foodPerMeal;
    }

    public void setFoodPerMeal(Double foodPerMeal) {
        // changes type of fish
        this.foodPerMeal = foodPerMeal;
    }
}