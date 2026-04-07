package dao;

import models.User;

public interface IUser {
	void save(User user);
	User findByEmail(String email);
}
