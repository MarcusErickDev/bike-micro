package com.siontech.bikeservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="bikes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bike {
//    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String brand;
    private String model;
    private int userId;
}
