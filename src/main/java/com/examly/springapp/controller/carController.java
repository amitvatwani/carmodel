package com.examly.springapp.controller;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.examly.springapp.model.CarModels;
import com.examly.springapp.services.CarService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.repository.query.Param;
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class carController {
    private final CarService carService;

    public carController(CarService carService) {
		this.carService = carService;
	}

    @PostMapping("/saveCar")
    public CarModels addNewCar(@RequestBody CarModels car){
                CarModels newCar = carService.addCar(car);
                return newCar;
    }

    @DeleteMapping("/deleteCar")
    public void deleteCar(@Param("id") String id){
        carService.deleteCar(id);
    }

    @GetMapping("/getCars")
    public List<CarModels> getAllCars(){
        List<CarModels> carList = carService.getCars();
        return carList;
    }

    @GetMapping("/getCar/{id}")
    public CarModels getCarById(@PathVariable(value="id") String id){
        CarModels car = carService.findById(id);
        return car;
    }

    @PostMapping("/editCar")
    public CarModels updateCarDetails(@RequestBody CarModels car, @Param("carId") String id){
        car.setCarId(id);
        CarModels carN = carService.updateCar(car);
        return carN;

    }
}
