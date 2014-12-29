/**
 * 
 */
package com.harmeetsingh13.service.impl;

import java.util.ArrayList;
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
	public Optional<User> findUserById(long id) {
		return userDao.findById(id);
	}

	@Override
	public List<User> getAllUsers() {
		Optional<List<User>> users = userDao.findAll();
		return users.isPresent()? users.get(): new ArrayList<User>();
	}

	@Override
	public boolean addNewUser(User user) {
		return userDao.addNewUser(user);
	}

}
