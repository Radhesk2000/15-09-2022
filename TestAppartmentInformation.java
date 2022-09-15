package com.arrays.pll;

public class TestAppartmentInformation {
	public static void main(String args[])
	{
		AppartmentInformation ap= new AppartmentInformation("Radheshyam Kumar"); //making an object 
		//setting apartments with their slot
		ap.setApartment("Medica Apartment",0);
		ap.setApartment("Lav Kush Tawer",1);
		ap.setApartment("R.T.C",2);
		ap.setApartment("BALDEV",3);
		ap.setApartment("Mountain Heights",4);
		//
		System.out.println(ap);//will show the toString output which was information of all the apartments
		
		System.out.println("********************");
		// getting the number of apartments the owner owns
		System.out.println(ap.getOwner()+" has " +ap.countApartments()+" apartments"); 
		//getting the information of apartment according to their slots
		System.out.println("Apartment 3 : " + ap.getApartment(2));
		
		System.out.println("*********************");
		ap.reorganizeApartments(); //reorganization of apartments
		
		System.out.println(ap); 
		
		
	}

}
