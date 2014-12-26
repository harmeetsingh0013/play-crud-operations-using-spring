/**
 * 
 */
package com.harmeetsingh13.dao;

import java.util.List;

import com.harmeetsingh13.entities.User;

/**
 * @author Harmeet Singh(Taara)
 *
 */
public interface UserDao {

	public List<User> getAllUsers();
	public boolean addNewUser(User user);
}
