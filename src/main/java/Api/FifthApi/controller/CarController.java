package Api.FifthApi.controller;

import Api.FifthApi.dto.CarDTO;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping(value = "/cars")
public class CarController {

    @GetMapping(value = "")
    public CarDTO getCar(){
        return new CarDTO("kmsf","Berlina",39999.99);
    }

    @PostMapping("")
    public void postCar(@Valid @RequestBody CarDTO car, HttpServletResponse response){
        System.out.println("Http created : " + car.toString());
        response.setStatus(201);
    }
}
