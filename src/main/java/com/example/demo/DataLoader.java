package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Car car;
        car = new Car("Volvo", "V50", "2006");
        repository.save(car);

        car = new Car("Kia", "Serento", "2012");
        repository.save(car);

        car = new Car("Toyoda", "Camery", "2000");
        repository.save(car);
    }
}
