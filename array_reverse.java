package datatyp;

import java.util.Scanner;

public class array_reverse {

	private static Scanner scan;
	//private static int as;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		int i=0,n=0;
		int as[] =new int[50];
		System.out.println("enter the number of array elements,max 50");
		n=scan.nextInt();
		System.out.println("enter array elements");
			for(i=0;i<n;i++)
			{
				as[i]=scan.nextInt();
			}
		System.out.println("reverse  array elements");
		for(i=n-1;i>=0;i--)
		{
			//as[i]=scan.nextInt();
			System.out.print(as[i] + " ");
		}
	}

}
