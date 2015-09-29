package datatyp;

import java.util.Scanner;;

public class armstron_number {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		scan= new Scanner(System.in);
		  
		int arm=0,i=0,remind=0;
		int n;
		System.out.println("Enter number to check wheather its armstrong or not");
		
		n= scan.nextInt();
		arm=n;
		
		while (n!=0)
		{
			i=n%10;
			n=n/10;
		    remind=remind+i*i*i;

			}

		if(arm==remind)
			System.out.println("number is armstrong numeber");
		else
			System.out.println("number is not armstrong numeber");

             
		
		
		
		

	}

}
