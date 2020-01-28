package Login;

public interface IView {
	void userlogin();
	void setPresenter(Presenter presenter);
	void updateStatusLabel(String result);
}

