/**
 * 
 */
package com.harmeetsingh13.dao.impl;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.inject.Named;
import javax.inject.Singleton;

import com.harmeetsingh13.dao.CarDao;
import com.harmeetsingh13.entities.Car;

/**
 * @author james
 *
 */
@Singleton
@Named("carDaoImpl")
public class CarDaoImpl implements CarDao {

	private Set<Car> cars = new HashSet<Car>();
	
	public CarDaoImpl() {
		cars.add(new Car(1l, "BMW", new Date()));
		cars.add(new Car(2l, "AUDI", new Date()));
		cars.add(new Car(3l, "MERZ", new Date()));
	}
	
	@Override
	public Set<Car> getAllCars() {
		return cars;
	}
}
