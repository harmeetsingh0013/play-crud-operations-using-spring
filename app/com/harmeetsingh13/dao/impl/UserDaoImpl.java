/**
 * 
 */
package com.harmeetsingh13.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;

import com.harmeetsingh13.dao.UserDao;
import com.harmeetsingh13.entities.User;

/**
 * @author Harmeet Singh(Taara)
 *
 */
@Singleton
@Named("userRepo")
public class UserDaoImpl implements UserDao{

	private List<User> users = new ArrayList<>();
	public UserDaoImpl() {
		users.add(new User(1, "James", 25));
		users.add(new User(2, "Micky", 28));
		users.add(new User(3, "Gunu", 22));
		users.add(new User(4, "Monty", 30));
		users.add(new User(5, "Trend", 27));
	}
	
	@Override
	public List<User> getAllUsers() {
		return users;
	}

	@Override
	public boolean addNewUser(User user) {
		return users.add(user);
	}
}
