/**
 * 
 */
package com.harmeetsingh13.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import play.data.validation.Constraints.Required;
/**
 * @author Harmeet Singh(Taara)
 *
 */
@Entity
@Table(name="users")
@ToString(exclude={"role", "department", "car"})
@EqualsAndHashCode(exclude={"age", "name", "role", "department", "car"}, callSuper=true)
public class User extends AbstractEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1277153900011246385L;

	/**
	 * We can also user javax.validation with play framework. For more information go to below link
	 * https://www.playframework.com/documentation/2.2.x/JavaForms
	 * 
	 * For primitive type the playframework automatically fire validations. Still not found any detail, but 
	 * why this happen still dont know.
	 */
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Required
	private String name;
	
	private String age;
	
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role role;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
	
	@ManyToOne
	@JoinColumn(name="car_id")
	private Car car;
	
	public User() {}
	public User(Long id, String name, String age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
}
