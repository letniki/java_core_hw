package task2;

import java.util.List;
import java.util.Objects;

public class User implements Comparable<User>{
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private List<Skill> skills;
    private Car car;
    public User() {}
    public User(int id, String name, String surname, String email, int age, Gender gender, List<Skill> skills, Car car) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = car;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }

    public List<Skill> getSkills() {
        return skills;
    }
    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(email, user.email) && gender == user.gender && Objects.equals(skills, user.skills) && Objects.equals(car, user.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, email, age, gender, skills, car);
    }

    @Override
    public String toString() {
        return "{id: " + id + ", name: " + name +
                ", surname: " + surname +
                ", email: " + email +
                ", age: " + age +
                ", gender: " + gender +
                ", skills: " + skills +
                ", car: " + car + '}';
    }

    @Override
    public int compareTo(User o) {
        if(this.skills.size() - o.getSkills().size() != 0){
            return this.skills.size() - o.getSkills().size();
        }
        if(this.name.compareTo(o.getName()) !=0){
            return this.name.compareTo(o.getName());
        }
        return Integer.compare(this.getId() , o.getId());
    }
}
