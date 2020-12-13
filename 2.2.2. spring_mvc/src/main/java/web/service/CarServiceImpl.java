package web.service;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getListCars(String count) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", "X5", "black"));
        carList.add(new Car("VOLVO", "XC90", "green"));
        carList.add(new Car("LADA", "Priora", "baklajan"));
        carList.add(new Car("MB", "GLC250", "braun"));
        carList.add(new Car("MAZDA", "CX5", "red"));
        if (count == null || Integer.parseInt(count) >= 5) {
            return carList;
        } else {
            for (int i = 4; i >= Integer.parseInt(count); i--) {
                carList.remove(i);
            }
            return carList;
        }
    }
}
