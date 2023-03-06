package builder_pattern;

public class MealDemo {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.setMeet("niu").setFruit("apple").build();

    }

}
