package com.bootcamp;

public class fruits {

	String name = "";
	String color;
	String size = "";
	double quantitykg;
	double amountperkg;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getSize() {
		return size;
	}



	public void setSize(String size) {
		this.size = size;
	}



	public double getQuantitykg() {
		return quantitykg;
	}



	public void setQuantitykg(double quantitykg) {
		this.quantitykg = quantitykg;
	}



	public double getAmountperkg() {
		return amountperkg;
	}



	public void setAmountperkg(double amountperkg) {
		this.amountperkg = amountperkg;
	}



	public fruits(String name, String color, String size, double quantitykg, double amountperkg) {
		super();
		this.name = name;
		this.color = color;
		this.size = size;
		this.quantitykg = quantitykg;
		this.amountperkg = amountperkg;
	}



	public fruits() {
		super();
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fruits dinupBuys = new fruits();
		fruits dayaBuys = new fruits();
		fruits prakashBuys = new fruits();
		
		dinupBuys.name = "Apple";
		dinupBuys.color = "Green";
		dinupBuys.size = "Medium";
		dinupBuys.quantitykg = 3;
		dinupBuys.amountperkg = 5;
		
		dayaBuys.name = "Orange";
		dayaBuys.color = "Orange";
		dayaBuys.size = "Small";
		dayaBuys.quantitykg = 4;
		dayaBuys.amountperkg = 6;
		
		prakashBuys.name = "Grapes";
		prakashBuys.color = "Red";
		prakashBuys.size = "Medium";
		prakashBuys.quantitykg = 2;
		prakashBuys.amountperkg = 5;
		
		double dinuptotal = dinupBuys.quantitykg * dinupBuys.amountperkg;
		double dayatotal = dayaBuys.quantitykg * dayaBuys.amountperkg;
		double prakashtotal = prakashBuys.quantitykg * prakashBuys.amountperkg;

		System.out.println("Dinup bought " + dinupBuys.name +"of " + dinupBuys.color + "for "+ dinuptotal + "price" );
		System.out.println("Daya bought " + dayaBuys.name +"of " + dayaBuys.color + "for "+ dayatotal + "price" );
		System.out.println("Prakash bought " + prakashBuys.name +"of " + prakashBuys.color + "for "+ prakashtotal + "price" );
	}

}
