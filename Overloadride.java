package com.java.practice;

public class Overloadride {

		
	protected int sum;
	//overload
	public int addition(int no1,int no2)
	{
		
		sum=no1+no2;
		return sum;
		
	}
	
	//overload
		public int addition(int no1,int no2,int no3)
		{
			
			sum=no1+no2+no3;
			return sum;
			
		}
		
		public void print(){
			
			System.out.println("this is from overloadride class");
		}
}
