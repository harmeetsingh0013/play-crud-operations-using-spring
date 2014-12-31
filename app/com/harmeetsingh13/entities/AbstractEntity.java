/**
 * 
 */
package com.harmeetsingh13.entities;

import java.util.Date;

import javax.persistence.MappedSuperclass;

import lombok.EqualsAndHashCode;
import play.data.format.Formats.DateTime;
import play.db.ebean.Model;

/**
 * @author Harmeet Singh(Taara)
 *
 */
@MappedSuperclass
@SuppressWarnings({ "serial" })
@EqualsAndHashCode(exclude={"createdDate", "updatedDate", "status"}, callSuper=false)
public abstract class AbstractEntity extends Model {
	
	@DateTime(pattern="dd-MM-yyyy")
	public Date createdDate;
	
	@DateTime(pattern="dd-MM-yyyy")
	public Date updatedDate;
	
	public boolean status;
	
}
