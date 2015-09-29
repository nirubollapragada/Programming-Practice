package datatyp;

public class string_replace {
	
	
	
	public void string_replacefunc(StringBuffer mystrbuff )
	  {
            System.out.println ("**************************************************");
			System.out.println (" string buffer original :  "  + mystrbuff);
			mystrbuff=mystrbuff.replace(0, 4, "That");
			System.out.println (" string buffer after replace  : "  + mystrbuff);
	        System.out.println ("**************************************************");

	  }
	
	
	
}
