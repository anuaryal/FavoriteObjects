package com.bootcamp;
//this program is to create an array list//

import java.util.ArrayList;

public class Travel {
		

	String destination = "";
	String travelername = "";
	int travelyear;
	double duration;
	boolean recommend;

	 

	public String getDestination() {
		return destination;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}



	public String getTravelername() {
		return travelername;
	}



	public void setTravelername(String travelername) {
		this.travelername = travelername;
	}



	public int getTravelyear() {
		return travelyear;
	}



	public void setTravelyear(int travelyear) {
		this.travelyear = travelyear;
	}



	public double getDuration() {
		return duration;
	}



	public void setDuration(double duration) {
		this.duration = duration;
	}



	public boolean isRecommend() {
		return recommend;
	}



	public void setRecommend(boolean recommend) {
		this.recommend = recommend;
	}



	public Travel() {
		super();
	}



	public Travel(String destination, String travelername, int travelyear, double duration, boolean recommend) {
		super();
		this.destination = destination;
		this.travelername = travelername;
		this.travelyear = travelyear;
		this.duration = duration;
		this.recommend = recommend;
	}



	public static void main(String[] args)  { 
		  
		Travel asia = new Travel();
	   

	    asia.destination = "Cambodia";
	    asia.travelername = "Dinup";
	    asia.travelyear = 2018;
		asia.duration = 20;
		asia.recommend = true;
	   

		ArrayList<Travel> autos = new ArrayList<Travel>(); 
		  
		autos.add(asia);
		
	
		for (int i=0; i<autos.size(); i++) {
			 System.out.println(autos.get(i).destination);
			 System.out.println(autos.get(i).travelername);
			 System.out.println(autos.get(i).travelyear);
			 System.out.println(autos.get(i).duration);
			 System.out.println(autos.get(i).recommend);
		}
	 
	    
	    
	  }


	}
	


	
