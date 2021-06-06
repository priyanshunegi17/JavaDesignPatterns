import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BuilderPatternTest {

	MealBuilder mealBuilder=null;
	
	@BeforeEach
	public void beforeTest() {
		mealBuilder = new MealBuilder();
	}
	
	@Test
	public void testVegMealBuilder() {
		Meal vegMeal = mealBuilder.prepareVegMeal();
		assertEquals(55.0, vegMeal.getCost());
	}
	
	@Test
	public void testNonVegMealBuilder() {
		Meal NonVegMeal = mealBuilder.prepareNonVegMeal();
		assertEquals(95.0, NonVegMeal.getCost());
	}
}
