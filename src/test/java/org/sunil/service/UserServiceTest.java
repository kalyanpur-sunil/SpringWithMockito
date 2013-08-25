package org.sunil.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.sunil.dao.UserDao;
import org.sunil.service.impl.UserServiceImpl;

@RunWith(MockitoJUnitRunner.class)
@WebAppConfiguration
@ContextConfiguration(value="classpath:applicationContextTest.xml")
public class UserServiceTest {
	
	@Mock
	UserDao userDao;
	
	@InjectMocks
	UserService userService = new UserServiceImpl();
	
	@Test
	public void testValidateUser(){
		String username = "username";
		String password = "password";
		
	
		//hit service
		userService.validateUser(username, password);
		
		Mockito.verify(userDao).validateUser(username, password);
		
		Mockito.verifyNoMoreInteractions(userDao);
		
	}
}
