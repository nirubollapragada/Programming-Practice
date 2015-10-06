package com.java.practice;

import java.io.InputStreamReader;

public class input_reading {
           private static InputStreamReader ip;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a,b;
          //32+InputStreamReader  ip = new InputStreamReader();
          try{
          System.out.println("Enter 2 numbers");
          a=ip.read();
          }
          catch (Exception e)
          {
              System.out.println("exception occured  : " +  e.getStackTrace());
 
          }
	}

}
