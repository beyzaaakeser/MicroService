package com.tpe.dto;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CarRequest {

    private String brand;

    private String model;

    private Integer doors;

    private Double pricePerHour;

    private Integer age;

}
