package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		int roll;
		String address;
		String name;
		Scanner s=new Scanner (System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Studentt","root","abc123");
		Statement st=con.createStatement();

		System.out.println("What do you want to update");
		System.out.println("1.Name");
		System.out.println("2.Address");
		System.out.println("Enter the choice");
		int cho=Integer.parseInt(s.nextLine());
		switch(cho)
		{ 
		
		case 1:
		System.out.println("enter the roll no");
		roll=Integer.parseInt(s.nextLine());
		System.out.println("Enter the name");
		name=s.nextLine();
		 int b=st.executeUpdate("UPDATE stu SET name = '"+name+"'  WHERE id = "+roll+"");
            if(b>0){
            	System.out.println("Data updated");
            }
            else{
            	System.out.println("Student not found");
            }
		
				
            break;
            
		case 2:
			boolean update=false;
			System.out.println("enter the roll no");
			roll=Integer.parseInt(s.nextLine());
		
			System.out.println("Enter the address");
			address=s.nextLine();
			
			 int d=st.executeUpdate("UPDATE stu SET address = '"+address+"'  WHERE id = "+roll+"");
	            if(d>0){
	            	System.out.println("Data updated");
	            }
	            else{
	            	System.out.println("Student not found");
	            }
	        break;
		        }
		
		
		
	}

}
