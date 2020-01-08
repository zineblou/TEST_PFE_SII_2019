package sii.maroc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Restaurant {
	
	private HashMap<String, Integer> ingrediensQts = new HashMap<String, Integer>();
	
	public void addIngrediens() {
		this.ingrediensQts.put("balls Mozzarella", 40);
		this.ingrediensQts.put("tomatoes", 50);
		
	}
	
	public Restaurant(String string, String string2, String string3, String string4)  {
		// TODO Auto-generated constructor stub
		this.addIngrediens();
		List<String> ingrediens = new ArrayList<String>();
		ingrediens.add(string);
		ingrediens.add(string2);
		ingrediens.add(string3);
		ingrediens.add(string4);
		Iterator<String> iterator = ingrediens.iterator();
		int i = 0;
		// remove the olive oil, pepper, water and sea salt , because their quantity is unlimited
		while(iterator.hasNext()) {			
			String nextIngredien = iterator.next();
			if(nextIngredien.equals("olive oil") || nextIngredien.equals("pepper") 
				|| nextIngredien.equals("sea salt") || nextIngredien.equals("water") ) {
				ingrediens.remove(i);
			}
			else {
			String[] QtsAndIngr = nextIngredien.split(" ");
			String orderedItem = "";
			for(int j=1; j<QtsAndIngr.length ; j++) {
				orderedItem+=QtsAndIngr[j];
			}
			int orderedQuantity = Integer.parseInt(QtsAndIngr[0]);
			int existedQuantity = this.ingrediensQts.get(orderedItem);
			if(orderedQuantity > existedQuantity) {
				
				 new UnavailableDishException();
			}			
			}			
			i++;
		}
		
		
		
		//Verify if the first string is a number
		
		
	}

	public Restaurant(String string, String string2, String string3, String string4, String string5, String string6) {
		// TODO Auto-generated constructor stub
		this.addIngrediens();
	}

	public Ticket order(String string) {
		// TODO Auto-generated method stub
		return new Ticket();
	}

	public Meal retrieve(Ticket ticket) {
		// TODO Auto-generated method stub
		return new Meal();
	}


	
}
