package datatyp;

 import java.util.*;
 import datatyp.strbuffclss;
 import datatyp.string_replace;
 import datatyp.palindrme;
 
public class string_reverse {
	private static Scanner inn;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		inn= new Scanner(System.in);
        String org;
     // String[] original; 
         int lengt;

        //create stringbuff variable with stringbuffer class
        strbuffclss strb;
        strb=new strbuffclss();
        string_replace strrplace;
        strrplace =new string_replace();
        
        StringBuffer sBuffers = new StringBuffer(" Donut");
        strb.stringbuff_funct(sBuffers);
        
        // here substring replace
        
        StringBuffer mystrbuff= new StringBuffer("This is my buffer");
        
        strrplace.string_replacefunc(mystrbuff);

        StringBuilder sbuilds =new  StringBuilder("Donut");
        stringbuild_funct(sbuilds);
      
        // here handling palindrome 
        
        palindrme plnd;
        plnd=new palindrme();
        System.out.println("Enter string:");
        org=inn.nextLine();
       // org=org.trim();
        lengt=org.length();
       // System.out.println( "length os atring" +lengt);
      //  original=org.indexOf(org);
        plnd.palindrome_func(org,lengt);
       // plnd.palindrome_func(org,lengt);

         

         


        

         
	}
	
		
   		
	public static void stringbuild_funct(StringBuilder sBuild)
	{
        System.out.println ("**************************************************");

		System.out.println ("original string  "  + sBuild);

        System.out.println (" string reverse using string build  "  + sBuild.reverse());
        System.out.println ("**************************************************");

        
	}
	
	
}


