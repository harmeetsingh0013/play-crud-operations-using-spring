/**
 * 
 */
package com.harmeetsingh13.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;
import views.html.user.edit_user;
import views.html.user.add_user;
import views.html.user.all_users;

import com.harmeetsingh13.custannotations.LoggerAnnotation;
import com.harmeetsingh13.entities.Role;
import com.harmeetsingh13.entities.User;
import com.harmeetsingh13.exceptions.ObjectNotDelete;
import com.harmeetsingh13.exceptions.ObjectNotFound;
import com.harmeetsingh13.exceptions.ObjectNotPersistInDB;
import com.harmeetsingh13.exceptions.ObjectNotUpdated;
import com.harmeetsingh13.interceptors.ExceptionInterceptor;
import com.harmeetsingh13.service.CarService;
import com.harmeetsingh13.service.UserService;
import com.harmeetsingh13.utility.CommonEnums;

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
	
	@Inject @Named("carServiceImpl")
	private CarService carService;
	
	private static final Form<User> userForm = Form.form(User.class);
	
	public Result findUserById(long userId) {
		try{
			Optional<User> user = userService.findUserById(userId);
			if(!user.isPresent()){
				return notFound("This user not exist in database");
			}
			Form<User> filledForm = userForm.fill(user.get());
			return ok(edit_user.render(filledForm));
		}catch(ObjectNotFound ex){
			flash("error", ex.toString());
			return ok(edit_user.render(userForm));
		}
	}
	
	public Result updateUser() {
		Form<User> userData = userForm.bindFromRequest();
		if(userData.hasErrors()){
			flash("error", "Please enter valid values");
			return badRequest(edit_user.render(userData));
		}
		
		User user = userData.get();
		try{
			userService.updateUser(user);
			flash("success", String.format("Update user success %s", user));
		}catch(ObjectNotUpdated ex){
			flash("error", ex.getErrorCode()+"-"+ ex.getMessage());
		}
		return redirect(routes.UserController.getAllUsers());
	}
	@LoggerAnnotation(send=false)
	public Result newUsers() {
		return ok(add_user.render(userForm));
	}
	
	public Result saveUser() {
		Form<User> userData = userForm.bindFromRequest(); //This creates a new Product instance and then, for each HTTP parameter 
															//that matches a property by name, sets the value on that property. 
		if(userData.hasErrors()){
			flash("error", "Please enter valid values");
			return badRequest(add_user.render(userData));
		}
		User user = userData.get();
		user.setRole(new Role(CommonEnums.ROLES.USER.getId(), CommonEnums.ROLES.USER.getName()));
		try{
			userService.addNewUser(user);
			flash("success", String.format("Add user success %s", user));
		}catch(ObjectNotPersistInDB ex){
			flash("error", ex.getErrorCode()+"-"+ ex.getMessage());
		}
		
		/*List<Car> cars = user.getCars().stream().map(car -> {
			Optional<Car> tempCar = carService.findCarById(car.getId());
			return tempCar.get();
		}).collect(Collectors.toList());
		user.setCars(cars);*/
		return redirect(routes.UserController.getAllUsers());
	}
	
	public Result getAllUsers(){
		List<User> users = new ArrayList<>();
		try{
			users = userService.getAllUsers();
		}catch(ObjectNotFound ex){
			flash("error", ex.getErrorCode()+"-"+ ex.getMessage());
		}
		//the template only contain list, not set
		return ok(all_users.render(users));
	}
	
	public Result deleteUser(long userId) {
		try{
			userService.deleteUser(userId);
			flash("success", "User delete Successfully");
		}catch(ObjectNotDelete ex){
			flash("error", ex.getErrorCode()+"-"+ ex.getMessage());
		}
		return redirect(routes.UserController.getAllUsers());
	}
	
	
	/* Some different Response Test */
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
