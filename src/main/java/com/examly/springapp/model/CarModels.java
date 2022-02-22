package com.examly.springapp.model;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class CarModels {
    @Id
    private String carId;
    private String carModel;   
    private String carNo;
    private String status;

    

    public CarModels() {

    }

    public CarModels(String carId, String carModel, String carNo, String status) {
        this.carId = carId;
        this.carModel = carModel;
        this.carNo = carNo;
        this.status = status;

    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNumber(String carNo) {
        this.carNo = carNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}