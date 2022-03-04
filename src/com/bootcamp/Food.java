package com.bootcamp;


public class Food {
	  String foodname = "";
	  String foodtype = "";
	  String countryoforigin = "";
	  int year = 1900;
	  String restaurantname = "";

	  public String getFoodname() {
			return foodname;
		}

		public void setFoodname(String foodname) {
			this.foodname = foodname;
		}

		public String getFoodtype() {
			return foodtype;
		}

		public void setFoodtype(String foodtype) {
			this.foodtype = foodtype;
		}

		public String getCountryoforigin() {
			return countryoforigin;
		}

		public void setCountryoforigin(String countryoforigin) {
			this.countryoforigin = countryoforigin;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public String getRestaurantname() {
			return restaurantname;
		}

		public void setRestaurantname(String restaurantname) {
			this.restaurantname = restaurantname;
		}

		public Food(String foodname, String foodtype, String countryoforigin, int year, String restaurantname) {
			super();
			this.foodname = foodname;
			this.foodtype = foodtype;
			this.countryoforigin = countryoforigin;
			this.year = year;
			this.restaurantname = restaurantname;
		}

		public Food() {
			super();
		}
		
	  public static void main(String[] args) {
	  
	    Food chinese = new Food();
	    Food thai = new Food();
	    Food american = new Food();

	    chinese.foodname = "Noodles";
	    chinese.foodtype = "Chinese";
	    chinese.countryoforigin = "China";
	    chinese.year = 1950;
		chinese.restaurantname = "Welcome to China";
		
		thai.foodname = "Pad-thai";
	    thai.foodtype = "Thai";
	    thai.countryoforigin = "Thailand";
	    thai.year = 1940;
		thai.restaurantname = "Eateny";
		
		american.foodname = "Pad-thai";
	    american.foodtype = "Thai";
	    american.countryoforigin = "Thailand";
	    american.year = 1940;
		american.restaurantname = "Eateny";
	   

	    System.out.print("My favorite chinese food is " + chinese.foodname + " and my favorite thai food is " + thai.foodname);
	  	      
	    
	  }
	
	}


	
