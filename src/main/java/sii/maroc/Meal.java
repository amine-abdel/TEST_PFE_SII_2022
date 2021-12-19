package sii.maroc;

public class Meal {

	String mealName;
	int servedDishes;
	int cookingDuration;

	public Meal() {

	}

	public Meal(String mealName, int servedDishes, int cookingDuration) {
		this.mealName = mealName;
		this.servedDishes = servedDishes;
		this.cookingDuration = cookingDuration;
	}

	public int servedDishes() {
		// TODO Auto-generated method stub
		return servedDishes;
	}

	public int cookingDuration() {
		// TODO Auto-generated method stub
		return cookingDuration;
	}

}
