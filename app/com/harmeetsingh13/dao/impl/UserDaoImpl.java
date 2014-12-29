/**
 * 
 */
package com.harmeetsingh13.dao.impl;

import java.util.HashSet;
import java.util.Set;

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
public class UserDaoImpl extends GenericDaoImpl<User> implements UserDao{

	private Set<User> users = new HashSet<>();
	public UserDaoImpl() {
		users.add(new User(1l, "James", "25"));
		users.add(new User(2l, "Micky", "28"));
		users.add(new User(3l, "Gunu", "22"));
		users.add(new User(4l, "Monty", "30"));
		users.add(new User(5l, "Trend", "27"));
	}
	
	@Override
	public Set<User> getAllUsers() {
		return users;
	}

	@Override
	public boolean addNewUser(User user) {
		return users.add(user);
	}
}
