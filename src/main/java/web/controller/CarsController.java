package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Cars;
import web.service.CarService;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String carsList (@RequestParam(value = "count", defaultValue = "5") int listCars, Model model) {
        List<Cars> list = new ArrayList<>();
        list.add(new Cars(2000, "Opel", true));
        list.add(new Cars(2002, "Mazda", false));
        list.add(new Cars(2006, "Citroen", true));
        list.add(new Cars(2010, "Tesla", false));
        list.add(new Cars(2012, "Skoda", true));
        list = CarService.carsCount(list, listCars);
        model.addAttribute("list", list);
        return "car";
    }

}
