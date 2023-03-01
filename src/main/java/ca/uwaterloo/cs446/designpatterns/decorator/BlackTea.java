package ca.uwaterloo.cs446.designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;

public class BlackTea implements HotBeverage {
    @Override
	public double getCost() {
		return 1.00;
	}

	@Override
	public List<String> getIngredients() {
		List<String> ingredients = new ArrayList<String>();
		ingredients.add("Tea");
		
		return ingredients;
	}
}
