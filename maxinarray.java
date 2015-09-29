package datatyp;
import java.util.Scanner;

public class maxinarray {
  public static Scanner scan ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // read_array arryr;
			scan = new Scanner(System.in);

		int i=0, j=0,n=0,small=0,large=0;
	    int b[]=new int[50];
	    
	    
	    System.out.println("enter the number of array elements,max 50");
		n=scan.nextInt();
		
		System.out.println(" array elements:");
		
		for (j=0;j<n;j++)
		{
			b[j]=scan.nextInt();
		}
		small=b[0];
	    large=b[0];
		
		for(i=0;i<n;i++)
		{
			
			if   (b[i]<small)
				small=b[i];
			else if (b[i]>large) 
				large=b[i];
			
		}
			
			
		System.out.println("Largest Number: "+ large);
		System.out.println("smallest Number: "+ small);

		
		
		
		}
		
	}


