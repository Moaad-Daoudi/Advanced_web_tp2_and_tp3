package metiers;

import dao.IUser;
import dao.UserDaoImpl;
import models.User;

public class UserService {

	private IUser userdao = new UserDaoImpl();
	
	public void register(User user) {
		userdao.save(user);
	}

	public User authenticate(String email, String password) {
		User user = userdao.findByEmail(email);
		if(user != null && user.getPassword().equals(password)) {
			return user;
		}
		return null;
	}
}
