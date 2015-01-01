/**
 * 
 */
package com.harmeetsingh13.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Optional;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

import com.harmeetsingh13.dao.GenericDao;

/**
 * @author Harmeet Singh(Taara)
 *
 */
@SuppressWarnings({ "unchecked" })
public abstract class GenericDaoImpl<T extends Model> implements GenericDao<T>{

	private Class<T> entity;
	public Finder<Long, T> finder;
	
	{
		ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
		this.entity = (Class<T>) parameterizedType.getActualTypeArguments()[0];
		finder = new Model.Finder<>(Long.class, entity);
	}
	
	@Override
	public void save(T object) throws Exception{
		object.save();
	}

	@Override
	public void delete(T object) throws Exception{
		object.delete();
	}

	@Override
	public void update(T object) throws Exception{
		object.update();
	}

	@Override
	public Optional<T> findById(long id) throws Exception{
		return Optional.of(finder.byId(id));
	}

	@Override
	public Optional<List<T>> findByProperty(String property, Object value) throws Exception{
		return Optional.of(finder.where().eq("property", value).findList());
	}

	@Override
	public Optional<List<T>> findAll() throws Exception{
		return Optional.of(finder.findList());
	}
	
	
	@Override
	public void batchUpdate(List<T> objects) {
		
	}

	
}
