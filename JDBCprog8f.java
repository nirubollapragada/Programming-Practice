package com.java.practice;
import java.sql.*;

public class JDBCprog8f {
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	 static final String DB_URL = "jdbc:oracle:thin:@hr.cwjgdp1wxdy2.us-west-1.rds.amazonaws.com:1521:ORCL";
	 
	 static final String USER = "hr";
	 static final String PASS = "hr123";
	   
	public static void main(String[] args) {

		 Connection conn = null;
		 Statement stmt = null;
    try{
    	     //driver registration
	          Class.forName("oracle.jdbc.driver.OracleDriver");
	          System.out.println(" driver class loaded!");
	          

       }catch(ClassNotFoundException e){
    	   
    	   System.out.println("Error: unable to load driver class!");
    	   System.exit(1);
       }
        try{
        	//connect
        	  System.out.println("Connecting to database...");
	          conn=DriverManager.getConnection(DB_URL,USER,PASS);
	        
	          //execute querry
	          System.out.println("Creating statement...");
	          stmt = conn.createStatement();
	          String sql;
	          sql = "SELECT Emplyeeid, employeename  FROM Employee1";
	          ResultSet rs=stmt.executeQuery(sql);
	          while(rs.next()){
	              //Retrieve by column name
	              int id  = rs.getInt("Emplyeeid");
	              String first = rs.getString("Employeename");

	              //Display values
	              System.out.print("ID: " + id);
	              System.out.print(", name: " + first+ "\n");
	             // System.out.println(", Last: " + last);
	              
	              
	           }
	         rs.close();
             stmt.close();
              conn.close();
        }catch(Exception ex)
        {
        	System.out.println("not able to connect");
        	ex.printStackTrace();
        	//System.exit(1);
        }finally {
        	   
        	try{
                if(stmt!=null)
                   stmt.close();
            	System.out.println("stmt closed");

             }catch(SQLException se2){
            	 
             }
             try{
                if(conn!=null)
                   conn.close();
            	System.out.println("connection closed");

             }catch(SQLException se){
                se.printStackTrace();
             }
          
        	
        }
    
      
	}
}
