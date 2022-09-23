package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    @Override
    public List<Car> getListCar(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("a", "x", "x111xx123"));
        cars.add(new Car("b", "xx", "x222xx123"));
        cars.add(new Car("c", "xxx", "x333xx123"));
        cars.add(new Car("d", "xxxx", "x444xx123"));
        cars.add(new Car("f", "xxxxx", "x555xx123"));

        if (count <= cars.size() && count > 0) {
            return cars.stream().limit(count).toList();
        } else {
            return cars;
        }
    }
}
