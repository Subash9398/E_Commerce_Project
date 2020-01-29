package Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer {

		
		static public Object category() throws SQLException {
			
		Connection con = DriverManager.getConnection("jdbc:sqlserver://106.51.1.63; database = {fresher_ecom_task}", "ecomfresher", "Change@Fresher");
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select*from Category_List");
		
		ArrayList al = new ArrayList();
	
		while(rs.next())
		{
		
		String S_No  = rs.getString("S_No");
		
		String Category_Name = rs.getString("Category_Name");
		
		
		al.add(Category_Name);
	    
		System.out.println(S_No+" "+Category_Name);
	    }

		st.close();
		con.close();
		return al;
	}

}