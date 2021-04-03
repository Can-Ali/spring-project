package com.cybertek;

import com.cybertek.entity.Car;
import com.cybertek.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class OrmConfigApplication {

	@Autowired
	CarRepository carRepository;

	public static void main(String[] args) {

		SpringApplication.run(OrmConfigApplication.class, args);
	}

	@PostConstruct
	public void dataInit(){



		Car c1 = new Car("BMW","M5");
		Car c2 = new Car("Kia","Sorento");
		Car c3 = new Car("Mercedes","S500");
		Car c4 = new Car("Volvo","XC60");

		List<Car> cars = new ArrayList<>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);

		carRepository.saveAll(cars);

//		carRepository.save(c1);
//		carRepository.save(c2);
//		carRepository.save(c3);

	}
}
