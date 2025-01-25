package spring.dsw.animals.services;

import spring.dsw.animals.models.Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalServiceMem {
    List<Animal> listAnimals = new ArrayList<Animal>(
            Arrays.asList(
                    new Animal(1,"Perro",1,false),
                    new Animal(2,"Gato",10,false),
                    new Animal(3,"Terodactilo",1,true))
    );

    public List<Animal> getAllAnimals() {
        return listAnimals.stream().toList();
    }

    public Animal getAnimalById(Integer id) {
        return listAnimals.get(id);
    }

    public void addAnimal(Animal animal) {
        listAnimals.add(animal);
    }

    public void deleteAnimal(Integer id) {
        listAnimals.remove(id);
    }

    public Animal updateAnimal(Integer id, Animal animalDetails) {
        Animal animal = listAnimals.get(id);
        animal.setName(animalDetails.getName());
        animal.setAverageLifeAge(animalDetails.getAverageLifeAge());
        animal.setExtinct(animalDetails.getExtinct());
        return listAnimals.set(id,animal);
    }
}
