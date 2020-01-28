package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Model implements IModel {
	
	  private String password;
	  private String username;
	  
	  private String passwordfromdb;
	  private String usernamefromdb;
	  
		public void set(String pass,String user) 
	    {
	        this.password = pass;
	        this.username=user;
	    } 
	    public String getuser() {
			// TODO Auto-generated method stub
			return username;}
		public String getPassword() {
			// TODO Auto-generated method stub
			return password;
		}
			
		public String login1() throws Exception {
				
		Connection con = DriverManager.getConnection("jdbc:sqlserver://106.51.1.63; database = {fresher_ecom_task}", "ecomfresher", "Change@Fresher");
			
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select*from login");
		
		 String result = "Enter valid credinals";

		while(rs.next())
		{
		
		String name  = rs.getString("User_Name");
		
		String password = rs.getString("Password");
		
	   
	    
	    if(name.equalsIgnoreCase(this.username)&&password.equals(this.password)) {
	    	result = "Login successfully";
	    	break;
	    }
	  	     }
		st.close();
		con.close();
		return result;
		}
		}


 