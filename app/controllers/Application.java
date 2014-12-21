package controllers;

import java.util.Optional;

import com.harmeetsingh13.entities.User;

import play.mvc.Controller;
import play.mvc.Result;


public class Application extends Controller {

    public static Result index() {
        return ok("Hello World");
    }
    
    public static Result findUserById() {
    	return ok("Hello World");
	}
}
