package com.examly.springapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.examly.springapp.model.CarModels;

public interface CarRepo extends JpaRepository<CarModels, String>{
    Optional<CarModels> findCarModelsByCarId(String id);
}
