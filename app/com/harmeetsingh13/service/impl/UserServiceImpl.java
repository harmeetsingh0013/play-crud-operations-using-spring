/**
 * 
 */
package com.harmeetsingh13.service.impl;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.harmeetsingh13.dao.UserDao;
import com.harmeetsingh13.entities.User;
import com.harmeetsingh13.service.UserService;

/**
 * @author Harmeet Singh(Taara)
 *
 */
@Singleton
@Named("userSerivce")
public class UserServiceImpl implements UserService {

	@Inject 
	@Named("userRepo")
	private UserDao	userDao;
		
	@Override
	public Optional<User> findUserById(int id) {
		List<User> users = userDao.getAllUsers();
		Optional<User> result = users.stream().filter(user -> user.id == id).findFirst();
		return result;
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public boolean addNewUser(User user) {
		return userDao.addNewUser(user);
	}

}
