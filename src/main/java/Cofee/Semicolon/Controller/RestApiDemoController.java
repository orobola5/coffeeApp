package Cofee.Semicolon.Controller;

import Cofee.Semicolon.Data.Model.Coffee;
import Cofee.Semicolon.Data.Repository.CoffeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/coffees")
public class RestApiDemoController {
    private  final CoffeeRepository coffeeRepository;
    public RestApiDemoController(CoffeeRepository coffeeRepository){
        this.coffeeRepository = coffeeRepository;
        this.coffeeRepository.saveAll(List.of(
                    new Coffee(""),
                    new Coffee(""),
                    new Coffee(""),
                    new Coffee(""),
                    new Coffee("")

            ));
        }
        //    @RequestMapping(value = "/student",method = RequestMethod.GET)
        @GetMapping("/coffees")
        Iterable<Coffee> getCoffeeRepository(){
            return coffeeRepository.findAll() ;
        }
        @GetMapping("/coffees/{id}")
        Optional<Coffee> getCoffeeById(@PathVariable String id){
            return coffeeRepository.findById(id);
        }
        @PostMapping("/coffees")
        Coffee postCoffee(@RequestBody Coffee coffee1){
            return coffeeRepository.save(coffee1) ;
        }
        @PutMapping("/{id}")
        ResponseEntity<Coffee> putCoffee(@PathVariable String id, @RequestBody Coffee coffee){
            return (!coffeeRepository.existsById(id)) ?
                    new ResponseEntity<>(coffeeRepository.save(coffee), HttpStatus.CREATED):
                    new ResponseEntity<>(coffeeRepository.save(coffee),HttpStatus.OK);
        }


    }

