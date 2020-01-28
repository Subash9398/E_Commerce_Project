package Login;

public class Presenter implements IPresenter{
	private IModel model;
	private IView view;

public Presenter(View view, Model model) {
	// TODO Auto-generated constructor stub
	this.model=model;
	this.view=view;
}


public void pass(String pass,String user)
{
	model.set(pass,user);
}
public void login() 
{
   try {
	System.out.println(model.login1());
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}