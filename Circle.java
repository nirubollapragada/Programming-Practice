package com.java.practice;

public class Circle extends  shape implements Pii {

	double radius;
	public Circle() {
        this.radius = 1;
        
    }
	
	
	public Circle(double radius) {
        this.radius = radius;
        
    }
	public double area() {
		// TODO Auto-generated method stub
		double Area;
		Area= pi*radius*radius;
		return Area;
	}
	public double perimeter() {
		// TODO Auto-generated method stub
		
		double perim;
		perim= 2*pi*radius;
	    return (perim);
	}
	
	
}
