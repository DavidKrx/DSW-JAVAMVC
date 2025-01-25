package spring.dsw.animals.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@Entity
public class Clase {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer Id;
        @NotNull(message = "Este campo no puede quedar vacío")
        @NotBlank(message = "Este campo no puede estar en blanco")
        @Size(min=3,max=15, message = "Tiene que tener un valor comprendido entre 3 y 15")
        private String Name;
        public Clase (){}


        public Integer getId() {
        return Id;
    }

        public void setId(Integer id) {
        Id = id;
    }

        public @Size(min = 3, max = 15, message = "Tiene que tener un valor comprendido entre 3 y 15") String getName() {
            return Name;
        }

        public void setName(@Size(min = 3, max = 15, message = "Tiene que tener un valor comprendido entre 3 y 15") String name) {
            Name = name;
        }

        @Override
        public String toString() {
            return "Clase{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                '}';
        }
}
