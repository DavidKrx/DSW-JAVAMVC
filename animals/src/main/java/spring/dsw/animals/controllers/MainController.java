package spring.dsw.animals.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spring.dsw.animals.models.Animal;
import spring.dsw.animals.services.AnimalServices;

import java.util.List;

@Controller
public class MainController {
    private Integer idContador=4;
    private AnimalServices animalServices=new AnimalServices();

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
    public String createAnimal(@ModelAttribute("animal") Animal animal){
        animal.setId(idContador);
        animalServices.addAnimal(animal);
        idContador++;
        return "redirect:/";
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