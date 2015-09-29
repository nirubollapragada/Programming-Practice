package datatyp;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		 swaptwo(10,20);   
		swapthree(10,20);
		

	}
	public static  void swaptwo(int a,int b)
	{
		a=a+b;
		b=a-b;
		a= a-b;
		System.out.println("two variable swap no 1: "  + a+  " no2 : " +b);
	}

	public  static void  swapthree(int a,int b)
	{
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("three variable swap no 1: "  + a+  " no2 : " +b);

	}
}
