package spring.dsw.animals.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.dsw.animals.models.Animal;
import spring.dsw.animals.services.AnimalServices;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    public AnimalServices animalServices;


    @GetMapping("/")
    public String animales(Model model){
        model.addAttribute("animales",animalServices.getAllAnimals());
        return "index";
    }

    @GetMapping("/animal/{id}")
    public String getAnimal(@PathVariable Integer id,Model model){
        model.addAttribute("animal",animalServices.getAnimalById(id));
        return "animal/details";
    }

    @GetMapping("/animal/create")
    public String goCreateAnimal(Model model){
        model.addAttribute("animal",new Animal());
        return "animal/crear";
    }

    @PostMapping("/animal/create")
    public String createAnimal(Model model){
        model.addAttribute("despide","Adios mi gente");
        return "/createAnimal";
    }
    @GetMapping("/felicita/{id}")
    public String felicita(@PathVariable Integer id, @RequestParam(defaultValue ="15",required = false) Integer age, @RequestParam(defaultValue = "pedro", required = false) String name, Model model){
        model.addAttribute("id",id);
        model.addAttribute("age",age);
        model.addAttribute("name",name);
        return "felicita";
        /*https://www.thymeleaf.org/*/
    }
}