/**
 * 
 */
package com.harmeetsingh13.controllers;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.user.all_users;
import views.html.user.add_user;

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
	private static final Form<User> userForm = Form.form(User.class);
	
	public Result findUserById(Integer userId) {
		Optional<User> user = userService.findUserById(userId);
		if(user.isPresent()){
			
		}
		return null;
	}
	
	public Result newUsers() {
		return ok(add_user.render(userForm));
	}
	
	public Result saveUser() {
		Form<User> userData = userForm.bindFromRequest();
		if(userData.hasErrors()){
			flash("error", "Please enter valid values");
			return badRequest(add_user.render(userData));
		}
		User user = userData.get();
		boolean result = userService.addNewUser(user);
		if(result){
			flash("success", String.format("Add user success %s", user));
		}else{
			flash("error", String.format("Fail to save user, Please contact admin %s", user));
		}
		return redirect(routes.UserController.newUsers());
	}
	
	public Result getAllUsers(){
		List<User> users = userService.getAllUsers();
		return ok(all_users.render(users));
	}
}
