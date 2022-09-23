package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    private CarService service = new CarServiceImpl();

    @RequestMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", required = false, defaultValue = "0") int count, Model model) {
        List<Car> cars = service.getListCar(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}