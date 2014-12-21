/**
 * 
 */
package com.harmeetsingh13.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.harmeetsingh13.dao.UserDao;
import com.harmeetsingh13.entities.User;

/**
 * @author Harmeet Singh(Taara)
 *
 */
@Repository
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
}
