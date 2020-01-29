package Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class AddToCart extends Customer1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
	
	    ArrayList al = new ArrayList();
		
		al=(ArrayList) Customer1.showproduct();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the Product number");
		int b = sc.nextInt();
		
		System.out.println("Buy product - Press 1");
		
		System.out.println("Add to cart - Press2");
		
		int num = sc.nextInt();
		switch(num) 
		{
		case 1: buyproduct(); break;
			
		case 2: addtocart(null); break;
		}
		
	}
	public static void buyproduct() {
		
	}

	public static void addtocart(String username) throws SQLException {
		// TODO Auto-generated method stub
Connection con = DriverManager.getConnection("jdbc:sqlserver://106.51.1.63; database = {fresher_ecom_task}", "ecomfresher", "Change@Fresher");
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("Create table'"+username+"'");
	}

}
