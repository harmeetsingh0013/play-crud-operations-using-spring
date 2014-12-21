/**
 * 
 */
package com.harmeetsingh13.entities;

/**
 * @author Harmeet Singh(Taara)
 *
 */
public class User {

	public int id;
	public String name;
	public int age;
	
	public User() {}
	
	public User(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
