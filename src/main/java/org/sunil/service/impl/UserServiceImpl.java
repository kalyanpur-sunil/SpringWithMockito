package org.sunil.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sunil.dao.UserDao;
import org.sunil.model.User;
import org.sunil.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public User validateUser(String username, String password) {
		return userDao.validateUser(username, password);
	}

}
