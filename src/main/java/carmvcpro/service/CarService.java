package carmvcpro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import carmvcpro.pojo.CarPOJO;
import carmvcpro.repository.CarRepository;


@Service
public class CarService {
	
	@Autowired
	private CarRepository repository;

	public CarPOJO addCar(String name, String model , String brand, String fuel, double price) {
		CarPOJO pojo = repository.addCar(name, model, brand, fuel, price);
		return pojo;
	}

	public CarPOJO searchCar(int id) {
		CarPOJO pojo = repository.searchCar(id);
		return pojo;
	}

	public List<CarPOJO> findAllCars() {
		List<CarPOJO> cars = repository.findAllCars();
		return cars;
	}

	public CarPOJO removeCar(int id) {
		CarPOJO pojo = repository.removeCar(id);
		return pojo;
	}

	public CarPOJO updateCar(int id , String name, String model , String brand, String fuel, double price) {
		CarPOJO pojo = repository.updateCar(id, name, model, brand, fuel, price);
		return pojo;
	}

}