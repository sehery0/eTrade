package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.DataRepository;
import entities.concretes.User;

public class UserRepository implements DataRepository<User> {
	List<User> users = new ArrayList<>();

	@Override
	public void add(User user) {
		users.add(user);	
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		
	}

	@Override
	public void update(User user) {
	}
	
	@Override
	public List<User> getAll() {
		return users;
	}
	
	@Override
	public User getById(int id) {
		return null;
	}

}
