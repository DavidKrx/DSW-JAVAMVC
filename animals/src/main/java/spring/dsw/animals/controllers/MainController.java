package spring.dsw.animals.controllers;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spring.dsw.animals.models.Animal;
import spring.dsw.animals.services.AnimalService;
import spring.dsw.animals.services.ClaseService;

@Controller
public class MainController {
    private AnimalService animalServices=new AnimalService();
    //private ClaseService claseServices=new ClaseService();
    /*
    @GetMapping("/clase")
    public String clases(Model model){
        model.addAttribute("clases",claseServices.getAllClases());
        return "clases/list";
    }

     */

    @GetMapping("/")
    public String animales(Model model){
        model.addAttribute("animales",animalServices.getAllAnimals());
        return "index";
    }

    @GetMapping("/animal/details/{id}")
    public String detailsAnimal(@PathVariable Integer id,Model model){
        Integer a=id-1;
        model.addAttribute("animal",animalServices.getAnimalById(a));
        return "animal/details";
    }
    @GetMapping("/animal/create")
    public String goCreateAnimal(Model model){
        model.addAttribute("animal",new Animal());
        return "animal/create";
    }

    @PostMapping("/animal/create")
    public String createAnimal(@Valid @ModelAttribute("animal") Animal animal){
        animalServices.addAnimal(animal);
        return "redirect:/";
    }

    @GetMapping("/animal/update/{id}")
    public String goUpdateAnimal(@PathVariable Integer id,Model model){
        Integer a=id-1;
        model.addAttribute("animal",animalServices.getAnimalById(a));
        return "animal/update";
    }

    @PutMapping("/animal/update/{id}")
    public String updateAnimal(@Valid @PathVariable Integer id,@ModelAttribute("animal") Animal animal){
        //animal.setId(id);
        animalServices.updateAnimal(id,animal);
        return "redirect:/";
    }

    @GetMapping("/animal/delete/{id}")
    public String goDeleteAnimal(@PathVariable Integer id,Model model){
        model.addAttribute("animal",animalServices.getAnimalById(id));
        return "animal/delete";
    }

    @DeleteMapping("/animal/delete/{id}")
    public String deleteAnimal(@PathVariable Integer id){
        animalServices.deleteAnimal(id);
        return "redirect:/";
    }
}
