package sii.maroc;

import java.util.Hashtable;

public class Restaurant {

	private String mozzarella_quantity;

	private String tomato_quantity;

	private String oil_quantity;

	private String pepper_quantity;

	public Restaurant(String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
		mozzarella_quantity = string;
		tomato_quantity = string2;
		oil_quantity = string3;
		pepper_quantity = string4;

	}

	public Restaurant(String string, String string2, String string3, String string4, String string5, String string6) {
		// TODO Auto-generated constructor stub
	}

	public Ticket order(String string) {
		// TODO Auto-generated method stub
		return new Ticket(string);
	}

	public Meal retrieve(Ticket ticket) {
		// TODO Auto-generated method stub
		String order = ticket.getOrder();
		String mealName = GetMealNameOrservedDishes(order, 1);
		int servedDishes = Integer.parseInt(GetMealNameOrservedDishes(order, 0));
		int cookingDuration = CookingDuration(mealName, IMeal.ht1);

		return new Meal(mealName, servedDishes, cookingDuration);

	}

	public String GetMealNameOrservedDishes(String order, int index) {

		String mealNameORservedDishes = order.split(" ", 2)[index];
		System.out.println("mealNameORservedDishes:" + mealNameORservedDishes);
		return mealNameORservedDishes;
	}

	public int CookingDuration(String mealName, Hashtable<String, Integer> HT) {
		int cookingDuration = 0;
		if (HT.containsKey(mealName)) {
			cookingDuration = GetkeyOfValue(mealName, HT);
		}

		return cookingDuration;

	}

	public int GetkeyOfValue(String Key, Hashtable<String, Integer> HT) {

		Integer a = HT.get(Key);

		return a;

	}

}
