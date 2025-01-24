package spring.dsw.animals.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.dsw.animals.models.Clase;

@Repository
public interface ClaseRepository extends JpaRepository<Clase, Integer> {
}
