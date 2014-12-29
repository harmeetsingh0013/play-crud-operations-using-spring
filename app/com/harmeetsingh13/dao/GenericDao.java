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

	public void save(T object);
	public void delete(T object);
	public void update(T object);
	public Optional<T> findById(long id);
	public Optional<List<T>> findByProperty(String property, Object value);
	public Optional<List<T>> findAll();
	public void batchUpdate(List<T> objects);
}
