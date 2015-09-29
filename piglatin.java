package datatyp;
import java.util.Scanner;

//import javax.print.DocFlavor.STRING;
public class piglatin {

	
	private static Scanner scan ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
         String mywords;
         scan=new Scanner(System.in);

       int wrdcnt=0;
               
         System.out.println("enter the sentence to be converted in pig latin");
         mywords = scan.nextLine();
      // no of words in a given sentence.
         wrdcnt=mywords.split("\\s+").length; 
         Pig_latin(wrdcnt,mywords);
         
       
            
        }
       
         
         
         
		
	
public static void  Pig_latin(int wordcount,String mysentence)
{
	
   int  i=0,j=0,no_of_letters=0;
	String extword []= mysentence.split("\\s+");

	for(i=0;i<=wordcount-1;i++)
	{
	    no_of_letters=extword[i].length();
		for(j=0;j<=no_of_letters-1;j++)
		{
			if (j==no_of_letters-1)
		   	 {
				extword [i]=  extword[i].substring(1, no_of_letters)+extword[i].substring(0, 1);
		}
		 
	}
	
		System.out.print (extword[i]  +  "ay  ");

}

}
}


