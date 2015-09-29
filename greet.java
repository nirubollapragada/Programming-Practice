package datatyp;

import java.util.*;

public class greet {
	
	private static Scanner inn;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		inn= new Scanner(System.in);

		System.out.println("enter name\n");
		name=inn.nextLine();
		System.out.println("Hello : "+name );


	}

}
