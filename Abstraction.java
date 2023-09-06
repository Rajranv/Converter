package model;

import java.util.ArrayList;
import java.util.List;

public class Abstraction {

	public static void main(String[] args) {
	
		Coffee coffee = getCoffee(3);
		coffee.order();
		
		Beer beer = getBeer(1);
		String beerType = beer.order();
		System.out.println(beerType);
		
		List list = new ArrayList();

	}

	private static Beer getBeer(int orderType) {
		Beer beer = null;
		if (orderType == 1) {
			beer = new CarlsBurg();
		} else if (orderType == 2) {
			beer = new Corona();
		} else if (orderType == 3) {
			beer = new ProperTweleve();
		} 
		return beer;
	}

	private static Coffee getCoffee(int orderType) {
		Coffee coffee = null;
		if (orderType == 1) {
			coffee = new HouseBlendCoffee();
		} else if (orderType == 2) {
			coffee = new Espresso();
		} else if (orderType == 3) {
			coffee = new ColdCoffee();
		} else if (orderType == 4) {
			coffee = new Americano();
		}
		return coffee;
	}

}


abstract class Coffee {
	abstract void order();
}

class HouseBlendCoffee extends Coffee {

	@Override
	void order() {
		System.out.println("HouseBlendCoffee");
	}
	
}

class Espresso extends Coffee {

	@Override
	void order() {
		System.out.println("Espresso");
	}
	
}

class ColdCoffee extends Coffee {

	@Override
	void order() {
		System.out.println("ColdCoffee");
	}
	
}

class Americano extends Coffee {

	@Override
	void order() {
		System.out.println("Americano");
	}
	
}

interface Beer {
	String order();
}

class CarlsBurg implements Beer {

	@Override
	public String order() {
		return "CarlsBurg";
	}
	
}

class Corona implements Beer {

	@Override
	public String order() {
		return "Corona";
	}
	
}

class ProperTweleve implements Beer {

	@Override
	public String order() {
		return "ProperTweleve";
	}
	
}





