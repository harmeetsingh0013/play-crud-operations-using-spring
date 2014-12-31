/**
 * 
 */
package com.harmeetsingh13.entities;

import java.util.Date;
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
import play.data.format.Formats.DateTime;

/**
 * @author james
 *
 */
@Entity
@Table(name="cars")
@ToString(exclude={"users"})
@EqualsAndHashCode(exclude={"name", "issueDate", "users"}, callSuper=true)
public class Car extends AbstractEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1245098028447758133L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@DateTime(pattern="dd-MM-yyyy")
	private Date issueDate;
	
	@OneToMany(mappedBy="car", fetch=FetchType.LAZY)
	private List<User> users;
	
	public Car() {}
	public Car(long id, String name, Date issueDate){
		this.id = id;
		this.name = name;
		this.issueDate = issueDate;
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
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
}
