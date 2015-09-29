package datatyp;

public class missing_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,9,10};
		int i=0,j=1;
		
		
		for(i=0;i<a.length;i++)
		{
			if(a[i]!=j)
			{
				System.out.println("missing no is " + j );
				j++;
			}
			j++;
		}
		

	}

}
