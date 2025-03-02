package spring.dsw.animals.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.dsw.animals.models.Animal;
@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {
}
