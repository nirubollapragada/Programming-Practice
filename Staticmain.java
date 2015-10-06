package com.java.practice;


public class Staticmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		 
		static8E.Custname="Mythili";
		static8E.custaddress="12213 myway";
		
	
		System.out.println("I am static variable, accessed by class name instead object i am protected : hello "+static8E.Custname );
		System.out.println("I am static variable address, accessed by class name instead object : my add is "+static8E.custaddress );
		
		static8E.custprint();
	}

}
