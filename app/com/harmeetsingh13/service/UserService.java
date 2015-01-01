/**
 * 
 */
package com.harmeetsingh13.service;

import java.util.List;
import java.util.Optional;

import com.harmeetsingh13.entities.User;
import com.harmeetsingh13.exceptions.ObjectNotFound;
import com.harmeetsingh13.exceptions.ObjectNotPersistInDB;

/**
 * @author Harmeet Singh(Taara)
 *
 */
public interface UserService {

	public Optional<User> findUserById(long id) throws ObjectNotFound ;
	public List<User> getAllUsers() throws ObjectNotFound;
	public void addNewUser(User user) throws ObjectNotPersistInDB ;
}
