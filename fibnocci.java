package datatyp;

public class fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;int sum=0, first=1,next,second=0; 
		double avg=0;
		
		System.out.println(" first 20 fibnocci numbers are ");
		//System.out.println (first);
		for( i =0; i<20; i++)
		{
			next=first+second;
			first=second;
			second=next;
			System.out.println (next);
			sum= sum +next;
		}
		
		System.out.println("sum : " + sum);
		System.out.println("average of first 20 fibnocci numbers are");
		avg=sum/20;
		System.out.println (avg);

	}

}
