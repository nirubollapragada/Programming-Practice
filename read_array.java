package datatyp;

import java.util.Scanner;
  

public class read_array {

	public static int n=0;
	private static Scanner scan ;
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
	scan = new Scanner(System.in);
		 
				
		//print_array(int []);
		int j=0;
		
	    int b[]=arry();
		System.out.println(" array elements:");
		for (j=0;j<n;j++)
		{
			System.out.println(b[j]);
		}
		
	}

	public  static int[] arry ()
	{
		int i=0;
		
		int a[] =new int[50];
		System.out.println("enter the number of array elements,max 50");
		n=scan.nextInt();
		System.out.println("enter array elements");
		for(i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		
		return a;
	}
	
		
}


