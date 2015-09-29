package datatyp;

public class merge_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]={12,23,43,33,42};
        int b[]={21,43,55,65,43};
        int merge[]=new int [10];
        int index=0,j=0;
        for(j=0;j<a.length;j++)
        {
              	merge[index]=a[j];
              	merge[index+1]=b[j];
              	index=index+2;;
              
        }
        System.out.println("merged array");
        for(j=0;j<index;j++)
        {
              	
            System.out.println(merge[j]);
 
        }
        

        	
        
        
	}

}
