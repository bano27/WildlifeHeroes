package models;

import interfaces.AnimalInterface;

import java.util.ArrayList;
import java.util.List;

public class Animal implements AnimalInterface {
    private String speciesName;
    private String location;
    private int id;
    private static List<Animal> instances = new ArrayList<>();

    public Animal(String speciesName, String location, Integer id){
        this.speciesName = speciesName;
        this.location = location;
        this.id = instances.size();
    }

}
