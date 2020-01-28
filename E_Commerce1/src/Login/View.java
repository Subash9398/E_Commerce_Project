package Login;

import java.util.Scanner;

public class View implements IView {
	private IPresenter presenter; 
	public void userlogin() {
	Scanner scannerObject = new Scanner(System.in);
	System.out.println("Enter the Username");
	String username = scannerObject.nextLine();
	System.out.println("Enter the password");
	String password = scannerObject.nextLine();
	scannerObject.close();
	presenter.pass(password,username);
	presenter.login();
	}

	public void setPresenter(Presenter presenter) {
		// TODO Auto-generated method stub
		this.presenter = presenter;
		userlogin();

	}

	public void updateStatusLabel(String result) {
		// TODO Auto-generated method stub
		System.out.println(result);
	}

	public static void main(String args[]) {
		
		View view=new View();
		view.setPresenter(new Presenter(view,new Model()));
		
	}
}

