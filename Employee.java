package com.java.practice;

import com.java.practice.employeedata;
import com.java.practice.manager;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employeedata empdata = new employeedata();
		System.out.println("employeedata:  ");
		employeecontact empc=new employeecontact("niru","9898");

		System.out.println("employeeid:  " + empdata.empid+ "name : "+ empc.getname()+ "  Mobile number :"+ empc.getMobileno()
				+ " salary : "+ empdata.sal);
		
		empdata.empid=401;
		empc=new employeecontact("Myth","9999");
		empdata.sal=1500;
		System.out.println("employeeid:  " + empdata.empid+ "  name : "+ empc.getname() + "  Mobile number" +  empc.getMobileno() +
				"  salary : "+ empdata.sal);
        
		manager man =new manager();
		empc=new employeecontact("abc","4444");

		empdata.empid=400;
		empdata.sal=2000;
		man.department="IT";
		System.out.println("employeeid:  " + empdata.empid+ "name : "+ empc.getname() + "  mobile no " +empc.getMobileno()
				
				+ " salary : "+ empdata.sal + "  department :"+ man.department );
        

	}	

}
