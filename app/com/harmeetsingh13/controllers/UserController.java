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
import play.mvc.With;
import views.html.user.all_users;
import views.html.user.add_user;

import com.harmeetsingh13.custannotations.LoggerAnnotation;
import com.harmeetsingh13.entities.User;
import com.harmeetsingh13.interceptors.ExceptionInterceptor;
import com.harmeetsingh13.interceptors.LoggerInterceptor;
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
	
	@LoggerAnnotation(send=false)
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
	
	public Result todoTest() {
		return TODO;
	}
	
	public Result notfoundTest() {
		return notFound("The Not Found Test");
	}
	
	public Result badRequestTest() {
		return badRequest("Bad Request");
	}
	
	@With(value={ExceptionInterceptor.class})
	public Result throwException() throws Exception{
		throw new Exception("This is custom Exception ******* ");
	}
}
