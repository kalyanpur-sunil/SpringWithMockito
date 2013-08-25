package org.sunil.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;
import org.sunil.dao.UserDao;
import org.sunil.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"classpath:applicationContextTest.xml","classpath:SpringWithMockito-ServletTest.xml"})
@Transactional
public class UserRepositoryTests {
	
	@Autowired
	protected UserDao userDao;
	
	@Autowired
	private WebApplicationContext wac;
	
	@Test
	public void validateUser(){
		String username="sunil";
		String password="sunil";
		User user = userDao.validateUser(username, password);
		assertEquals(user.getUsername(),username );
	}
}
