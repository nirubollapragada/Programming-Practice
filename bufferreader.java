package datatyp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public abstract class bufferreader extends Reader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		BufferedReader buffread = null;

		try {

			String sreadLine;

			buffread = new BufferedReader(new FileReader("C:\\niru_study\\hello.txt"));

			while ((sreadLine = buffread.readLine()) != null) {
				System.out.println("This is text is from file  : "  +  sreadLine);
			}

		} catch (IOException e) {
			System.out.println("file not found  : ");
			e.printStackTrace();
		} finally {
			try {
				if (buffread != null)buffread.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		
	

}}}