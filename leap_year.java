package datatyp;

//import java.util.Scanner;


public class leap_year {

	//private static Scanner scan;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //scan = new Scanner(System.in);
        int year=0;
       // System.out.println("enter the year");
        for (year=2015;year<=2040;year++)
        {
        	if (year%4==0)
        	 System.out.println("leap year : " + year);
        	        		
        }
        
        
        
	}

}
