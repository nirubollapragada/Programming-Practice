package datatyp;
import java.util.Scanner;

public class linear_search {

	 private static Scanner scan;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scan=new Scanner(System.in);

        int i=0,no=0,length;
        boolean status=true;
		int a[] =new int[10];
		System.out.println("enter the number of array elements,max 50");
		length=scan.nextInt();
		System.out.println("enter array elements");
		for(i=0;i<length;i++)
		{
			a[i]=scan.nextInt();
		}
		
		System.out.println("enter number to serach in array");
		no=scan.nextInt();
		for(i=0;i<length;i++)
		{
			if (a[i]==no)
			{
			System.out.println("number found : " + a[i] + " in position  " + i);
			status=false;
			}
		}
		if(status==true)
			System.out.println("number not found ");

		

           
	}

}
