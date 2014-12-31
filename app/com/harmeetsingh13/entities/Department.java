/**
 * 
 */
package com.harmeetsingh13.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Harmeet Singh(Taara)
 *
 */
@Entity
@Table(name="departments")
@ToString(exclude={"users"})
@EqualsAndHashCode(callSuper=true, exclude={"name", "users"})
public class Department extends AbstractEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8930246414059240278L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@OneToMany(mappedBy="department", fetch=FetchType.LAZY)
	private List<User> users;

	
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

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}
