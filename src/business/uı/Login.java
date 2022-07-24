package business.uı;

import business.abstracts.UserService;

public class Login {
	private UserService userService;

	public Login(UserService userService) {
		this.userService = userService;
	}
	
	public void Login(String email, String password) {
		//userService.loginCheck(email, password);
	}
	
	public void loginWithGoogle(String mail) {
		userService.loginWithGoogle(mail);
	}
	

}
