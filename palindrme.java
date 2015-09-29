package datatyp;

public class palindrme {
    String reverse="";
   // String rev;
     int i;
     
       
  
        
      public void palindrome_func(String original,int length)
        {

        	  for(i=length-1;i>=0;i--) 
        	   {
        		  //reverse =original.charAt(i);
        		  reverse= reverse+ original.charAt(i);
         		  
        	   }
    	        //rev=String.valueOf(reverse);
                System.out.println ("reverse string:  " + reverse);
          
                if (original.equals(reverse))
                  System.out.println ("string  is palindrome  ");
                else
         	      System.out.println ("string is not palindrome");
                  System.out.println ("**************************************************");

            
        }
}

