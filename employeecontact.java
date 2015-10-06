package com.java.practice;

public  final  class employeecontact extends employeedata {

	
	private final  String name ;
	private final String Mobileno;
	
	public employeecontact(String name,String Mobileno){
		
		this.name=name;
		this.Mobileno=Mobileno;
	}
	
	public String getname()
	{
		return name;
	}
	
	public String getMobileno()
	{
		return Mobileno;
	}
	
}
