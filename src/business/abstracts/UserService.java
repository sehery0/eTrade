package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {
	void add(User user);
	void update(User user);
	void delete(User user);
	List<User> getAll();
	User getUserById(int id);
	void loginCheck(String email, String password);
	void loginWithGoogle(String mail);

}