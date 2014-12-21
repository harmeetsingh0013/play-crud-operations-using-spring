/**
 * 
 */
package com.harmeetsingh13.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harmeetsingh13.dao.UserDao;
import com.harmeetsingh13.entities.User;
import com.harmeetsingh13.service.UserService;

/**
 * @author Harmeet Singh(Taara)
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao	userDao;
	
	@Override
	public Optional<User> findUserById(int id) {
		List<User> users = userDao.getAllUsers();
		return users.stream().filter(user -> user.id == id).findFirst();
	}

}
