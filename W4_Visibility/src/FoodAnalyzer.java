
public class FoodAnalyzer {

	public static void main(String[] args) {  //so we can understand that we can acccess when public and protected but private
		
		Pizza special = new Pizza(275);
		
		System.out.println("Calories per serving: " + special.caloriesPerServing());

	}

}
