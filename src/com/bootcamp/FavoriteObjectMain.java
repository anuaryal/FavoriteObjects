package com.bootcamp;

public class FavoriteObjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CountryFavoriteFood foodFromThailand = new CountryFavoriteFood();
		foodFromThailand.setFoodName("pad-thai");
		foodFromThailand.setFoodType("thai");
		
		CountryFavoriteFood foodFromAmerica = new CountryFavoriteFood();
		foodFromAmerica.setFoodName("burger");
		foodFromAmerica.setFoodType("american");

		CountryFavoriteFood foodFromNepal  = new CountryFavoriteFood("momo","nepali","Tibet",1990,"Curry and Kabob");
		
		System.out.println(foodFromThailand.toString());
		System.out.println(foodFromAmerica.toString());
		System.out.println(foodFromNepal.toString());		
		System.out.println(foodFromNepal.getFoodName());
	}

}


