package datatyp;

public class coza_woza_loza {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		//for (i=0;i<=110;i++)
		//boolean Scase=true;
       for (i=1;i<110;i++)
		{
    	   
    	  
        if (i%3==0)
			{
				System.out.print(i+ " Coza ");
			}
       
						
         if(i%5==0)
			{
				System.out.print(i+ " Loza ");
			}
         
          
         if (i%7==0)
			{
				System.out.print(i+ " Woza ");
				
			}
        
         if(i%3==0 && i%5==0 )
 		{
 			System.out.print(i+ " coza Loza ");
 		}
       
         if (i%5==0 && i%7==0 )
			{
				System.out.print(i+ "  Loza woza ");
								
			}
    	   if(i%11==0)
    	   System.out.println("  ");
    	   
						
			}
		}

	}


