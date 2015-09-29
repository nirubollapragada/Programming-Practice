package datatyp;
import java.util.Scanner;
public class dup_array {
	private static Scanner scan;

		
		public static void main(String[] args) {
			scan = new Scanner(System.in);
			int i=0,j=0,n=0;
			int a[] =new int[50];
			System.out.println("enter the number of array elements,max 50");
			n=scan.nextInt();
			System.out.println("enter array elements");
				for(i=0;i<n;i++)
				{
					a[i]=scan.nextInt();
				}
			//System.out.println("reverse  array elements");
			for(i=0;i<n ;i++)
			{
				for(j=i+1;j<n;j++)
				{
				if(a[i]==a[j])
				System.out.println("duplicate element "+  a[i]);
			}
		}

		}
}

	



