package spring.dsw.animals.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.dsw.animals.repository.AnimalRepository;

@Service
public class AnimalServiceDB implements AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

}
