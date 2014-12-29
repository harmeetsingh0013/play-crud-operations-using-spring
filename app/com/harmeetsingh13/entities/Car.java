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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import play.data.format.Formats.DateTime;

/**
 * @author james
 *
 */
@ToString
@Entity
@Table(name="cars")
@EqualsAndHashCode(exclude={"name", "issueDate"}, callSuper=false)
public class Car extends AbstractEntity{
	
	@Id
	@Getter @Setter
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Getter @Setter
	private String name;
	
	@Getter @Setter
	@DateTime(pattern="dd-MM-yyyy")
	private Date issueDate;
	
	@Getter @Setter
	@OneToMany(mappedBy="car", fetch=FetchType.LAZY)
	private List<User> users;
	
	public Car() {}
	public Car(long id, String name, Date issueDate){
		this.id = id;
		this.name = name;
		this.issueDate = issueDate;
	}
}
