package com.examly.springapp.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examly.springapp.repo.CarRepo;

import java.security.cert.CertPathValidatorException.Reason;
import java.util.*;
import com.examly.springapp.model.CarModels;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
@Service
public class CarService {
    private final CarRepo carRepo;

    @Autowired
	public CarService(CarRepo carRepo) {
		
		this.carRepo = carRepo;
	}

	public CarModels addCar(CarModels car){
        CarModels newCar = carRepo.save(car);
		return newCar;
    }

	public void deleteCar(String id){
		carRepo.deleteById(id);
	}

	public List<CarModels> getCars(){
		List<CarModels> carList = carRepo.findAll();
		return carList;
	}

	public CarModels findById(String id){
		CarModels car = carRepo.findCarModelsByCarId(id).orElse(null);
		return car;
	}

	public CarModels updateCar(CarModels carModel){
		return carRepo.save(carModel);
	}
    
}
