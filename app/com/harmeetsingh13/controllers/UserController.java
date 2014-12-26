/**
 * 
 */
package com.harmeetsingh13.controllers;

import java.util.List;
import java.util.Optional;

import play.mvc.Controller;
import play.mvc.Result;

import com.harmeetsingh13.entities.User;
import com.harmeetsingh13.service.UserService;

/**
 * @author Harmeet Singh(Taara)
 *
 */
@Singleton
@Named("userController")
public class UserController extends Controller{

	@Inject 
	@Named("userSerivce")
	private UserService userService;
	
	public Result findUserById(Integer userId) {
		Optional<User> user = userService.findUserById(userId);
		if(user.isPresent()){
			
		}
		return null;
	}
	
	public Result getAllUsers(){
		List<User> users = userService.getAllUsers();
		return ok(all_users.render(users));
	}
}
