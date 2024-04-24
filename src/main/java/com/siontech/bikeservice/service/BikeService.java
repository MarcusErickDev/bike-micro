package com.siontech.bikeservice.service;

import com.siontech.bikeservice.entity.Bike;
import com.siontech.bikeservice.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikeService {

    @Autowired
    BikeRepository BikeRepository;

    public List<Bike> getAll(){
        return BikeRepository.findAll();
    }

    public Bike getBikeById(int id){
        return BikeRepository.findById(id).orElse(null);
    }

    public Bike save(Bike bike){
        Bike bikeNew = BikeRepository.save(bike);
        return bikeNew;
    }

    public List<Bike> byUserId(int userId){
        return BikeRepository.findByUserId(userId);
    }
}
