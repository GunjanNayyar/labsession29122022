package com.firstjdbc.studentjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    { 
    	try 
    	{
//        	System.out.println( "Hello World!" );
    		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root", "root");
    		// checking if the connection is established or not
//    		Connection con=ConnectionClass.ConnectionCreate();
    		if(con.isClosed())
    		{
    			System.out.println("The connection is close");
    		}
    		else
    		{
    			System.out.println("The connection is established");
    		}
    		// creating the insert statement
//    		String q="insert into student (id, name,age) values(?,?,?)";
//    		PreparedStatement pstmt=con.prepareStatement(q);
//    		
//    		//set the values for the query
////    		Scanner sc=new Scanner(System.in);
////    		System.out.println("Enter the ID:");
////    		int id=sc.nextInt();
//    		pstmt.setInt(1, 102);
//    		pstmt.setString(2, "Neha");
//    		pstmt.setInt(3, 20);
//    		// executing the query
//    		pstmt.executeUpdate();
//    		System.out.println("The data is inserted");
//    		
    		
//    		// update the data in the database
//    		String q="update student set name=?, age=? where id=?";
//    		PreparedStatement pstmt=con.prepareStatement(q);
//    		//taking data from the user
//    		Scanner sc=new Scanner(System.in);
//    		System.out.println("Enter the Id you want to update:");
//    		int id=sc.nextInt();
//    		System.out.println("Enter new name:");
//    		String name=sc.next();
//    		System.out.println("Enter the age:");
//    		int age=sc.nextInt();
//    		//setting the values in the query
//    		pstmt.setString(1, name);
//    		pstmt.setInt(2, age);
//    		pstmt.setInt(3, id);
//    		//execute the prepared statement
//    		pstmt.executeUpdate();
//    		System.out.println("Data updated successfully");
    		//query to delete data from table
//    		String q="Delete from student where id=?";
//    		PreparedStatement pstmt=con.prepareStatement(q);
//    		//taking the data from user
//    		Scanner sc=new Scanner(System.in);
//    		System.out.println("Enter the ID you want to delete:");
//    		int id=sc.nextInt();
//    		//setting the values in the query
//    		pstmt.setInt(1, id);
//    		//execute the prepared statement
//    		pstmt.executeUpdate();
//    		System.out.println("The data is deleted successfully");
    		String q="Select id,name,age from student";
    		PreparedStatement pstmt=con.prepareStatement(q);
    		ResultSet rset=pstmt.executeQuery();
    		
    		while(rset.next())
    		{
    			int id= rset.getInt(1);
    			String name=rset.getString(2);
    			int age= rset.getInt(3);
    			System.out.println("ID: "+id+" "+"Name: "+name+" "+"Age: "+age);
    			
    		}
    		
    		
    		
    		//closing the connection
    		con.close();
    		
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
}
}
