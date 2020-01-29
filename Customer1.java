package Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer1 extends Customer {

	
		static public Object showproduct() throws SQLException {
			
		ArrayList al = new ArrayList();
		
		al=(ArrayList) Customer.category();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select the Category number");
		
		int a = sc.nextInt();
		 
		Connection con = DriverManager.getConnection("jdbc:sqlserver://106.51.1.63; database = {fresher_ecom_task}", "ecomfresher", "Change@Fresher");

		Statement st1 = con.createStatement();
		
		ResultSet rs1 = st1.executeQuery("select*from ProductsDetails");
		
		ResultSet rs2 = st1.executeQuery("select * from ProductsDetails where Category_Name='"+al.get(a-1).toString()+"'");
				
		ArrayList al2 = new ArrayList();
		
		
		while(rs2.next())
		{
		 {
			
			String S_No  = rs2.getString("S_No");
			
			String Product_Name = rs2.getString("Product_Name");
			
			String Product_Description  = rs2.getString("Product_Description");
			
			String Price  = rs2.getString("Price");
			
			System.out.println(S_No+" "+Product_Name+" "+Product_Description+" "+Price);
			
			al2.add(S_No+" "+Product_Name+" "+Product_Description+" "+Price);
			
				}
	    }
		st1.close();
		con.close();
		return al2;
		}
		}