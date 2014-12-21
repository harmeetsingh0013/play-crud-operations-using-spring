/**
 * 
 */
package com.harmeetsingh13.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import play.mvc.Controller;
import play.mvc.Result;

import com.harmeetsingh13.entities.User;
import com.harmeetsingh13.service.UserService;

/**
 * @author Harmeet Singh(Taara)
 *
 */

public class UserController extends Controller{

	
	public static Result findUserById(Integer userId) {
		/*Optional<User> user = userService.findUserById(userId);
		if(user.isPresent()){
			
		}*/
		return null;
	}
}
