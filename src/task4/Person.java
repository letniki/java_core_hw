package task4;

import java.util.ArrayList;

public class Person {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private ArrayList<Skill> skills;
    private Car car;
    private Gender gender;
    public Person(int id, String name, String surname, String email, int age, Gender gender,ArrayList<Skill> skills,Car car) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.skills = skills;
        this.gender = gender;
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

    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }

    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }
    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", surname: " + surname + ", email: " + email + ", age: " + age + ", gender: " + gender + ", skills: " + skills + ", car: " + car;
    }
}
