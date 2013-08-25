package org.sunil.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sunil.dao.UserDao;
import org.sunil.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public User validateUser(String username, String password) {
		Query query =  this.getCurrentSession().createQuery("from User user where user.username=:username and user.password=:password");
		query.setString("username", username);
		query.setString("password", password);
		return (User)query.uniqueResult();
	}

	

}
