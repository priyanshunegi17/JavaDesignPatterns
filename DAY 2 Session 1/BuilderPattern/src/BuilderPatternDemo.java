public class BuilderPatternDemo {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost()+"\n");
		
		Meal NonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("NonVeg Meal");
		NonVegMeal.showItems();
		System.out.println("Total Cost: " + NonVegMeal.getCost());
	}
}