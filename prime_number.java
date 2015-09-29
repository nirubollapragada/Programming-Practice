package datatyp;

//import java.util.*;

public class prime_number {
	
	//private static Scanner scann;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //  scann =new Scanner(System.in);
       int primcnt=0,i=0,j=0;
          		  
       System.out.println("prime numbers between 1-100 are : ");
       for(i=1;i<=100;i++)
       {
    	   primcnt=0;
    	   if (i==1)
    	   System.out.println(i);

    	   for (j=i;j>=1;j--)
    	   {
    	 if(i%j==0 )
    		 primcnt=primcnt+1;
    		 
    	   }
    	   if (primcnt==2)
    		   System.out.println(i);
    		   
       }
    	   
       
	}

}
