package com.java.practice;

public class shapemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double side =4;
		shape square =new square(side);
		 System.out.println("Square side: " + side
	                + " \n area of square  is : " + square.area()
	                + "\n perimeter of square is: " + square.perimeter() + "\n");
		
		
		double width = 3, length = 5;
        shape rectangle = new rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + " \n area of Rectangle is : " + rectangle.area()
                + "\n perimeter of Rectangle is: " + rectangle.perimeter() + "\n");

       
        
        double radius = 6;
        shape Circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
            + "\nResulting Area: " + Circle.area()
            + "\nResulting Perimeter: " + Circle.perimeter() + "\n");

		
		
	}

}
