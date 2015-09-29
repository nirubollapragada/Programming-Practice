package datatyp;

import java.util.Scanner;

public class sumNnos {
	private static Scanner inn ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inn= new Scanner(System.in);
		int i=0,n=0,sum=0;
		System.out.println("enter the no of elements u want to add");
		n=  inn.nextInt();
		
		for(i=1;i<=n;i++)
		{
			//if(i%3==0 || i%5==0)
			sum=sum+i;
		}
		System.out.println("sum of n nos :"+sum);
		
		
          
	}

}
