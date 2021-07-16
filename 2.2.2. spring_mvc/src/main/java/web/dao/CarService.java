package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Lada", "Russia"));
        cars.add(new Car(2, "Fiat", "Italy"));
        cars.add(new Car(3, "Ford", "USA"));
        cars.add(new Car(4, "BMW", "Germany"));
        cars.add(new Car(5, "Renault", "France"));
    }

    public List<Car> allCars(int id) {

        if (id == 0) {
            return cars;
        }
        if (id < 5) {
            return cars.subList(0, id);
        }
        return cars;
    }

}
