/**
 * 
 */
package com.harmeetsingh13.entities;

import play.data.validation.Constraints.Required;
/**
 * @author Harmeet Singh(Taara)
 *
 */
public class User {
/**
 * We can also user javax.validation with play framework. For more information go to below link
 * https://www.playframework.com/documentation/2.2.x/JavaForms
 */
	public int id;
	@Required
	public String name;
	public String age;
	
	public User() {}
	
	public User(int id, String name, String age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
