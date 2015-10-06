package com.java.practice;

public class overloadridetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//class one 
		Overloadride  overlorideex =new Overloadride();
		int add =overlorideex.addition(3, 9);
		System.out.println("This is the addition of 2 nos from Overloadride:   "+ add);
		
		//class two
				
		int sum =overlorideex.addition(10, 11, 12);
		
		System.out.println("This is the addition of 3 nos: "+ sum);
		addoverride addoverloride = new addoverride();
		overlorideex.print();
		addoverloride.print();
		
	}

}
