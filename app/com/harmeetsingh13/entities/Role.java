/**
 * 
 */
package com.harmeetsingh13.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Harmeet Singh(Taara)
 *
 */
@ToString
@Entity
@Table(name="roles")
@EqualsAndHashCode(callSuper=false, exclude={"name"})
public class Role extends AbstractEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Getter @Setter
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	
	@Getter @Setter
	public String name;
	
	@Getter @Setter
	@OneToMany(mappedBy="role")
	private List<User> users;
	
	public Role() {}
	public Role(long id, String name){
		this.id = id;
		this.name = name;
	}
}
