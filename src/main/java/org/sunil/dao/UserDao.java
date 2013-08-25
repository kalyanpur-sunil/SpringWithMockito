package org.sunil.dao;

import org.sunil.model.User;

public interface UserDao {
	public User validateUser(String username, String password);
	
}
