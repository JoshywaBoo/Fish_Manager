package model;

public class Fish {
    private String type;
    private String name;
    private double daysOwned;
    private double foodPerMeal; // number of food in grams to feed fish per meal

    public Fish(String type, String name, double daysOwned, double foodPerMeal) {
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

    public double getDaysOwned() {
        // returns the fish's type
        return this.daysOwned;
    }

    public void setDaysOwned(double daysOwned) {
        // changes type of fish
        this.daysOwned = daysOwned;
    }

    public double getFoodPerMeal() {
        // returns the fish's type
        return this.foodPerMeal;
    }

    public void setFoodPerMeal(double foodPerMeal) {
        // changes type of fish
        this.foodPerMeal = foodPerMeal;
    }
}