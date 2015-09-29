package datatyp;

import java.util.Scanner;

public class bubble_sorting {
	private static Scanner scan ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scan = new Scanner(System.in);
		int i=0,j=0,temp;
		int n=0;
		int a[] =new int[50];
		System.out.println("enter the number of array elements,max 50");
		n=scan.nextInt();
		
		System.out.println("enter array elements");
			for(i=0;i<n;i++)
			{
				a[i]=scan.nextInt();
			}
			boolean swap=true;
			while(swap)
			{
				swap=false;
				j++;
			
			for(i=0;i<=n-j;i++)
			 {
				if (a[i]>a[i+1])
				 {
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					swap=true;
				 }
				
				
			  }
			
	}
			System.out.println("sorted array: ");
			for(i=1;i<=n;i++)
			{
				
				System.out.println(a[i]);
		    }
	}
}
