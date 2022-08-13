package Cofee.Semicolon.Service;

import Cofee.Semicolon.Data.Model.Coffee;
import Cofee.Semicolon.Data.Repository.CoffeeRepository;
import Cofee.Semicolon.Data.dto.CoffeeInputDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CoffeeService {
    private  final CoffeeRepository coffeeRepository;

    public void addCoffee(CoffeeInputDto coffeeInputDto){
        Coffee coffee = new Coffee();
        coffee.setName(coffeeInputDto.getName());
        coffee.setFlavor(coffeeInputDto.getFlavor());
        coffeeRepository.save(coffee);
    }
}
