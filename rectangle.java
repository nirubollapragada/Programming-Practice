package com.java.practice;

public  class rectangle extends shape {

	double widt,lengt;
	public rectangle() {
        this.widt = 1;
        this.lengt = 1;
    }
	
	
	public rectangle(double widt,  double lengt) {
        this.widt = widt;
        this.lengt = lengt;
    }
	public double area() {
		// TODO Auto-generated method stub
		double Area;
		Area=widt*lengt;
		
		return Area;
	}

	public double perimeter() {
		// TODO Auto-generated method stub
		
		double perim;
		perim=2*widt+2*lengt;
	    return (perim);
	}


	
	
	
	}

	


