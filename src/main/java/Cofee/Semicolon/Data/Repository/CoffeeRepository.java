package Cofee.Semicolon.Data.Repository;

import Cofee.Semicolon.Data.Model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee,String> {
}
