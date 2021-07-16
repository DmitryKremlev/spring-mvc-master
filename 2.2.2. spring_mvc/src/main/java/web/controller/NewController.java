package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarService;

@Controller
public class NewController {

    private final CarService carService;

    public NewController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false, defaultValue = "0") int count, Model model) {

        if (count < 5) {
            model.addAttribute("messages", carService.allCars().subList(0, count));
        } else {
            model.addAttribute("messages", carService.allCars());
        }
        if (count == 0) {
            model.addAttribute("messages", carService.allCars());
        }
        return "newindex";
    }

}
