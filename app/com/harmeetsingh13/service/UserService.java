/**
 * 
 */
package com.harmeetsingh13.service;

import java.util.List;
import java.util.Optional;

import com.harmeetsingh13.entities.User;

/**
 * @author Harmeet Singh(Taara)
 *
 */
public interface UserService {

	public Optional<User> findUserById(int id);
	public List<User> getAllUsers();
}
