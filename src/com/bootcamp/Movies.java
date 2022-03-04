package com.bootcamp;
//this program is to create an array list//


public class Movies {
	  String name = "";
	  int duration;
	  String country = "";
	  double year;
	  boolean oscarNomination;
	  

	  public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public double getYear() {
		return year;
	}


	public void setYear(double year) {
		this.year = year;
	}


	public boolean isOscarNomination() {
		return oscarNomination;
	}


	public void setOscarNomination(boolean oscarNomination) {
		this.oscarNomination = oscarNomination;
	}


	public Movies(String name, int duration, String country, double year, boolean oscarNomination) {
		super();
		this.name = name;
		this.duration = duration;
		this.country = country;
		this.year = year;
		this.oscarNomination = oscarNomination;
	}


	public Movies() {
		super();
	}


	public static void main(String[] args)  { 
		  
	
	    Movies thriller = new Movies();
	

	    thriller.name = "The Sixth Sense";
	    thriller.duration = 107;
	    thriller.country = "United States";
		thriller.year = 1999;
		thriller.oscarNomination = true;
	   
		System.out.println("My all time favorite movie is " + thriller.name);
	
		}
	 
	    
	    
	  }
	


	
