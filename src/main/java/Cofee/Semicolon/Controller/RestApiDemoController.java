package Cofee.Semicolon.Controller;

import Cofee.Semicolon.Data.Model.Coffee;
import Cofee.Semicolon.Data.dto.CoffeeInputDto;
import Cofee.Semicolon.Service.CoffeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/coffee")
public class RestApiDemoController {

    private  final CoffeeService coffeeService;
    @PostMapping("/add-coffee")
    public String addCoffee( @RequestBody CoffeeInputDto coffeeInputDto){
        coffeeService.addCoffee(coffeeInputDto);
        return "Coffee Created";
    }


    //    @RequestMapping(value = "/student",method = RequestMethod.GET)
//        @GetMapping("/coffees")
//        Iterable<Coffee> getCoffeeRepository(){
//            return coffeeRepository.findAll() ;
//        }
//        @GetMapping("/coffees/{id}")
//        Optional<Coffee> getCoffeeById(@PathVariable String id){
//            return coffeeRepository.findById(id);
//        }
//        @PostMapping("/coffees")
//        Coffee postCoffee(@RequestBody Coffee coffee1){
//            return coffeeRepository.save(coffee1) ;
//        }
//        @PutMapping("/{id}")
//        ResponseEntity<Coffee> putCoffee(@PathVariable String id, @RequestBody Coffee coffee){
//            return (!coffeeRepository.existsById(id)) ?
//                    new ResponseEntity<>(coffeeRepository.save(coffee), HttpStatus.CREATED):
//                    new ResponseEntity<>(coffeeRepository.save(coffee),HttpStatus.OK);
//        }
//

    }

