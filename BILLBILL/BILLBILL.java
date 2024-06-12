package AAA;

import java.util.ArrayList;

public class BILLBILL {
	
	private ArrayList<String> orderedFood;
	private ArrayList<Integer> orderedQuantity;
	public BILLBILL() {
		
		orderedFood = new ArrayList<String>();
		orderedQuantity = new ArrayList<Integer>();
	}
	
	private double totalCost;
	public double getTotal() {
		return totalCost;
	}
	
	public void addOrder(String meal, int quantity, String[] dish, double[] cost) {
		orderedFood.add(meal);
		orderedQuantity.add(quantity);
		for(int i = 0; i < dish.length; i++) {
			if(meal.equals(dish[i])) {
				totalCost += quantity * cost[i];
			}
		}
	}
	
		public void getOrder() {
			for(int i = 0; i < orderedFood.size(); i++) {
				System.out.println(orderedFood.get(i) +
						" " + orderedQuantity.get(i));
			}
		}
		
	}


