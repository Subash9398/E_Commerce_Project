package Login;

public interface IModel  {
	void set(String pass,String user) ;
	String getuser();
	String getPassword();
	String login1() throws Exception;
	
}