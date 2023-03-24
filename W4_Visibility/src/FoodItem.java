
public class FoodItem {  

	final private int Calories_per_gram = 9;
	private int fatGrams;		//private --> we cannot access in other classess
	protected int servings;		// protected --> we CAN access
	
	public FoodItem(int fatGrams, int servings) {  //we created constructor
		this.fatGrams=fatGrams;
		this.servings=servings;
	}
	
	private int calories() {	// private --> we cannot access in other classess
		return fatGrams * Calories_per_gram;
	}
	
	public int caloriesPerServing() {
		return (calories() / servings);
	}
}
