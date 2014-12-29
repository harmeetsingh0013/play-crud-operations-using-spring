/**
 * 
 */
package com.harmeetsingh13.dao;

import java.util.Set;

import com.harmeetsingh13.entities.User;

/**
 * @author Harmeet Singh(Taara)
 *
 */
public interface UserDao extends GenericDao<User>{

	public Set<User> getAllUsers();
	public boolean addNewUser(User user);
}
