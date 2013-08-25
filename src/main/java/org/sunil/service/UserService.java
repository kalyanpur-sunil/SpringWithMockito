package org.sunil.service;

import org.sunil.model.User;

public interface UserService {
	public User validateUser(String username, String password);
	
}
