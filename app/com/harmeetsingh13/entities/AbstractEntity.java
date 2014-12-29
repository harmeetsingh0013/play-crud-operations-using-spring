/**
 * 
 */
package com.harmeetsingh13.entities;

import java.util.Date;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;
import play.data.format.Formats.DateTime;
import play.db.ebean.Model;

/**
 * @author Harmeet Singh(Taara)
 *
 */
@MappedSuperclass
@SuppressWarnings({ "serial" })
public abstract class AbstractEntity extends Model {
	
	@Getter @Setter
	@DateTime(pattern="dd-MM-yyyy")
	public Date createdDate;
	@Getter @Setter
	@DateTime(pattern="dd-MM-yyyy")
	public Date updatedDate;
	@Getter @Setter
	public boolean status;
	
}
