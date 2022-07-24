import business.concretes.UserManager;
import business.uı.Login;
import core.utilities.adapter.GoogleAdapter;
import core.utilities.patterns.RegexMatches;
import dataAccess.concretes.UserRepository;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "Seher", "Yalçın", "seher@gmail.com", "1234567");
		//User user2 = new User(1, "Seher", "Yalçın", "seher@gmail.com", "1234567");
		UserManager userManager = new UserManager(new RegexMatches(), new UserRepository(), new GoogleAdapter());
		
		 userManager.add(user1);
	     Login login = new Login(userManager);
	     login.loginWithGoogle(user1.getEmail());
	     // userManager.add(user2);
	    
	}

}
