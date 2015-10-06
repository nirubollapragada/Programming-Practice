package com.java.practice;

public class square extends shape {
	
	double side1;
	public square() {
        this.side1 = 1;
        
    }
	
	
	public square(double side1) {
        this.side1 = side1;
        
    }
	public double area() {
		// TODO Auto-generated method stub
		double Area;
		Area=side1*side1;
		return Area;
	}

	public double perimeter() {
		// TODO Auto-generated method stub
		
		double perim;
		perim= 4*side1;;
	    return (perim);
	}
	
	
}
