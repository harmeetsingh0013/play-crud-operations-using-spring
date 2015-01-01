/**
 * 
 */
package com.harmeetsingh13.dao;

import java.util.List;
import java.util.Optional;

/**
 * @author Harmeet Singh(Taara)
 *
 */
public interface GenericDao<T> {

	public void save(T object) throws Exception;
	public void delete(T object) throws Exception;
	public void update(T object) throws Exception;
	public Optional<T> findById(long id)throws Exception; 
	public Optional<List<T>> findByProperty(String property, Object value) throws Exception;
	public Optional<List<T>> findAll() throws Exception;
	public void batchUpdate(List<T> objects) ;
}
