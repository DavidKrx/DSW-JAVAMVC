package spring.dsw.animals.services;

import org.springframework.beans.factory.annotation.Autowired;
import spring.dsw.animals.models.Clase;
import spring.dsw.animals.repository.ClaseRepository;

import java.util.List;

public class ClaseService {
    @Autowired
    private ClaseRepository claseRepository;

    public List<Clase> getAllClases() {
        return claseRepository.findAll();
    }

    public Clase saveClase(Clase clase) {
        return claseRepository.save(clase);
    }
}
