package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


    @GetMapping("/")
    public String saluda(Model model){
        model.addAttribute("saludo","Hola mi gente");
        return "index";
    }

    @GetMapping("/despedida")
    public String despedir(Model model){
        model.addAttribute("despide","Adios mi gente");
        return "despedida";
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
