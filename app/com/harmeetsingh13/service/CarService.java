/**
 * 
 */
package com.harmeetsingh13.service;

import java.util.List;
import java.util.Optional;

import com.harmeetsingh13.entities.Car;

/**
 * @author james
 *
 */
public interface CarService {

	public Optional<Car> findCarById(long id);
	public List<Car> getAllCars();
}
