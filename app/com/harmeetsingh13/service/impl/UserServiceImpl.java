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
import com.harmeetsingh13.exceptions.ObjectNotFound;
import com.harmeetsingh13.exceptions.ObjectNotPersistInDB;
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
	public Optional<User> findUserById(long id) throws ObjectNotFound {
		try{
			return userDao.findById(id);
		}catch(Exception ex){
			throw new ObjectNotFound("Unable to find user", "1003");
		}
		
	}

	@Override
	public List<User> getAllUsers() throws ObjectNotFound {
		try{
			Optional<List<User>> users = userDao.findAll();
			return users.isPresent()? users.get(): new ArrayList<User>();
		}catch(Exception ex){
			throw new ObjectNotFound("Unable to find users", "1002");
		}
		
	}

	@Override
	public void addNewUser(User user) throws ObjectNotPersistInDB {
		try{
			userDao.save(user);
		}catch(Exception ex){
			throw new ObjectNotPersistInDB("Unable to save user detail", "1001");
		}
	}

}
