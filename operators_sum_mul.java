package datatyp;

import java.util.Scanner;

public class operators_sum_mul {
	private static Scanner inn ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,n=0,sum=0;
		char op;
		int mul=1;
		int a[]= new int [50];
		
		inn= new Scanner(System.in);

		System.out.println("enter the no of elements to add or multiply");
		n=  inn.nextInt();
		
		System.out.println("enter array elements");
		
		for(i=0;i<n;i++)
		{
			a[i]=inn.nextInt();
		}
		
		System.out.println("enter which operation u would like to perform,type + or * ");
		
		//char op= (char)system.in.read();
		 op= inn.next().charAt(0);
		
		switch (op)
		{
		
		case '+':
		{
		for(i=0;i<n;i++)
		{
			
			sum=sum+a[i];
		}
		System.out.println("sum of n nos :"+sum);
		break;
		}
		case '*':
		{
			for(i=0;i<n;i++)
			{
				
				mul=mul*a[i];
			}
			System.out.println("mul of"+ n +"nos :"+ mul);
			break;
		}
		default :
			System.out.println("you did not choose add or mul ");
		
		}
	}
	}

