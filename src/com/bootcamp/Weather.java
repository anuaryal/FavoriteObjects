package com.bootcamp;
//this program is to create an array list//


public class Weather {
	  String name;
	  String temperature;
	  String humidity ;
	  String duration;
	  String description;
	  
	 
	  
	  public String getName(String name) {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getTemperature() {
		return temperature;
	}



	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}



	public String getHumidity() {
		return humidity;
	}



	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}



	public String getDuration() {
		return duration;
	}



	public void setDuration(String duration) {
		this.duration = duration;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	


	public Weather(String name, String temperature, String humidity, String duration, String description) {
		super();
		this.name = name;
		this.temperature = temperature;
		this.humidity = humidity;
		this.duration = duration;
		this.description = description;
	}



	public Weather() {
		super();
	}



	public static void main(String[] args)  { 
		  
	
	    Weather myfavorite = new Weather();
	

	    myfavorite.name = "Summer";
	    myfavorite.temperature = "hot";
	    myfavorite.humidity = "high";
		myfavorite.duration = "May to August";
		myfavorite.description = "Longest day of the year falls in this season";
	   
		
		System.out.println("My all time favorite weather is " + myfavorite.name);
	
		}
	 
	    
	    
	  }
	


	
