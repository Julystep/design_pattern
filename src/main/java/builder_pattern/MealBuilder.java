package builder_pattern;

public class MealBuilder {

    private String meet;
    private String fruit;



    public MealBuilder setMeet(String meet) {
        this.meet = meet;
        return this;
    }

    public MealBuilder setFruit(String fruit) {
        this.fruit = fruit;
        return this;
    }

    public Meal build() {
        Meal meal = new Meal();
        meal.setMeet(meet);
        meal.setFruit(fruit);
        return meal;
    }

}
