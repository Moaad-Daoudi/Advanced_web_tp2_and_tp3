package dao;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import models.User;

public class UserDaoImpl implements IUser {

	private static Map<String, User> userMap = new ConcurrentHashMap<>();
	
	@Override
	public void save(User user) {
		userMap.put(user.getEmail(), user);
	}

	@Override
	public User findByEmail(String email) {
		return userMap.get(email);
	}
}
