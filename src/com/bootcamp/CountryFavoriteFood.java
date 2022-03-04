package com.bootcamp;


public class CountryFavoriteFood {
	  String foodName = "";
	  String foodType = "";
	  String countryOfOrigin = "";
	  int year = 1900;
	  String restaurantName = "";

	  
		public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

		
		public String toString() {
			return "CountryFaviroteFood [foodname=" + foodName + ", foodtype=" + foodType + ", countryoforigin=" + countryOfOrigin
					+ ", year=" + year + ", restaurantname=" + restaurantName + "]";
		}

		
		public CountryFavoriteFood(String foodName, String foodType, String countryOfOrigin, int year,
				String restaurantName) {
			super();
			this.foodName = foodName;
			this.foodType = foodType;
			this.countryOfOrigin = countryOfOrigin;
			this.year = year;
			this.restaurantName = restaurantName;
		}


		public CountryFavoriteFood() {
			super();
		}
		
	 
	  }
	



	
