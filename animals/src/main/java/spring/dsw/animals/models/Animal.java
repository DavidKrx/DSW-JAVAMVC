package spring.dsw.animals.models;

public class Animal {
    private Integer Id;
    private String Name;
    private Integer AverageLifeAge;
    private Boolean Extinct;

    public Animal(){
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

    public Boolean getExtinct() {
        return Extinct;
    }

    public void setExtinct(Boolean extinct) {
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
