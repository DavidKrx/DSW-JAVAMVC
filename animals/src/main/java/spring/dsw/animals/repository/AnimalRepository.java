package spring.dsw.animals.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.dsw.animals.models.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
