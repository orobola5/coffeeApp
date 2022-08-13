package Cofee.Semicolon.Data.Repository;

import Cofee.Semicolon.Data.Model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface CoffeeRepository extends JpaRepository<Coffee,Integer> {
}
