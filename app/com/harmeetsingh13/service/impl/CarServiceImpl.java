/**
 * 
 */
package com.harmeetsingh13.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.harmeetsingh13.dao.CarDao;
import com.harmeetsingh13.entities.Car;
import com.harmeetsingh13.service.CarService;

/**
 * @author james
 *
 */
@Singleton
@Named("carServiceImpl")
public class CarServiceImpl implements CarService{

	@Inject @Named("carDaoImpl")
	private CarDao carDao;
	
	@Override
	public Optional<Car> findCarById(long id) {
		Set<Car> cars = carDao.getAllCars();
		return cars.stream().filter(car -> car.getId() == id).findFirst();
	}

	@Override
	public List<Car> getAllCars() {
		return new ArrayList<Car>(carDao.getAllCars());
	}

}
