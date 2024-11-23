package com.example.expt18;

public class Details {
	 
	   //Fields to store data
	   public int number;
	   public String name;
	   
	   //Constructor
	   public Details(int number, String name) {
		   this.number = number;
		   this.name = name;
	   }
	   
	   //Getter and Setter methods
	   public int getNumber() {
		   return number;
	   }
	   
	   public void setNumber(int number) {
		   this.number = number;
	   }
	   
	   public String getName() {
		   return name;
		   
	   }
	   
	   public void setName(String name) {
		   this.name = name;
	   }
	   
	    //toString method for easy display
	   @Override
	   public String toString() {
		   return "Details{" +
	              "number=" + number +
	              ", name='" + name + '\'' +'}';
		   
	   
	   }
	   
}
