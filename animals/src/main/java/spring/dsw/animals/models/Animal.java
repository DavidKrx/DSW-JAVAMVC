package spring.dsw.animals.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;


@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @NotNull(message = "Este campo no puede quedar vacío")
    @NotBlank(message = "Este campo no puede estar en blanco")
    @Size(min=3,max=15, message = "Tiene que tener un valor comprendido entre 3 y 15")
    private String Name;
    @NotNull
    @Min(value = 1, message = "El minimo es 1")
    @Max(value = 10, message = "El maximo es 10")
    private Integer AverageLifeAge;
    @NotNull(message = "Este campo no puede ser vacío")
    private boolean Extinct;

    public Animal(){
    }

    public Animal(String name, Integer averageLifeAge, Boolean extinct) {
        Name = name;
        AverageLifeAge = averageLifeAge;
        Extinct = extinct;
    }

    public Animal(Integer id, String name, Integer averageLifeAge, Boolean extinct) {
        Id = id;
        Name = name;
        AverageLifeAge = averageLifeAge;
        Extinct = extinct;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAverageLifeAge() {
        return AverageLifeAge;
    }

    public void setAverageLifeAge(Integer averageLifeAge) {
        AverageLifeAge = averageLifeAge;
    }

    public boolean getExtinct() {
        return Extinct;
    }

    public void setExtinct(boolean extinct) {
        Extinct = extinct;
    }

    @Override
    public String toString() {
        return "Animal:" +"\n" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", AverageLifeAge=" + AverageLifeAge +
                ", IsExtinct=" + Extinct;
    }
}
