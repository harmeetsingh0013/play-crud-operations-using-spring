/**
 * 
 */
package com.harmeetsingh13.service;

import java.util.List;
import java.util.Optional;

import com.harmeetsingh13.entities.User;
import com.harmeetsingh13.exceptions.ObjectNotDelete;
import com.harmeetsingh13.exceptions.ObjectNotFound;
import com.harmeetsingh13.exceptions.ObjectNotPersistInDB;
import com.harmeetsingh13.exceptions.ObjectNotUpdated;

/**
 * @author Harmeet Singh(Taara)
 *
 */
public interface UserService {

	public Optional<User> findUserById(long id) throws ObjectNotFound ;
	public List<User> getAllUsers() throws ObjectNotFound;
	public void addNewUser(User user) throws ObjectNotPersistInDB ;
	public void updateUser(User user)  throws ObjectNotUpdated ;
	public void deleteUser(long id) throws ObjectNotDelete;
}
