package models;

//import interfaces.AnimalInterface;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String speciesName;
    private String location;
    private int id;
    private static List<Animal> instances = new ArrayList<>();

    public Animal(String speciesName, String location) {
        this.speciesName = speciesName;
        this.location = location;
        this.id = instances.size();
        instances.add(this);
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public String getLocation() {
        return location;
    }

    public int getId() {
        return id;
    }

    public static List<Animal> getInstances() {
        return instances;
    }

    public static Animal newSecuredAnimal() {
        return new Animal("dog", "Shoreline");
    }
}
