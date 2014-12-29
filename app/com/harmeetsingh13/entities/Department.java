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
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Harmeet Singh(Taara)
 *
 */
@Entity
@ToString
@Table(name="departments")
@EqualsAndHashCode(callSuper=false, exclude={"name"})
public class Department extends AbstractEntity{

	@Id
	@Getter @Setter
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	
	@Getter @Setter
	public String name;
	
	@Getter @Setter
	@OneToMany(mappedBy="department", fetch=FetchType.LAZY)
	private List<User> users;
}
